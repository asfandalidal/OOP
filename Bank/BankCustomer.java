public class BankCustomer {
    private String name;
    private int age;
    private double balance;
    public BankCustomer(String name,int age,double balance)
    {
        this.age=age;
        this.balance=balance;
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    
}
