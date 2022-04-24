import java.util.Scanner;

public class App {

    /* This program can be written without a function
     * The function swap can be improved on by using pointers(reference)
     * It's written this way for practice purposes only
     */

    public static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println("The Swappped Numbers are: " + a + " " + b);
    
    }
    public static void main(String[] args) throws Exception {
        

        int a, b;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the two numbers you want to swap");
        a = cin.nextInt();
        b = cin.nextInt();

        System.out.println("The Numbers entered are: " + a + " " + b);

        swap( a, b);
        
    }

    
}