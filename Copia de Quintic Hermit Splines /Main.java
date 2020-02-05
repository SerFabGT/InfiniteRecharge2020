import javax.swing.OverlayLayout;
import java.awt.Container;

public class Main{
public static void main(String[] args) {

  Plane P = new Plane(10000,1,1);
  Frame F = new Frame(P);

    
  Curve h0 = new Curve(){
    @Override public double YFunction(double t){
      double h = Equations.H2(t);
        return h;
    }
  };
  Curve h1 = new Curve(){
    @Override public double YFunction(double t){
      double h = Equations.H3(t);
        return h;
    }
  };
  
  Container container = new Container();
  OverlayLayout layoutManager = new OverlayLayout(container);
  container.setLayout(layoutManager);
       
        Graph canvas3 = new Graph(0,1,P,h0);
        container.add(canvas3);
        Graph canvas1 = new Graph(0,1,P,h1);
        container.add(canvas1);
        container.add(P);
        F.add(container);
        F.setVisible(true);
      

  }
}


