
public class Bank {

    public Bank(String name) {
        this.name = name;
        deposits = new Deposit[10];
    }


    private String name;
    private Deposit[] deposits;
    private  int count = 0;


    public void addDeposit(Deposit newDeposit) {
        if (count<10) deposits[count++] = newDeposit;
        //else System.out.println("Мы маленький банк 10 депозитов наш максимум");
    }

    public void debt(int year) {
        int debt;
        for (int i = 0; i < 3; i++) {
            debt = deposits[i].profit(year);
            System.out.println("Cуммa выплат за депозит№" + (i + 1) + "= " + debt);
        }
    }
}
