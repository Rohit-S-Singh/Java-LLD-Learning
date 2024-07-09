package Classes;

import jdk.swing.interop.SwingInterOpUtils;

public class ParkingManager {

    Gate gate;
    Vehicle vehicle;
    Ticket ticket;
    ParkingSpot parkingSpot;

    Boolean getEntry(Vehicle vehicle, Gate gate){

        if(!gate.getGateType().equals("ENTRY")){
            System.out.println("You are entering from Exit Gate");
            return false;
        }

        else{
            //availability

            if(checkAvailability(vehicle)){
                this.vehicle = vehicle;
                this.gate = gate;
            }
            else{
                System.out.println("Not Available");
                return false;
            }
        }
        return true;
    }

    Boolean checkAvailability(Vehicle vehicle){

        //write logic
        return true;
    }

    Ticket generateTicket(){

        // find spot

        for(int i = 0 ; i <= ParkingLot.spot.size() ; i++) {

            if (ParkingLot.spot.get(i).getOccupied() == false) {

                ParkingSpot parkHere = new ParkingSpot();
                this.ticket = new Ticket(parkHere, 20, this.vehicle);
            }
        }

        return this.ticket;
    }
}
