package src.com.brs.navigate;

import java.util.List;

public class City implements TripNode{
    public City(String cityName, String stateName, List<NodePoint> busStopList) {
        this.cityName = cityName;
        this.stateName = stateName;
        this.busStopList = busStopList;
    }

    private String cityName;
    private String stateName;
    private List<NodePoint> busStopList;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<NodePoint> getBusStopList() {
        return busStopList;
    }

    public void setBusStopList(List<NodePoint> busStopList) {
        this.busStopList = busStopList;
    }
}
