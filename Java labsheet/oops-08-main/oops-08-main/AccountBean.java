
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private double balance;
    private final PropertyChangeSupport support =
            new PropertyChangeSupport(this);

    public AccountBean() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        double oldBalance = this.balance;
        this.balance = balance;

        support.firePropertyChange(
                "balance", oldBalance, balance);
    }

    public void addPropertyChangeListener(
            PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener(event -> {
            System.out.println("Property: " + event.getPropertyName());
            System.out.println("Old Balance: " + event.getOldValue());
            System.out.println("New Balance: " + event.getNewValue());
        });

        account.setBalance(1000);
        account.setBalance(2500);
    }
}
