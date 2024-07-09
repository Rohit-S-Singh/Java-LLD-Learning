package Classes;


public class Vehicle {

    String Number;
    VehicleType type;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Vehicle(String number, VehicleType type) {
        Number = number;
        this.type = type;
    }


}
