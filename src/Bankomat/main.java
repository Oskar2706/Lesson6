package Bankomat;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM(10, 20, 30);
        atm.addMoney("fifties", 9);
        System.out.println(atm.getMoney(330));
    }
}
