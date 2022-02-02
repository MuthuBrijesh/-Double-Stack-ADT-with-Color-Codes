package java_minitry2;
import java.util.Scanner;
public class DoubleStack implements ADT{
    Scanner in = new Scanner(System.in);
    int array[][];
    int a,i,c,j,lr=0,lb=0,b=0;
    int top1,top2;
    public DoubleStack(int r){
        a = r;
        array = new int[a][3];
        top2 = a-1;
        top1 = 0;
        c = a/2;
    }
    public void displayred(){
        System.out.println();
        for(i=0;i<top1;i++){
            System.out.print(i);
            for(j=0;j<3;j++){
                System.out.print("\t"+array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void displayblue(){
        System.out.println();
        for(i=a-1;i>top2;i--){
            System.out.print(i);
            for(j=0;j<3;j++){
                System.out.print("\t"+array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void push1(){
        if(top1 != c){
            System.out.println("Enter the Element : ");
            for(i=0;i<3;i++){
                array[top1][i] = in.nextInt();
            }
            top1+=1;
            lr++;
        }
        else{
            System.out.println("Stack Red is FULL");
        }
    }
    public void push2(){
        if(top2 != c-1){
            System.out.println("Enter the Element : ");
            for(i=0;i<3;i++){
                array[top2][i] = in.nextInt();
            }
            top2=top2-1;
            lb++;
        }
        else{
            System.out.println("Stack Blue is FULL");
        }
    }
    public void cs(){
        System.out.println("Enter the Index Number of Double Stack : ");
        int d = in.nextInt();
            colorString c = new colorString(array , d);
    }
}
