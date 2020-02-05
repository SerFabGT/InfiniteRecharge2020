import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Frame extends JFrame {

    JPanel w;

    public Frame(Plane q){
        this.setTitle("GRAPH");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(q.BASE * q.UNIT,q.HEIGHT * q.UNIT);
        this.setResizable(false);
    }

    public void Sense(){
        w = new JPanel();
        w.setOpaque(false);
        w.addMouseListener( new MouseAdapter() {
        public void mouseClicked( MouseEvent e ) {
            System.out.println("x:" + e.getX() + "," + "y:" + e.getY()); }
        });
        getContentPane().add(w); 
    }
}