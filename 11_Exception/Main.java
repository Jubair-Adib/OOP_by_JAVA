import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args){
        //1
        try{
            //ArithmeticException
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int z=x/y;
            System.out.println(x+"/"+y+"="+z);
        } 
        catch(Exception e) {
            System.out.println("1) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");

        //2
        try{
            //NullPointerException
            String name=null;
            System.out.println(name.charAt(0));
        } 
        catch(Exception e) {
            System.out.println("2) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
        
        //3
        try{
            //StringIndexOutOfBoundsException
            String name="Abonti";
            System.out.println(name.charAt(6));
        } 
        catch(Exception e) {
            System.out.println("3) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");

        //4
        try{
            //NumberFormatException
            int num=Integer.parseInt("Abonti");
        } 
        catch(Exception e) {
            System.out.println("4) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
/*
        //5
        try{
            //FileNotFoundException
            File file=new File("D://file.txt");
        } 
        catch(Exception e) {
            System.out.println("5) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
*/
        //6
        try{
            //ArrayIndexOutOfBoundsException
            int array[]=new int[3];
            array[3]=32;
        } 
        catch(Exception e) {
            System.out.println("6) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
/* 
        //7
        try{
            //ClassNotFoundException
            Forest f=new Forest();
        } 
        catch(Exception e) {
            System.out.println("7) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
*/
        //8
        try{
            //IOException
            Scanner sss=new Scanner(System.in);
            int x=sss.nextInt();
            System.out.println(x);
        }
        catch(Exception e) {
            System.out.println("8) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
/*
        //9
        try{
            //NoSuchMethodException
            ClassWithoutMethod f=new ClassWithoutMethod();
            f.nomethod();
        }
        catch(Exception e) {
            System.out.println("9) Exception: "+e);
        }
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
*/
        try{
            //ArithmeticException
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int z=x/y;
            System.out.println(x+"/"+y+"="+z);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Wrong: "+e);
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException Wrong: "+e);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException Wrong: "+e);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException Wrong: "+e);
        }
        /*catch(FileNotFoundException e){
            System.out.println("FileNotFoundException Wrong: "+e);
        }*/
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Wrong: "+e);
        }
        /*catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException Wrong: "+e);
        }
        catch(IOException e){
            System.out.println("IOException Wrong: "+e);
        }
        catch(NoSuchMethodException e){
            System.out.println("NoSuchMethodException Wrong: "+e);
        }*/
        finally{
            System.out.println("I am fade up, SORRY.");
        }
        System.out.println("GOODBYE.");
        
    }
}