
public class Main {
    final static String PATH = "D:\\skilbox\\java_basics\\FilesAndNetwork\\files\\movementList.csv";

    public static void main(String[] args) {
        Movements movements = new Movements(PATH);
        System.out.println("Сумма доходов: " + movements.getIncomeSum());
        System.out.println("Сумма расходов: " + movements.getExpenseSum());
        System.out.println("Суммы расходов по организациям: ");
        movements.ExpenseSharing();

        System.out.println("Суммы доходов по организациям: ");
        movements.IncomeSharing();


    }
}
