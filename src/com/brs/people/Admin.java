package src.com.brs.people;

public class Admin extends User {
    public Admin(boolean isActiveStatus, String firstName, String middleName, String lastName, String emailId, String gender, int age, double mobileNo, Account accountDetail){
        super(firstName,middleName,lastName,emailId,gender,age,mobileNo,accountDetail);
        this.isActiveStatus = isActiveStatus;
    }
    private boolean isActiveStatus;

    public boolean isActiveStatus() {
        return isActiveStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        isActiveStatus = activeStatus;
    }
}
