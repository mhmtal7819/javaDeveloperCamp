// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
         BudgetManagement budgetManagement=new BudgetManagement();
         budgetManagement.deposit(100);
         System.out.println(budgetManagement.getBalance());
        try {
            budgetManagement.withdraw(150); //her hatayla karsılasma durumundan dolayı try catch e aldık yine
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}