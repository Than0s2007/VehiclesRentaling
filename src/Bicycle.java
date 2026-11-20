public class Bicycle extends Vehicle {
    private double frameSize;
    private String madeFor;
    public double getFrameSize() {
        return frameSize;
    }
    public void setFrameSize(double frameSize) {
        this.frameSize = frameSize;
    }
    public String getMadeFor() {
        return madeFor;
    }
    public void setMadeFor(String madeFor) {
        this.madeFor = madeFor;
    }
    public Bicycle( String brand,double rentalPricePerDay,Boolean isAvailabe,double FrameSize , String MadeFor)
    {
        super(brand, rentalPricePerDay,isAvailabe);
        frameSize = FrameSize;
        madeFor = MadeFor;
    } 

    @Override
    public void ListInfo() {
        super.ListInfo();
        System.out.println("Frame Size = "+getFrameSize());
        System.out.println("Made For "+getMadeFor());
    }
}
