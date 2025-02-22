public class Player{
    public static int teamrun=0;
    public int run=0;

    public void take_run(int run){
        teamrun+=run;
        this.run+=run;
    }    

}