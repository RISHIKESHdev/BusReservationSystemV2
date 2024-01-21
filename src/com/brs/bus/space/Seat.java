package src.com.brs.bus.space;

public class Seat implements Space {
    public Seat(double maxReclinationAngle,int spaceXPosition,int spaceYPosition,boolean isUpper,double spaceFarePrice){
        this.spaceXPosition=spaceXPosition;
        this.spaceYPosition=spaceYPosition;
        this.isUpper=isUpper;
        this.spaceFarePrice=spaceFarePrice;
        this.setMaxReclinationAngle(maxReclinationAngle);
    }
    private double maxReclinationAngle;
    private int spaceXPosition;
    private int spaceYPosition;
    private boolean isUpper;
    private double spaceFarePrice;

    public double getMaxReclinationAngle() {
        return maxReclinationAngle;
    }

    public void setMaxReclinationAngle(double maxReclinationAngle) {
        this.maxReclinationAngle = maxReclinationAngle;
    }



    public int getSpaceXPosition() {
        return this.spaceXPosition;
    }

    public void setSpaceXPosition(int spaceXPosition) {
        this.spaceXPosition = spaceXPosition;
    }

    public int getSpaceYPosition() {
        return this.spaceYPosition;
    }

    public void setSpaceYPosition(int spaceYPosition) {
        this.spaceYPosition = spaceYPosition;
    }

    public boolean isUpper() {
        return this.isUpper;
    }

    public void setUpper(boolean upper) {
        this.isUpper = upper;
    }

    public double getSpaceFarePrice() {
        return this.spaceFarePrice;
    }

    public void setSpaceFarePrice(double spaceFarePrice) {
        this.spaceFarePrice = spaceFarePrice;
    }
}
