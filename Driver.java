public class Driver {
  public static void main(String[]args) {
    BankAccount acc = new BankAccount(1000000, 0000, "password");
    System.out.println(acc.toString());
    acc.setPassword("newpass");
    if (acc.deposit(400)) {
      System.out.println("Successfully Deposited.");
    }
    else {
      System.out.println("Please enter a valid amount.");
    }
    System.out.println(acc.getBalance());
  }
}
