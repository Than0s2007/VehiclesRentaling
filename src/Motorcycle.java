public class Motorcycle extends Vehicle{
    private double cc;
    private Boolean haveSidecar;

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public Boolean getHaveSidecar() {
        return haveSidecar;
    }

    public void setHaveSidecar(Boolean haveSidecar) {
        this.haveSidecar = haveSidecar;
    }

    public Motorcycle( String brand,double rentalPricePerDay,Boolean isAvailabe,double CC , Boolean SideCar)
    {
        super(brand, rentalPricePerDay,isAvailabe);
        cc = CC ;
        haveSidecar = SideCar;
    }
    @Override
    public void ListInfo() {
        super.ListInfo();
        System.out.println("Engine Displacement Value = "+getCc());
        System.out.println("Have Side Car :"+getHaveSidecar());
    }
}
