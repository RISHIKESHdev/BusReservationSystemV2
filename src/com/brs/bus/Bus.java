package src.com.brs.bus;

import src.com.brs.bus.space.Space;
import src.com.brs.people.Driver;

import java.util.ArrayList;

public interface Bus {
    public String getBusLicensePlateNumber();

    public void setBusLicensePlateNumber(String busLicensePlateNumber);

    public String getBusOperatorName();

    public void setBusOperatorName(String busOperatorName);

    public String getBusColor();

    public void setBusColor(String busColor);

    public String getBusModelName();

    public void setBusModelName(String busModelName);

    public int getBusTotalAvailableSpace();

    public void setBusTotalAvailableSpace(int busTotalAvailableSpace);

    public double getBusAverageSpeed();

    public void setBusAverageSpeed(double busAverageSpeed);

    public ArrayList<busUtilities> getBusConfigurableList();

    public void setBusConfigurableList(ArrayList<busUtilities> busUtilitiesList);

    public ArrayList<Space> getSpaces();

    public void setSpaces(ArrayList<Space> spaces);

    public Driver getDriverDetails();

    public void setDriverDetails(Driver driverDetails);
}