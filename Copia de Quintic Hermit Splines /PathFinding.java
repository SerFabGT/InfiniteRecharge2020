import java.util.ArrayList;

public class PathFinding{

    Point u = new Point(0,0);
    ArrayList<Point> OPEN = new ArrayList<Point>(0);
    ArrayList<Point> CLOSED = new ArrayList<Point>(0);
    ArrayList<Point> NotTraversable = new ArrayList<Point>(0);
    Point[] WAY;

    public int LowestFCost(){
        int t = 0;
        for (int w=0; w < OPEN.size(); w++ ) {
            if( OPEN.get(w).FinalCost < OPEN.get(t).FinalCost ){
                t = OPEN.indexOf( OPEN.get(w) );
            }
        }
        return t;
    }


   public void Route(Point s, Point e){
       OPEN.add(s); 
       s.FinalCost = u.Cost(s,e);
       Boolean p = true;
        while(p){
            Point current = OPEN.get( LowestFCost() ); // node in open with lowest f_cost
            OPEN.remove(current);
            CLOSED.add(current);
            if(current == e){
                p = false;
            }
            for (Point N : current.Neighbours) {
                if( NotTraversable.contains(N) || CLOSED.contains(N) ){
                }
                else{
                boolean q = true;
                // Q = if new path to neighbour is shorteror 
                if(!( OPEN.contains(N) )){
                    OPEN.add(N);
                }
                if(q){
                    N.parent = current; 
                   // N.FinalCost = 
                    // set f_cost of neighbour 
                }
                }
            }


        }   
   }

}