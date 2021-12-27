package gun29.task4;

public class Yayınevi {
    public static void main(String[] args) {
        Kitap1 ktp1 = new Kitap1();
        ktp1.ad="sefiller";
        ktp1.basımYılı=2004;
        ktp1.sayfaSayısı=550;

        Kitap1 ktp2 =new Kitap1();
        ktp2.ad="Madam Bovary";
        ktp2.basımYılı=1982;
        ktp2.sayfaSayısı=622;

        ktp1.bilgileriniYaz();
        System.out.println("------------------");
        ktp2.bilgileriniYaz();
        System.out.println("--------------------");
        kitapBilgileri(ktp1);
        System.out.println("----------------------");
        kitapBilgileri(ktp2);

    }
    public static void kitapBilgileri(Kitap1 kitap){
        System.out.println("kitap adı:"+kitap.ad+"\nkitabın basım yılı:"+kitap.basımYılı+"\nkitabın sayfa sayısı"+kitap.sayfaSayısı);
    }
}
