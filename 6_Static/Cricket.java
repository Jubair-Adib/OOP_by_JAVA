public class Cricket{
    public static void main(String[]args){
        
        // without object we can print/use/access static variable
        System.out.println("Team Run: "+Player.teamrun);
        
        System.out.println();
        Player tamim=new Player();
        Player sakib=new Player();
        
        tamim.take_run(16);

        System.out.println("Tamim: "+tamim.run);
        System.out.println("Sakib: "+sakib.run);
        System.out.println("Team Run: "+Player.teamrun);
        System.out.println();

        sakib.take_run(18);

        tamim.take_run(60);

        System.out.println("Tamim: "+tamim.run);
        System.out.println("Sakib: "+sakib.run);
        System.out.println("Team Run: "+Player.teamrun);
        System.out.println();

        tamim.take_run(80);

        System.out.println("Tamim: "+tamim.run);
        System.out.println("Sakib: "+sakib.run);
        System.out.println("Team Run: "+Player.teamrun);
        System.out.println();

        /*
        // without object we can print/use/access static variable
        
        Team Run: 0

        Tamim: 16
        Sakib: 0
        Team Run: 16

        Tamim: 46
        Sakib: 8
        Team Run: 54

        Tamim: 46
        Sakib: 26
        Team Run: 72

        */

    }
}