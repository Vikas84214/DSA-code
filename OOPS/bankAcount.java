package OOPS;

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

public class bankAcount {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vikas Verma";
        myAcc.setPassword("abcdefghi");

    }
}