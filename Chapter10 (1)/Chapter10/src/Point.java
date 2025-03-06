public class Point {
    private int x; // x part of coordinate pair
    private int y; // y part of coordinate pair
 
    // no-argument constructor
    public Point() {
       // implicit call to Object constructor occurs here
    } 
 
    // constructor
    public Point( int x, int y ) {
       // implicit call to Object constructor occurs here
       this.x = x;  // no need for validation
       this.y = y;  // no need for validation
    } 
  
    // set x in coordinate pair
    public void setX( int x ) {
       this.x = x;  // no need for validation
    } 

   // return x from coordinate pair
   public int getX() {
      return x;
   } 

   // set y in coordinate pair
   public void setY( int y ) {
      this.y = y;  // no need for validation
   } 

   // return y from coordinate pair
   public int getY() {
      return y;
   } 

   // return String representation of Point object
   public String toString() {
      return "[" + getX() + ", " + getY() + "]";
   } 

} // end class Point