public class Driver {
  public static void main(String[]args) {
    BankAccount acc = new BankAccount(1000000, 0000, "password");
    System.out.println(acc.toString());
  }
}
