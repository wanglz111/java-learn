package src.smallChangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {

    boolean loop = true;
    String details = "======================零钱通明细======================\n";
    Double money = 0.0;
    Double balance = 0.0;
    Date date = null;
    String note = "";

    public void mainMenu() {
        System.out.println("----------------------零钱通菜单----------------------");
    }

    public void details() {
        System.out.println(details);
    }

    public void income() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("收益入账金额:");
        String moneyString = scanner.nextLine();
        money = Double.parseDouble(moneyString);
        balance += money;
        // 校验money
        if (money < 0) {
            System.out.println("收益入账金额不能小于0");
            scanner.close();
            return;
        }
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        details += "收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";
        scanner.close();
    }

    public void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("消费地点:");
        String place = scanner.nextLine();
        System.out.println("消费金额:");
        String costString = scanner.nextLine();
        money = Double.parseDouble(costString);
        if (balance < money) {
            System.out.println("余额不足");
            scanner.close();
            return;
        }
        balance -= money;
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        money = -money;
        details += place + "\t\t" + money + "\t" + sdf.format(date) + "\t" + balance + "\n";
        scanner.close();
    }

    public void exit() {
        System.out.println("是否确认退出?(Y/N)");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine();
        while (!confirm.equals("Y") && !confirm.equals("N")) {
            System.out.println("输入错误,请重新输入:(Y/N)");
            confirm = scanner.nextLine();
        }
        if (confirm.equals("Y")) {
            loop = false;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        SmallChangeOOP smallChangeOOP = new SmallChangeOOP();
        smallChangeOOP.mainMenu();
        while (smallChangeOOP.loop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入需要执行的操作:");
            System.out.println("1.查询零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费记录");
            System.out.println("4.退出");
            System.out.println("请输入操作编号:");
            String number = scanner.nextLine();
            scanner.close();
            switch (number) {
                case "1":
                    smallChangeOOP.details();
                    break;
                case "2":
                    smallChangeOOP.income();
                    break;
                case "3":
                    smallChangeOOP.pay();
                    break;
                case "4":
                    smallChangeOOP.exit();
                    break;
                default:
                    System.out.println("输入错误,请重新输入:");
                    break;
            }
        }
    }
}
