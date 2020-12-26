import java.util.Scanner;
public class HelloClass {
    public static void main(String[] args) { 
        String xX = new String("camarada.");//type identifier = new yper() <= Structure to create a new object
        System.out.print("Hello There, ");//Sintax for output  
        System.out.println(xX);

        System.out.println("What is your name: ");
        Scanner scanner = new Scanner(System.in);//Syntax de input 
        String name = scanner.nextLine();
        System.out.println("So, your name is " + name + ", " + xX);
    }
}
