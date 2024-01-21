package src.com.brs.navigate;

import java.util.List;

public interface TripNode {
    public String getCityName();

    public void setCityName(String cityName);

    public String getStateName();

    public void setStateName(String stateName);

    public List<NodePoint> getBusStopList();

    public void setBusStopList(List<NodePoint> busStopList);
}
