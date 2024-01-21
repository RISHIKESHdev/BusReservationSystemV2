package src.com.brs.transaction;

import java.time.LocalDateTime;

public class DebitCard implements Payment {
    public DebitCard(String cardHolderName,String cardExpiryDate,int cardNumber,int cardCVV,int cardPIN,String transactionType, double totalFare, LocalDateTime transactionDateTime){
        this.cardHolderName=cardHolderName;
        this.cardExpiryDate=cardExpiryDate;
        this.cardNumber=cardNumber;
        this.cardCVV=cardCVV;
        this.cardPIN=cardPIN;
        this.transactionId="Trans-";
        this.transactionType=transactionType;
        this.totalFare=totalFare;
        this.transactionDateTime=transactionDateTime;
    }
    private String cardHolderName;
    private String cardExpiryDate;
    private int cardNumber;
    private int cardCVV;
    private int cardPIN;
    private String transactionId;
    private String transactionType;
    private String responseMessage;
    private boolean transactionStatus;
    private double totalFare;
    private int responseCode;
    private LocalDateTime transactionDateTime;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public void setCardPIN(int cardPIN) {
        this.cardPIN = cardPIN;
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
