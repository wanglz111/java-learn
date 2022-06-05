package src.HouseRental.service;

import src.HouseRental.model.House;

public class HouseService {
    House[] houseList;

    public HouseService() {
        houseList = new House[10];
    }

    public House[] listHouse() {
        return houseList;
    }

    // addHouse();
    public void addHouse(House house) {
        for (int i = 0; i < houseList.length; i++) {
            if (houseList[i] == null) {
                houseList[i] = house;
                break;
            }
        }
    }

    // 删除house
    public void deleteHouse(int id) {
        for (int i = 0; i < houseList.length; i++) {
            if (houseList[i] != null && houseList[i].getHouseId() == id) {
                houseList[i] = null;
                break;
            }
        }
    }

    // 修改house
    public void updateHouse(House house) {
        for (int i = 0; i < houseList.length; i++) {
            if (houseList[i] != null && houseList[i].getHouseId() == house.getHouseId()) {
                houseList[i] = house;
                break;
            }
        }
    }

    // 查询house
    public House searchHouse(int id) {
        for (int i = 0; i < houseList.length; i++) {
            if (houseList[i] != null && houseList[i].getHouseId() == id) {
                return houseList[i];
            }
        }
        return null;
    }

}
