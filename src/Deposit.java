public class Deposit {

     Deposit(String clientName, int startingSum, int rate) {
        this.clientName = clientName;
        this.startingSum = startingSum;
        this.rate = rate;
    }

    private String clientName;
    private int startingSum;
    private int rate;

     int profit(int year) {

        return ((startingSum * rate)/100) * year;
    }

}
