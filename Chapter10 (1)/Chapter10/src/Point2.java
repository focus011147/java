public class Point2 {
    private int x;  // x part of coordinate pair
    private int y;  // y part of coordinate pair

    public Point2() {  } 

    public Point2( int x, int y ) {
       setX( x );   // no need for validation
       setY( y );  // no need for validation
    } 
  
    public void setX( int x) {  this.x = x;   } 

    public int getX() {     return this.x;   } 

    public void setY( int y ) { this.y = y;  } 

    public int getY()  {    return this.y; } 

    public String toString() {  return "[" + getX() + ", " + getY() + "]";  } 
    
} // end class Point2
