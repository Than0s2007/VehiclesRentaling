public class Car extends Vehicle{
    private int numberOfSeats;
    private Boolean isAutomatic;
    
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Boolean getIsAutomatic() {
        return isAutomatic;
    }

    public void setIsAutomatic(Boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public Car( String Brand , double rentPrice,Boolean isAvailabe,int NumberSeats,Boolean Automatic){
        super( Brand, rentPrice,isAvailabe);
        numberOfSeats = NumberSeats;
        isAutomatic = Automatic;
    }


    @Override
    public void ListInfo() {
        super.ListInfo();
        System.out.println("Number Of Seats = "+getNumberOfSeats());
        System.out.println("Is Automatic = "+getIsAutomatic());
    }
    

}
