package src.com.brs.bus;

public class WindowScreen implements busUtilities {
    public WindowScreen(String windowScreenMaterial,double windowScreenSizeInches){
        this.setWindowScreenMaterial(windowScreenMaterial);
        this.setWindowScreenSizeInches(windowScreenSizeInches);
    }
    private String windowScreenMaterial;
    private double windowScreenSizeInches;

    public String getWindowScreenMaterial() {
        return windowScreenMaterial;
    }

    public void setWindowScreenMaterial(String windowScreenMaterial) {
        this.windowScreenMaterial = windowScreenMaterial;
    }

    public double getWindowScreenSizeInches() {
        return windowScreenSizeInches;
    }

    public void setWindowScreenSizeInches(double windowScreenSizeInches) {
        this.windowScreenSizeInches = windowScreenSizeInches;
    }
}
