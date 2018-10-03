public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public void main(Strin[]args) {

  }
  public BankAccount (double balIn; int idIn; String pw) {
    balance = balIn;
    accountID = idIn;
    password = pw;
  }
  public String toString() {
    return balance + "\t" + accountID;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
}
