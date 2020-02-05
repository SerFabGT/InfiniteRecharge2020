public class Point{

int X;
int Y;
Point[] Neighbours;
Point parent;
int SCost; 
int ECost; 
int FinalCost; 

public Point(int a, int b){
    X=a;
    Y=b;
}

public double Distance(Point a,Point b){
    double d = (a.X-b.X)*(a.X-b.X) + (a.Y-b.Y)*(a.Y-b.Y);
    return Math.sqrt(d);
}

public int VerticalC(Point a,Point b){
    int r = a.Y - b.Y ; 
    return Math.abs(r);
}

public int HorizontalC(Point a,Point b){
    int r = a.X - b.X ; 
    return Math.abs(r);
}

public int Cost(Point a, Point b){
    int v = VerticalC(a,b);
    int h = HorizontalC(a,b);
    int d = Math.abs( v-h );
    if (v>h){
        return (v-d)*14 + d*10;
    }
    else{
        return (h-d)*14 + d*10;
    }
}

public int FinalC(Point q, Point s, Point e){
    int startC = Cost(q,s);
    int endC = Cost(q,e);
    return startC + endC;
}










}