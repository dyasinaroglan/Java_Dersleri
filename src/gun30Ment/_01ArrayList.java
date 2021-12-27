package gun30Ment;

import java.util.ArrayList;

public class _01ArrayList {
    public static void main(String[] args) {
        // array sınırı belli... ArrayList sınır belli değil.

        String str ="   aa    ";
        str.trim(); // aynen yazar  değiştirmez. değiştiremiyorsam immutable
        //Stringlerde atama yapmadan dğişiklik yapamıyoruz
        System.out.println(str);
        str=str.trim();
        System.out.println(str);  //immutable

        ArrayList<Integer> list = new ArrayList<>(5); //initial kapasite 5 kapasite
        //list referans burada
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(12);
        list.add(5);
        list.add(1);
        list.size();
        System.out.println(list);

        //ArrayList Linklist aynı bir fark yok. sadece performans farkı var. biri daha hızlı

        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer i : list) {  //iterable sayılabilir
            System.out.println(i+"\t");
            
        }

    }
}
