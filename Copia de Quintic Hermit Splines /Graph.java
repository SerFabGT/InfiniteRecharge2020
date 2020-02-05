import javax.swing.JPanel;
import java.awt.Graphics;

public class Graph extends JPanel {

    int d = 5; //step size
    double alpha; //start
    double beta; //end
    double length;
    int U;
    int B;
    int H;
    Curve f;

    public Graph (int a, int b, Plane p, Curve g){
        U = p.UNIT;
        B = p.BASE;
        H = p.HEIGHT;
        alpha = a*U;
        beta = b*U;
        length = beta - alpha;
        this.setOpaque(false);
        f=g;
    }

    public double function(double z){
        double t=z/U; //scale x axis

        double h = f.YFunction(t);
        // double h = 3*Math.sin(t);

        return U * h; //scale y axis
    }

    public void paintComponent (Graphics g) {
        
        int x1= (int) alpha;
        int y1= (int) function(alpha);
        int x2=x1;
        int y2=y1;


        for(int k=0; k<(int) length/d; k++){
           //g.drawLine(x1,y1,x2,y2);
            // g.drawLine(x1,H - y1,x2,H - y2);
            g.drawLine((int) B*U/2 + x1, (int)  H*U/2 - y1,(int) B*U/2 + x2, (int) H*U/2 -y2);
            // g.drawLine( (int) B/2 + x1, (int)  H/2 - y1,(int) B/2 + x2, (int) H/2 -y2);
            x1=x2;
            y1=y2;
            x2=x1+d;
            y2=(int) function(x1+d);

        }
        
    }
}