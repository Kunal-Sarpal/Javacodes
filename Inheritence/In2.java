
class Account {
    public long account_number = 1234567890;
    public String name;
    public String address;
    public long  phone_number;
    public String dob;
    public int balance;
    
    public void open_account(){
        this.balance = 0;
        this.name = "Kunal";
        this.address = "Nawanshahr Rakkran Dahan V.P.O Balachaur";
        this.phone_number = 781459090;
        this.dob = "30-11-04";
        System.out.println("Account opened successfully");
    }
    public void setaccount_number(long account_number) {
        this.account_number = account_number;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setphone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }
    public long getaccount_number(long account_number) {
        return account_number;
    }

    public String getname() {
        return name;
    }

    public String getaddress() {
        return address;
    }

    public long getphone_number() {
        return phone_number;
    }

    public String getdob() {
        return dob;
    }
    public int getbalance() {
        return balance;
    }

}
class SavingsAccount extends Account{
    
    public void deposit(int amount){
        if(amount == 0 || amount < 0){
            System.out.println("Please enter a Valid amount");
        }
        else{

            balance = amount;
            System.out.println("Successfully deposit $"+ amount);
        }
    }
    public void withdraw(int amount){
        if(balance < 0 || balance < amount){
            System.out.println("you can't withdraw Insufficient balance: " + balance);
        }
        else{
            System.out.println(amount + "$ is withdraw from your account remaining balance is $" + balance);
        }
    }
}

public class In2 {

    public static void main(String[] args) {
        Account ac = new Account();
        
        
        SavingsAccount sc = new SavingsAccount();
        System.out.println("Available balance : " + sc.account_number);
        System.out.println("Name : " + sc.getphone_number());
        ac.open_account();
        ac.setbalance(234667);
        System.out.println("Available balance : " + ac.getbalance());
        System.out.println("Name : " + ac.getname());
        System.out.println("Address : " + ac.getaddress());
        System.out.println("DOB : " + ac.getdob());
        System.out.println("Phone : " + ac.getphone_number());
        
    
    }
}
