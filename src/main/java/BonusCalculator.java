public class BonusCalculator {
    public static void main(String[] args) {
        int accountBalance = 100; // Текущий баланс счета клиента
        int bonusRoublesAmount = 0; // Количество бонусных рублей
        int paidAmount = 1100; // Сумма пополнения

        if (paidAmount > 1000) {
            bonusRoublesAmount = (paidAmount / 100) * 1;
            accountBalance += paidAmount + bonusRoublesAmount;
        } else {
            accountBalance += paidAmount;
        }
        System.out.println("Получено бонусных рублей: " + bonusRoublesAmount);
        System.out.println("Текущий размер баланса: " + accountBalance);

    }
}
