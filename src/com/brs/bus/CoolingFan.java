package src.com.brs.bus;

public class CoolingFan implements busUtilities {
    public CoolingFan(int numberOfCoolingFans,int fanPowerRatingWatt,int fanRotationSpeedRMP){
        this.setNumberOfCoolingFans(numberOfCoolingFans);
        this.setFanPowerRatingWatt(fanPowerRatingWatt);
        this.setFanRotationSpeedRMP(fanRotationSpeedRMP);
    }
    private int numberOfCoolingFans;
    private int fanPowerRatingWatt;
    private int fanRotationSpeedRMP;

    public int getNumberOfCoolingFans() {
        return numberOfCoolingFans;
    }

    public void setNumberOfCoolingFans(int numberOfCoolingFans) {
        this.numberOfCoolingFans = numberOfCoolingFans;
    }

    public int getFanPowerRatingWatt() {
        return fanPowerRatingWatt;
    }

    public void setFanPowerRatingWatt(int fanPowerRatingWatt) {
        this.fanPowerRatingWatt = fanPowerRatingWatt;
    }

    public int getFanRotationSpeedRMP() {
        return fanRotationSpeedRMP;
    }

    public void setFanRotationSpeedRMP(int fanRotationSpeedRMP) {
        this.fanRotationSpeedRMP = fanRotationSpeedRMP;
    }
}
