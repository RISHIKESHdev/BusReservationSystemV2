package src.com.brs.bus;

public class BottleHolder implements busUtilities {
    public BottleHolder(double bottleHolderRadius,String bottleHolderMaterial){
        this.setBottleHolderRadius(bottleHolderRadius);
        this.setBottleHolderMaterial(bottleHolderMaterial);
    }
    private double bottleHolderRadius;
    private String bottleHolderMaterial;

    public double getBottleHolderRadius() {
        return bottleHolderRadius;
    }

    public void setBottleHolderRadius(double bottleHolderRadius) {
        this.bottleHolderRadius = bottleHolderRadius;
    }

    public String getBottleHolderMaterial() {
        return bottleHolderMaterial;
    }

    public void setBottleHolderMaterial(String bottleHolderMaterial) {
        this.bottleHolderMaterial = bottleHolderMaterial;
    }
}
