import java.util.*;

public class VehiclesMarket {
    public ArrayList<Vehicle> Market = new ArrayList<Vehicle>();

    public void AddVehicle(Vehicle v) {
        this.Market.add(v);
    }

    private String GetVehicleType(Vehicle v) {
        return v.getClass().getSimpleName();
    }

    private Vehicle FindVehicle(int UID) {
        for (Vehicle v : Market) {
            if (v.getUID() == UID) return v;
        }
        return null;
    }

    public void ListAllVehicle() {
        if (Market.isEmpty()) {
            System.out.println("Empty Market");
            return;
        }
        for (Vehicle v : Market){
            System.out.println("__________________________________");
            v.ListInfo();
            System.out.println("__________________________________");
        }
    }

    public void ListAllAvailableVehicle() {
        boolean found = false;
        for (Vehicle v : Market) {
            if (v.getIsAvailabe()) {
            System.out.println("__________________________________");
            v.ListInfo();
            System.out.println("__________________________________"); 
                found = true;
            }
        }
        if (!found) System.out.println("No Available Vehicles.");
    }

    public void ListAllCarsInfo() {
        for (Vehicle v : Market){
            System.out.println("__________________________________");
            if (v instanceof Car) v.ListInfo();
            System.out.println("__________________________________");
        }
    }

    public void ListAllMotorcycle() {
        for (Vehicle v : Market){
            System.out.println("__________________________________");
            if (v instanceof Motorcycle) v.ListInfo();
            System.out.println("__________________________________");
        }
    }

    public void ListAllBicycle() {
        for (Vehicle v : Market)
            if (v instanceof Bicycle){ 
                System.out.println("__________________________________");
                v.ListInfo();
                System.out.println("__________________________________");
            }
    }

    public void RentVehicle(int UID) {
        Vehicle vehicle = FindVehicle(UID);
        if (vehicle == null) {
            System.out.println("Not Exist Vehicle UID : " + UID);
            return;
        }
        if (!vehicle.getIsAvailabe()) {
            System.out.println("Vehicle " + UID + " is already rented.");
            return;
        }
        vehicle.setIsAvailabe(false);
        System.out.println("Vehicle " + UID + " rented successfully.");
    }

    public void rentalcost(int days, int UID) {
        Vehicle vehicle = FindVehicle(UID);
        if (vehicle == null) {
            System.out.println("Not Exist Vehicle UID : " + UID);
            return;
        }
        System.out.println("Will Cost You " + (vehicle.getRentalPricePerDay() * days));
    }

    public void getVehiceleInfo(int uid) {
        Vehicle vehicle = FindVehicle(uid);
        if (vehicle == null) {
            System.out.println("Not Exist Vehicle UID : " + uid);
            return;
        }
        System.out.println("__________________________________");
        vehicle.ListInfo();
        System.out.println("__________________________________");
    }
}