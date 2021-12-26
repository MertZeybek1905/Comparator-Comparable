import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        ArrayList<Player> list= new ArrayList<Player>();
        list.add(new Player("mert", 50));
        list.add(new Player("anıl", 65));
        list.add(new Player("ali", 55));
        list.add(new Player("ahmet", 23));
        list.add(new Player("mehmet", 68));
        list.add(new Player("zehra", 70));
        Collections.sort(list);
        for (Player player : list) {
              System.out.println(player);
        }
        System.out.println("*********");
       
       Collections.sort(list, new KucuktenBuyugeplayer());
       for (Player player : list) {
           System.out.println(player);
       }
       
       System.out.println("*********");

        Collections.sort(list, new BuyuktenKucukPlayer());
        for (Player player : list) {
            System.out.println(player);
        }
    }


   

  
}
