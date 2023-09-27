public class BankAccount{
    private int AccountNo;
    private BankCustomer customer;
    public  BankAccount(String name,int age,double balance,int AccountNo)
    {
       this.customer=new BankCustomer(name, age, balance);
        this.AccountNo=AccountNo;
    }
    public int getAccountNo()
    {
        return AccountNo;
    }

}

