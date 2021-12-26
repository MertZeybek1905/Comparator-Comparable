import java.util.Comparator;

import javax.print.DocFlavor.STRING;

class KucuktenBuyugeplayer implements Comparator<Player>{
    String name;
    int id;
   public void KucuktenBuyegeplayer( String name,int id) {
       this.name=name;
       this.id=id;
   }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compare(Player p1, Player p2) {
        // TODO Auto-generated method stub
        return p1.getName().compareTo(p2.getName());
    }

}
