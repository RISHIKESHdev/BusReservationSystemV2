package src.com.brs.navigate;

public class BusStop implements NodePoint{
    public BusStop(String busStopName, String landMark, String pinCode, double latitude, double longitude) {
        this.busStopName = busStopName;
        this.landMark = landMark;
        this.pinCode = pinCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    String busStopName;
    String landMark;
    String pinCode;
    double latitude;
    double longitude;

    public String getBusStopName() {
        return busStopName;
    }

    public void setBusStopName(String busStopName) {
        this.busStopName = busStopName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
