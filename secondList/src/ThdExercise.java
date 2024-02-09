public class ThdExercise {
  private String name;
  private int accountNumber;
  private int password;
  private float balance;
  private String type;

  public ThdExercise(String name, int accountNumber, int password, float balance, String type){
    this.name = name;
    this.accountNumber = accountNumber;
    this.password = password;
    this.balance = balance;
    this.type = type;
    System.out.println("The account was registered!");
  }

  public ThdExercise(String name, int accountNumber, int password, String type){
    this.name = name;
    this.accountNumber = accountNumber;
    this.password = password;
    this.type = type;
    balance = 0;
    System.out.println("The account was registered!");
  }

  public void showData(){
    System.out.println("Account owner: "+name);
    System.out.println("Account number: "+accountNumber);
    System.out.println("Account password: "+password);
    System.out.println("Account balance: R$"+balance);
    System.out.println("Account type: "+type);
  }

}
