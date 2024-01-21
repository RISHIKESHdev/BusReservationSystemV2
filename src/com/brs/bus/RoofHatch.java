package src.com.brs.bus;

public class RoofHatch implements busUtilities {
    public RoofHatch(double roofHatchSizeInches,int numberOfRoofHatches){
        this.setRoofHatchSizeInches(roofHatchSizeInches);
        this.setNumberOfRoofHatches(numberOfRoofHatches);
    }
    private double roofHatchSizeInches;
    private int numberOfRoofHatches;

    public double getRoofHatchSizeInches() {
        return roofHatchSizeInches;
    }

    public void setRoofHatchSizeInches(double roofHatchSizeInches) {
        this.roofHatchSizeInches = roofHatchSizeInches;
    }

    public int getNumberOfRoofHatches() {
        return numberOfRoofHatches;
    }

    public void setNumberOfRoofHatches(int numberOfRoofHatches) {
        this.numberOfRoofHatches = numberOfRoofHatches;
    }
}
