package gun29.task2;

public class Main1 {
    public static void main(String[] args) {

        Insan1 insan1 = new Insan1();
        insan1.veriAta("Yasin",29);
        insan1.akrabaAta("ali","veli","ahmet");

        Insan1 insan2 = new Insan1();
        insan2.veriAta("mehmet",32);

        insan2.akrabaAta("mahmut","osman","sinan");

        insan1.adınıSoyle();
        insan1.akrabalarınıSoyle();
        System.out.println("-------------------------------");
        insan2.adınıSoyle();
        insan2.akrabalarınıSoyle();
        insanSayısı();

    }
    public static void insanSayısı(){
        System.out.println(Insan1.count);
    }
}
