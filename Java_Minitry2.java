package java_minitry2;
import java.util.Scanner;
public class Java_Minitry2 {
    public static void main(String[] args) {
        int[] Array = new int[20];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Element in the Array : ");
        int b,n;
        b=in.nextInt();
        DoubleStack a = new DoubleStack(b);
        do{
            System.out.println("\n1.Push Red Stack  \n2.Push Blue Stack \n3.Display Red \n4.Display Blue \n5.Color JFrame \nEnter the Choice : ");
            n=in.nextInt();
            switch(n){
                case 1:
                    a.push1();
                    break;
                case 2:
                    a.push2();
                    break;
                case 3:
                    a.displayred();
                    break;
                case 4:
                    a.displayblue();
                    break;
                case 5:
                    a.cs();
                    break;
            }
        }while(n<=5);
    }
}
