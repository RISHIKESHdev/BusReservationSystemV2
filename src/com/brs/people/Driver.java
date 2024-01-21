package src.com.brs.people;

public class Driver extends User {
    public Driver(String licenseNo, int totalYearOfExperience, int emergencyContactNo, String firstName, String middleName, String lastName, String emailId, String gender, int age, double mobileNo, Account accountDetail){
        super(firstName,middleName,lastName,emailId,gender,age,mobileNo,accountDetail);
        this.licenseNo = licenseNo;
        this.totalYearOfExperience=totalYearOfExperience;
        this.emergencyContactNo=emergencyContactNo;
    }
    private String licenseNo;
    private int totalYearOfExperience;
    private int emergencyContactNo;

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public int getTotalYearOfExperience() {
        return totalYearOfExperience;
    }

    public void setTotalYearOfExperience(int totalYearOfExperience) {
        this.totalYearOfExperience = totalYearOfExperience;
    }

    public int getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(int emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }
}