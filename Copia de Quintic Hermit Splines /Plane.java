import javax.swing.JPanel;  
import java.awt.Graphics;

public class Plane extends JPanel {

    public int UNIT; // unit -> pixels
    public int BASE;
    public int HEIGHT;

    public Plane(int a, int b, int c){
        UNIT = a;
        BASE = b;
        HEIGHT = c;
        this.setOpaque(false);
    }

    public void paintComponent(Graphics g){
 
        for(int w=0; w<=BASE*UNIT; w=w+UNIT){ // AXIS
            g.drawLine(0,w,BASE*UNIT,w); //parallel to x
            g.drawLine(w,0,w,BASE*UNIT); //parallel to y
        }
    }
}