package src.com.brs.bus.space;

public interface Space {
    public int getSpaceXPosition();
    public void setSpaceXPosition(int spaceXPosition);
    public int getSpaceYPosition();
    public void setSpaceYPosition(int spaceYPosition);
    public boolean isUpper();
    public void setUpper(boolean upper);
    public double getSpaceFarePrice();
    public void setSpaceFarePrice(double spaceFarePrice);
}
