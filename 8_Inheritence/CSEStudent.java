public class CSEStudent extends Student{

    public double cg;

    public CSEStudent(String name, int id, double cg){
        //
        super(name,id);
        this.cg=cg;
        System.out.println("Wow, "+cg+" is nice CGPA");

        //this.name=name;
        //this.id=id;
    }

    public void doLabClass(){
        System.out.println(name+" is doing LAB class.");
    }

}