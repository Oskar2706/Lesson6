public class ATM {
    int bill20;
    int bill50;
    int bill100;
    int addbill;
    int takeoffbill;

    public ATM (int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public void addATM(int bill20, int bill50, int  bill100) {
        addbill = this.bill20+bill20+this.bill50+bill50+this.bill100+bill100;

    }

    public void takeoffATM(int bill20, int bill50, int  bill100, boolean operation) {
        takeoffbill = this.bill20-bill20-this.bill50-bill50-this.bill100-bill100;

    }

    public static void main(String[] args) {
        ATM machine = new ATM(10, 15, 20);
        machine.addATM(4,5,8);
        System.out.println(machine);

        machine.takeoffATM(3,2,7,true);
        System.out.println(machine);



    }

    @Override
    public String toString() {
        return "ATM{" +
                "bill20=" + bill20 +
                ", bill50=" + bill50 +
                ", bill100=" + bill100 +
                ", addbill=" + addbill +
                ", takeoffbill=" + takeoffbill +
                '}';
    }
}
