package sample;

public class Payment {
    private int paymentID;
    private int amount;
    private String customer;
    private int cardNumeber;

    public Payment(int paymentID, int amount, String customer, int cardNumeber) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.customer = customer;
        this.cardNumeber = cardNumeber;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getCardNumeber() {
        return cardNumeber;
    }

    public void setCardNumeber(int cardNumeber) {
        this.cardNumeber = cardNumeber;
    }
}
