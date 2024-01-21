package src.com.brs.bus;

public class Monitor implements busUtilities {
    public Monitor(double screenSizeInches,String panelType){
        this.setScreenSizeInches(screenSizeInches);
        this.setPanelType(panelType);
    }
    double screenSizeInches;
    String panelType;

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }
}
