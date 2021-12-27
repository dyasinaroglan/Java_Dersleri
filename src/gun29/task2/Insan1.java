package gun29.task2;

import java.util.ArrayList;

public class Insan1 {
    static int count;
    String adı;
    int yası;
    ArrayList<String> akrabaları = new ArrayList<>();


    public void veriAta(String adı, int yası) {
        this.adı = adı;
        this.yası = yası;
        count++;
    }

    public void akrabaAta(String... akrabaİsimleri) {
        for (String s : akrabaİsimleri) {
            akrabaları.add(s);
        }
    }

    public void adınıSoyle() {
        System.out.println(adı+" yaş:"+ yası);
    }

    public void akrabalarınıSoyle() {
        System.out.println(akrabaları);
    }
}
