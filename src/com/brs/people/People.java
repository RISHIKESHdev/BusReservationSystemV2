package src.com.brs.people;

import java.util.List;

public interface People {
    public String getFirstName();

    public void setFirstName(String firstName);

    public String getMiddleName();

    public void setMiddleName(String middleName);

    public String getLastName();

    public void setLastName(String lastName);

    public String getEmailId();

    public void setEmailId(String emailId);

    public String getGender();

    public void setGender(String gender);

    public int getAge();

    public void setAge(int age);

    public double getMobileNo();

    public void setMobileNo(double mobileNo);
    public List<Account> getAccountDetail();

    public void setAccountDetail(Account accountDetail);
}
