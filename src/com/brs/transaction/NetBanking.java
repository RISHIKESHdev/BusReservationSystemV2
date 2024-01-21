package src.com.brs.transaction;

import java.time.LocalDateTime;

public class NetBanking implements Payment {
    public NetBanking(String accountHolderName,String bankName,String IFSCCode,int AccountNumber,String transactionType, double totalFare, LocalDateTime transactionDateTime){
        this.accountHolderName = accountHolderName;
        this.bankName=bankName;
        this.IFSCCode=IFSCCode;
        this.AccountNumber=AccountNumber;
        this.transactionId="Trans-";
        this.transactionType=transactionType;
        this.totalFare=totalFare;
        this.transactionDateTime=transactionDateTime;
    }
    private String accountHolderName;
    private String bankName;
    private String IFSCCode;
    private int AccountNumber;
    private String transactionId;
    private String transactionType;
    private String responseMessage;
    private boolean transactionStatus;
    private double totalFare;
    private int responseCode;
    private LocalDateTime transactionDateTime;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public String getTransactionID() {
        return transactionId;
    }

    public void setTransactionID(String transactionID) {
        transactionId = transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDate) {
        this.transactionDateTime = transactionDate;
    }
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
