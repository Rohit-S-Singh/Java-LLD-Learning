package Classes;

import java.time.LocalDateTime;

public class Ticket {

    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    int pricePerHour;
    Vehicle vehicle;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket(ParkingSpot parkingSpot, int pricePerHour, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.pricePerHour = pricePerHour;
        this.vehicle = vehicle;
    }
}
