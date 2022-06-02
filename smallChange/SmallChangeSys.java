package smallChange;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmallChangeSys {
    public static void main(String[] args) {

        boolean loop = true;
        String details = "======================零钱通明细======================\n";
        Double money = 0.0;
        Double balance = 0.0;
        Date date = null;

        do {
            System.out.println("----------------------零钱通菜单----------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入需要执行的操作:");
            System.out.println("1.查询零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费记录");
            System.out.println("4.退出");
            System.out.println("请输入操作编号:");
            String typeString = scanner.nextLine();
            int type = Integer.parseInt(typeString);
            scanner.close();
            switch (type) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("收益入账金额:");
                    String moneyString = scanner.nextLine();
                    money = Double.parseDouble(moneyString);
                    balance += money;
                    // 校验money
                    if (money < 0) {
                        System.out.println("收益入账金额不能小于0");
                        break;
                    }
                    date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    details += "收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";
                    break;
                case 3:
                    System.out.println("消费地点:");
                    String place = scanner.nextLine();
                    System.out.println("消费金额:");
                    String costString = scanner.nextLine();
                    money = Double.parseDouble(costString);
                    if (balance < money) {
                        System.out.println("余额不足");
                        break;
                    }
                    balance -= money;
                    date = new Date();
                    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    money = -money;
                    details += place+ "\t\t" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";

                    break;
                case 4:
                    System.out.println("是否确认退出?(Y/N)");
                    String confirm = scanner.nextLine();
                    while (!confirm.equals("Y") && !confirm.equals("N")) {
                        System.out.println("输入错误,请重新输入:(Y/N)");
                        confirm = scanner.nextLine();
                    }
                    if (confirm.equals("Y")) {
                        loop = false;
                    }
                    break;
                default:
                    break;
            }
        } while (loop);

    }
}
