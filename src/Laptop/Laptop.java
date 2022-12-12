package Laptop;

public class Laptop {
    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Laptop() {
        price = 1500;
        model ="SAMSUNG";
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Laptop(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;

    }
    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
    public static void main(String[] args) {
        Laptop.RAM ram = new RAM("APP",256);
        Laptop.HDD hdd=new HDD("DDR",256,"256");
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop(1200,"LENOVO",ram,hdd);


        System.out.println(laptop1);
        System.out.println(laptop2);}

    static class RAM {
        String name;
        int volume;

        public RAM(String name, int volume) {
            this.name = name;
            this.volume = volume;
        }

        public RAM() {
            name = "DDR4";
            volume =512;
        }
        void ram1(){

        }
        @Override
        public String toString() {
            return "RAM{" +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }
    public static class HDD {
        String name;
        int volume;
        String externaltype;

        public HDD(String name, int volume, String externaltype) {
            this.name = name;
            this.volume = volume;
            this.externaltype = externaltype;
//
        }

        public HDD() {
            name="DDR";
            volume=1024;
            externaltype="512";


        }

        @Override
        public String toString() {
            return "HDD{" +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    ", externaltype='" + externaltype + '\'' +
                    '}';
        }
    }
}
