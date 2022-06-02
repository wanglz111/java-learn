package HouseRental.model;

public class House {
    private int houseId = 1;

    private String name;

    private String telephone;

    private String address;

    private int rent;

    private int status;

    private static int houseIdCounter = 1;

    public House(String name, String telephone, String address, int rent, int status) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
        this.houseId = houseIdCounter;
        houseIdCounter++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return this.rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHouseId() {
        return this.houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String toString() {
        return "houseId=" + this.houseId + ", name=" + this.name + ", telephone=" + this.telephone + ", address="
                + this.address + ", rent=" + this.rent + ", status=" + this.status;
    }

}
