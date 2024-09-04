import java.util.Scanner;
public class Scannerpg {
    
    public static void main(String a[])
    {
    String name;
    int age;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your name");
    name=obj.nextLine();
    System.out.println("Enter your age");
    age=obj.nextInt();
    System.out.println(name);
    System.out.println(age);
    
}
}