package group1;

public class CreditCard {
    String numberScore;
    int sum;

    public void getAdd(int sum1) {
     sum = sum +sum1;
    }

    public void getTakeOff(int sum1) {

     sum = sum - sum1;
    }

    CreditCard (String numberScore, int sum) {
        this.numberScore = numberScore;
        this.sum = sum;

    }

    public static void main(String[] args) {
        CreditCard Card1 = new CreditCard("A23 456 78B", 120);
        CreditCard Card2 = new CreditCard("C87 654 32D", 35);
        CreditCard Card3 = new CreditCard("F67 456 23K", 90);

        System.out.println(Card1);
        System.out.println(Card2);
        System.out.println(Card3);

        System.out.println(" ");

        Card1.getAdd(40);
        Card2.getAdd(50);
        Card3.getTakeOff(60);

        System.out.println(Card1);
        System.out.println(Card2);
        System.out.println(Card3);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberScore='" + numberScore + '\'' +
                ", sum=" + sum +
                '}';
    }

    }


