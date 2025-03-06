public class Point3 {
    private int x,y;  // x,y of coordinate pair

    public Point3() {
       // implicit call to Object constructor occurs here
       System.out.println( "Point3 no-argument constructor: " + this );
    } 

    public Point3( int x, int y ) {
        // implicit call to Object constructor occurs here
        setX(x);	setY(y);   
        System.out.println( "Point3 constructor: " + this );
    } 
    
    protected void finalize() {
       System.out.println( "Point3 finalizer: " + this );
    }
    
    public void setX( int x ) {  this.x = x;   }  
    public int getX() {  return this.x;  } 
    public void setY( int y ) {  this.y = y;  } 
    public int getY() {  return this.y;  } 
    public String toString() {  return "[" + getX() + ", " + getY() + "]";  } 
} // end class Point3  