package gun29.task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ogrenci ögr1 = new Ogrenci();

        ögr1.adı="yasin";
        ögr1.soyadı="aroglan";

        Ogrenci ögr2 = new Ogrenci();
        ögr2.adı="mehmet";
        ögr2.soyadı="simsek";

        ArrayList<Ogrenci> list = new ArrayList<>();
        list.add(ögr1);
        list.add(ögr2);
        for (Ogrenci ogrenci : list) {
            System.out.println(ogrenci.adı+" "+ogrenci.soyadı);


        }

    }
}
