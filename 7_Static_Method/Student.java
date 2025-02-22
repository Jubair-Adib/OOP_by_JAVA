public class Student{
    
    public String name;
    public int id;
    private static String uniname="BUET";
    public static int count=0;

    public Student(String name, int id){
        this.name=name;
        this.id=id;
        count++;
    }

    public static void updateUni(String un){
        uniname=un;
    }

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Name of University: "+uniname);
    }

}