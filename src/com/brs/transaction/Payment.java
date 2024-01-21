package src.com.brs.transaction;

import java.time.LocalDateTime;

public interface Payment {
    public String getTransactionID();

    public void setTransactionID(String transactionID);

    public String getTransactionType();

    public void setTransactionType(String transactionType);

    public LocalDateTime getTransactionDateTime();

    public void setTransactionDateTime(LocalDateTime transactionDate);
    public String getResponseMessage();

    public void setResponseMessage(String responseMessage);

    public boolean isTransactionStatus();

    public void setTransactionStatus(boolean transactionStatus);

    public double getTotalFare();

    public void setTotalFare(double totalFare);

    public int getResponseCode();

    public void setResponseCode(int responseCode);
}
