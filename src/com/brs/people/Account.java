package src.com.brs.people;

public interface Account {
    public String getUserId();

    public void setUserId(String userId);

    public String getPassword();

    public void setPassword(String password);

    public boolean isActive();

    public void setActive(boolean active);
}
