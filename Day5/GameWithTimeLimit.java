package Day5.com;

public class GameWithTimeLimit extends Game {
    public int timeLimit;
//    Game game=new Game(name, maxnumPlayers);
    GameWithTimeLimit(String name,int maxnumPlayers, int timeLimit){
        super(name,maxnumPlayers);
        this.timeLimit=timeLimit;
    }

//    public int getTimeLimit() {
//        return timeLimit;
//    }
//
//    public void setTimeLimit(int timeLimit) {
//        this.timeLimit = timeLimit;
//    }
    public String toString(){
        return super.toString()+"\n"+"Time Limit for "+name+" is "+timeLimit+" minutes";
    }
}
