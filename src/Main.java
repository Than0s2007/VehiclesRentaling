import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VehiclesMarket market = new VehiclesMarket();

        // Test Data
        market.AddVehicle(new Car("Toyota Corolla", 45.5, true, 5, true));
        market.AddVehicle(new Car("Hyundai Elantra", 40.0, true, 5, false));
        market.AddVehicle(new Motorcycle("Honda CB500", 25.0, true, 500, false));
        market.AddVehicle(new Motorcycle("Ural", 30.0, true, 750, true));
        market.AddVehicle(new Bicycle("Trek FX1", 10.0, true, 54.0, "City"));
        market.AddVehicle(new Bicycle("Giant MTB", 12.5, false, 50.0, "Mountain"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== Vehicle Market Menu ==========");
            System.out.println("1. List All Vehicles");
            System.out.println("2. List All Available Vehicles");
            System.out.println("3. List All Cars");
            System.out.println("4. List All Motorcycles");
            System.out.println("5. List All Bicycles");
            System.out.println("6. Get Vehicle Info By UID");
            System.out.println("7. Rent Vehicle");
            System.out.println("8. Calculate Rental Cost");
            System.out.println("9. Add New Car");
            System.out.println("10. Add New Motorcycle");
            System.out.println("11. Add New Bicycle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- All Vehicles ---");
                    market.ListAllVehicle();
                    break;

                case 2:
                    System.out.println("--- Available Vehicles ---");
                    market.ListAllAvailableVehicle();
                    break;

                case 3:
                    System.out.println("--- All Cars ---");
                    market.ListAllCarsInfo();
                    break;

                case 4:
                    System.out.println("--- All Motorcycles ---");
                    market.ListAllMotorcycle();
                    break;

                case 5:
                    System.out.println("--- All Bicycles ---");
                    market.ListAllBicycle();
                    break;

                case 6:
                    System.out.print("Enter Vehicle UID: ");
                    market.getVehiceleInfo(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter Vehicle UID to rent: ");
                    market.RentVehicle(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Enter Vehicle UID: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    market.rentalcost(days, uid);
                    break;

                case 9:
                    sc.nextLine(); // consume newline
                    System.out.print("Brand: ");
                    String cBrand = sc.nextLine();
                    System.out.print("Rental price per day: ");
                    double cPrice = sc.nextDouble();
                    System.out.print("Number of seats: ");
                    int seats = sc.nextInt();
                    System.out.print("Is automatic (true/false): ");
                    boolean auto = sc.nextBoolean();
                    market.AddVehicle(new Car(cBrand, cPrice, true, seats, auto));
                    System.out.println("Car added successfully.");
                    break;

                case 10:
                    sc.nextLine();
                    System.out.print("Brand: ");
                    String mBrand = sc.nextLine();
                    System.out.print("Rental price per day: ");
                    double mPrice = sc.nextDouble();
                    System.out.print("Engine CC: ");
                    double cc = sc.nextDouble();
                    System.out.print("Has sidecar (true/false): ");
                    boolean side = sc.nextBoolean();
                    market.AddVehicle(new Motorcycle(mBrand, mPrice, true, cc, side));
                    System.out.println("Motorcycle added successfully.");
                    break;

                case 11:
                    sc.nextLine();
                    System.out.print("Brand: ");
                    String bBrand = sc.nextLine();
                    System.out.print("Rental price per day: ");
                    double bPrice = sc.nextDouble();
                    System.out.print("Frame size: ");
                    double frame = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Made for: ");
                    String madeFor = sc.nextLine();
                    market.AddVehicle(new Bicycle(bBrand, bPrice, true, frame, madeFor));
                    System.out.println("Bicycle added successfully.");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}