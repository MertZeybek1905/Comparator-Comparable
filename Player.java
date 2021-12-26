import javax.print.DocFlavor.STRING;

class Player implements Comparable<Player>{
    String name;
    int id;
    public Player(String name,int id) {
       this.name=name; 
       this.id=id;
    }
    @Override
    public int compareTo(Player player) {
       if(this.id< player.id){
           return 1; //pozitif yaptığımız zaman büyükten küçüğe sıralar
       }
       else if(this.id>player.id){
           return -1;
       }
        return 0;
    }
    @Override
    public String toString() {
       return "|||| ID: " + id + " Name :" + name + " |||";
       
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

}