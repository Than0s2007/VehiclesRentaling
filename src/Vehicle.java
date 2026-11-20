public class Vehicle {
    public static int count = 0;
    private int UID ;
    private  String brand;
    private double rentalPricePerDay;
    private Boolean isAvailabe;
    public Boolean getIsAvailabe() {
        return isAvailabe;
    }
    public void setIsAvailabe(Boolean isAvailabe) {
        this.isAvailabe = isAvailabe;
    }
    public   int getUID() {
        return UID;
    }
    public void setUID(int uID) {
        UID = uID;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public Vehicle( String brand, double rentalPricePerDay,Boolean IsAvailabe) {
        UID = ++count;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
        isAvailabe = IsAvailabe;
    }

    public void ListInfo (){
        System.out.println("Vehicle Type = "+ this.getClass().getSimpleName());
        System.out.println("Vehicle UID = " + getUID());
        System.out.println("Brand Name = "+ getBrand());
        System.out.println("Rental Price Per Day = " + getRentalPricePerDay());
        System.out.println("Vehicle Is Availabel = "+getIsAvailabe());
    }

}
