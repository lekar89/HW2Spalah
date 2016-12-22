import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Bank privat = new Bank("Privat bank");
    privat.addDeposit(new Deposit("Фирташ Дмитрий Васильевич ",100,5));
    privat.addDeposit(new Deposit("Коломойский Игорь Валерьевич",1000,10));
    privat.addDeposit(new Deposit("Александр Шлапак",10000,15));

    privat.debt(new Scanner(System.in).nextInt());
    }

}