import java.util.Comparator;

public class BuyuktenKucukPlayer  implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        // TODO Auto-generated method stub
        return -p1.getName().compareTo(p2.getName());
    }
    
    
}
