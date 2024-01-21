package src.com.brs.people;

import java.util.ArrayList;
import java.util.List;

public class User implements People{
    public User(String firstName, String middleName, String lastName, String emailId, String gender, int age, double mobileNo, Account accountDetail){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.gender=gender;
        this.age=age;
        this.mobileNo=mobileNo;
        this.setAccountDetail(accountDetail);
    }
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    private String gender;
    private int age;
    private double mobileNo;
    private List<Account> accountDetail=new ArrayList<>();
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<Account> getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(Account accountDetail) {
        this.accountDetail.add(accountDetail);
    }
}
