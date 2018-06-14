package UserDefinedException;

public class InsufficientFundsException  extends Exception {
    private String amount;

    public InsufficientFundsException(double amt) {
        this.amount = amount;
    }
    public String getamount() {
        return this.amount;
    }
    public void setAmount(String amount) {
        switch (this.amount = amount) {
        }
    }

    public String getAmount() {
        return this.amount;
    }
}
