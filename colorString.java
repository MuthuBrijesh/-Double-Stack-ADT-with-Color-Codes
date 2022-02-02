package java_minitry2;
import java.awt.*;
import javax.swing.*;
public class colorString{ 
    public colorString(int [][]array ,int i){
        int a=array[1][0];
        kFrame t = new kFrame(array,i);
        t.setTitle("Color Program");
        t.setBackground(Color.black);
        t.setSize(400, 400);
        t.setVisible(true);
        return;
    }
    public class kFrame extends JFrame{
        int a,b,c;
        private kFrame(int[][] array, int i) {
            a=array[i][0];
            b=array[i][1];
            c=array[i][2];
        }
        public void paint(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            Font plainFont = new Font("Serif",Font.PLAIN,25);
            g2.setFont(plainFont);
            g2.setColor(new Color(a,b,c)); 
            g2.drawString( "       Double Stack ADT" , 50, 200);
        }
    }
}
