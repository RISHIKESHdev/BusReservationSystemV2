package src.com.brs.bus;

import src.com.brs.bus.space.Space;
import src.com.brs.people.Driver;

import java.util.ArrayList;

public class NonAcBus implements Bus {
    public NonAcBus(String windowOpenDirection,String busLicensePlateNumber,String busOperatorName,String busColor,String busModelName,double busAverageSpeed){
        this.setWindowOpenDirection(windowOpenDirection);
        this.busLicensePlateNumber= busLicensePlateNumber;
        this.busOperatorName= busOperatorName;
        this.busColor= busColor;
        this.busModelName= busModelName;
        this.busAverageSpeed= busAverageSpeed;
    }
    private String windowOpenDirection;
    private String busLicensePlateNumber;
    private String busOperatorName;
    private String busColor;
    private String busModelName;
    private int busTotalAvailableSpace;
    private double busAverageSpeed;
    private Driver driverDetails;
    private ArrayList<busUtilities> busUtilitiesList;
    private ArrayList<Space> Spaces;

    public String getWindowOpenDirection() {
        return windowOpenDirection;
    }

    public void setWindowOpenDirection(String windowOpenDirection) {
        this.windowOpenDirection = windowOpenDirection;
    }

    public String getBusLicensePlateNumber() {
        return this.busLicensePlateNumber;
    }

    public void setBusLicensePlateNumber(String busLicensePlateNumber) {
        this.busLicensePlateNumber = busLicensePlateNumber;
    }

    public String getBusOperatorName() {
        return this.busOperatorName;
    }

    public void setBusOperatorName(String busOperatorName) {
        this.busOperatorName = busOperatorName;
    }

    public String getBusColor() {return this.busColor;}

    public void setBusColor(String busColor) {
        this.busColor = busColor;
    }

    public String getBusModelName() {
        return this.busModelName;
    }

    public void setBusModelName(String busModelName) {
        this.busModelName = busModelName;
    }

    public int getBusTotalAvailableSpace() {
        return this.busTotalAvailableSpace;
    }

    public void setBusTotalAvailableSpace(int busTotalAvailableSpace) {
        this.busTotalAvailableSpace = busTotalAvailableSpace;
    }

    public double getBusAverageSpeed() {
        return this.busAverageSpeed;
    }

    public void setBusAverageSpeed(double busAverageSpeed) {
        this.busAverageSpeed = busAverageSpeed;
    }

    public ArrayList<busUtilities> getBusConfigurableList() {
        return this.busUtilitiesList;
    }

    public void setBusConfigurableList(ArrayList<busUtilities> busUtilitiesList) {
        this.busUtilitiesList = busUtilitiesList;
    }

    public ArrayList<Space> getSpaces() {
        return this.Spaces;
    }

    public void setSpaces(ArrayList<Space> spaces) {
        this.Spaces = spaces;
    }

    public Driver getDriverDetails() {
        return this.driverDetails;
    }

    public void setDriverDetails(Driver driverDetails) {
        this.driverDetails = driverDetails;
    }
}
