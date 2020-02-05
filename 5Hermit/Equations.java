public class Equations {  

    public static double H0(double t){
        double h = 1 - 10*t*t*t + 15*t*t*t*t - 6*t*t*t*t*t ;
        return h;
    }
    public static double H1(double t){
        double h = t - 6*t*t*t + 8*t*t*t*t - 3*t*t*t*t*t ;
        return h;
    }
    public static double H2(double t){
        double h = (.5 * Math.pow(t, 2)) - (1.5 * Math.pow(t, 3)) + (1.5*Math.pow(t, 4)) - (.5*Math.pow(t, 5)) ;;
        return h;
    }
    public static double H3(double t){
        double h = (.5*Math.pow(t, 3)) - (Math.pow(t, 4)) + (.5*Math.pow(t, 5)) ;
        return h;
    }
    public static double H4(double t){
        double h = -4*t*t*t + 7*t*t*t*t - 3*t*t*t*t*t ;
        return h;
    }
    public static double H5(double t){
        double h = 10*t*t*t - 15*t*t*t*t + 6*t*t*t*t*t ;
        return h;
    }

    public static double dH0(double t){
        double h = - 30*t*t + 60*t*t*t - 30*t*t*t*t ;
        return h;
    }
    public static double dH1(double t){
        double h = 1 - 18*t*t + 32*t*t*t - 15*t*t*t*t ;
        return h;
    }
    public static double dH2(double t){
        double h = t - (9/2)*t*t + 6*t*t*t - (5/2)*t*t*t*t ;
        return h;
    }
    public static double dH3(double t){
        double h = (3/2)*t*t - 4*t*t*t + (5/2)*t*t*t*t ;
        return h;
    }
    public static double dH4(double t){
        double h = -12*t*t + 28*t*t*t - 15*t*t*t*t ;
        return h;
    }
    public static double dH5(double t){
        double h = 30*t*t - 60*t*t*t + 30*t*t*t*t ;
        return h;
    }

    public static double ddH0(double t){
        double h = - 60*t + 180*t*t - 120*t*t*t ;
        return h;
    }
    public static double ddH1(double t){
        double h = - 36*t + 96*t*t - 60*t*t*t ;
        return h;
    }
    public static double ddH2(double t){
        double h = 1 - 9*t + 18*t*t - 10*t*t*t ;
        return h;
    }
    public static double ddH3(double t){
        double h = 3*t - 12*t*t + 10*t*t*t ;
        return h;
    }
    public static double ddH4(double t){
        double h = -24*t + 84*t*t - 60*t*t*t ;
        return h;
    }
    public static double ddH5(double t){
        double h = 60*t - 180*t*t + 120*t*t*t ;
        return h;
    }


    


    public static double dc(double t, double p0, double v0, double a0, double a1, double v1, double p1){
        double h = p0*dH0(t) + v0*dH1(t) + a0*dH2(t) + a1*dH3(t) + v1*dH4(t) + p1*dH5(t);
        return h;
    }
    public static double ddc(double t, double p0, double v0, double a0, double a1, double v1, double p1){
        double h = p0*ddH0(t) + v0*ddH1(t) + a0*ddH2(t) + a1*ddH3(t) + v1*ddH4(t) + p1*ddH5(t);
        return h;
    }

    
    

}  

/*Curve Hermit = new Curve(){
    @Override public double YFunction(double z){
        Point a = new Point(0,0);
        Point b = new Point(500,500);
        double p0=a.Y;
        double p1=b.Y;
        double v0=(b.Y-a.Y)/(b.X-a.X);
        double v1=v0;
        double a0=0;
        double a1=0;
        double t=(z-a.X)/(b.X-a.X);
        double h = p0*Equations.H0(t) + v0*Equations.H1(t) + a0*Equations.H2(t) + a1*Equations.H3(t) + v1*Equations.H4(t) + p1*Equations.H5(t);
        return h;
    }
  };
  */