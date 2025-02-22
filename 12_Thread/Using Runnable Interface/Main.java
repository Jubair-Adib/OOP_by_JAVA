public class Main{
    public static void main(String[] args){
        
        for(int i=1; i<=5;i++){
            MultithreadThing myThing1=new MultithreadThing(i);
            //MultithreadThing myThing2=new MultithreadThing(i);
            Thread mythread= new Thread(myThing1);
            mythread.start();
            mythread.isAlive();

            /*try {
                mythread.join();
            } catch (Exception e) {
                // TODO: handle exception
            }*/

            //myThing2.start();
        }
        
        //throw new RuntimeException();
        //MultithreadThing myThing1=new MultithreadThing();
        //MultithreadThing myThing2=new MultithreadThing();
        
        //myThing1.start();
        //myThing2.start();
        
    }
}