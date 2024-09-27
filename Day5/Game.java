package Day5.com;

public class Game {
    public String name;
    public int maxnumPlayers;
    Game(String name,int maxnumPlayers){
        this.name=name;
        this.maxnumPlayers=maxnumPlayers;
    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public int getMaxnumPlayers(){
//        return maxnumPlayers;
//    }
//    public void setMaxnumPlayers(int maxnumPlayers){
//        this.maxnumPlayers=maxnumPlayers;
//    }
    public String toString(){
        return "Maximum number of players for "+name+" is "+maxnumPlayers;
    }
}
   