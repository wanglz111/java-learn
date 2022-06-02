package HouseRental.view;

import HouseRental.utils.Utility;

import HouseRental.model.House;

import HouseRental.service.HouseService;

public class HouseView {

    private boolean loop = true;
    private char choice = ' ';
    private HouseService houseService = new HouseService();

    public void mainMenu() {
        do {
            System.out.println("1. 新增房源");
            System.out.println("2. 查询房源");
            System.out.println("3. 删除房源");
            System.out.println("4. 修改房源");
            System.out.println("5. 查询所有房源");
            System.out.println("6. 退出");
            System.out.println("请选择（1-6）：");
            choice = Utility.readChar();

            switch (choice) {
                case '1':
                    System.out.println("请输入姓名：");
                    String name = Utility.readString(5);
                    System.out.println("请输入电话号码：");
                    String phone = Utility.readString(11);
                    System.out.println("请输入地址：");
                    String address = Utility.readString(10);
                    System.out.println("请输入价格：");
                    int price = Utility.readInt(1000);
                    int status = 1;
                    House house = new House(name, phone, address, price, status);
                    houseService.addHouse(house);
                    break;
                case '2':
                    System.out.println("请输入房源编号：");
                    int id = Utility.readInt(1);
                    House a = houseService.searchHouse(id);
                    if (a != null) {
                        System.out.println("姓名：" + a.getName());
                        System.out.println("电话号码：" + a.getTelephone());
                        System.out.println("地址：" + a.getAddress());
                        System.out.println("价格：" + a.getRent());
                        System.out.println("状态：" + a.getStatus());

                    } else {
                        System.out.println("没有找到该房源！");
                    }
                    System.out.println("查询房源");
                    break;
                case '3':
                    System.out.println("请输入房源编号：");
                    id = Utility.readInt(1);
                    houseService.deleteHouse(id);
                    break;
                case '4':
                    System.out.println("请输入房源编号：");
                    id = Utility.readInt(1);
                    House b = houseService.searchHouse(id);

                    System.out.println("请输入姓名：");
                    name = Utility.readString(5, b.getName());
                    System.out.println("请输入电话号码：");
                    phone = Utility.readString(11, b.getTelephone());
                    System.out.println("请输入地址：");
                    address = Utility.readString(10, b.getAddress());
                    System.out.println("请输入价格：");
                    price = Utility.readInt(1000);
                    status = 1;
                    houseService.updateHouse(b);
                    break;
                case '5':
                    System.out.println("==============房屋列表==============");
                    House[] houses = houseService.listHouse();
                    for (House c : houses) {
                        if (c != null) {
                            System.out.println(c);
                        } else {
                            continue;
                        }
                    }
                    System.out.println("======================================");
                    break;
                case '6':
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        } while (loop);


    }
}
