public class BudgetManagement {
    private double balance;
    public void deposit(double money){
        //para çekimi
        balance=getBalance()+money;

    }
    public void withdraw(double money) throws Exception {
        if(balance>=money){
        balance=getBalance()-money;

    }
        else{
            throw new Exception("yetersiz bakiye");
        }

}
   public double getBalance(){
    return balance;

}
}
