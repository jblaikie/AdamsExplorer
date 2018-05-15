/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamsexplorer;

/**
 *
 * @author csc190
 */
public class Explorer {
    
    
    /**
     * Constructor of Explorer
     * @param p - it's location cannot be null
     * @param direction - an int between 0 to 3. Note macros defined in Point, e.g., Point.EAST
     */
    Point pt; int dir;
    public Explorer(Point p, int direction){
        
        pt=p; dir=direction;}
    
    /**
     * Move forward. If cannot forward, stay at the current point.
     */
    public void forward(){
        throw new UnsupportedOperationException("incomplete");
    }
    
    /**
     * Move backward and reverse its current direction. If cannot move, stay at the current point.
     */
    public void backward(){
        throw new UnsupportedOperationException("incomplete");
    }
    
    /**
     * Rotate clock-wise for 90 degrees.
     */
    public void rotateRight(){
         throw new UnsupportedOperationException("incomplete");
    }
    
    /**
     * Rotate 90 degrees anti-clockwise
     */
    public void rotateLeft(){
       throw new UnsupportedOperationException("incomplete");
    }
    
    /**
     * Set the location of explorer to the given point.
     * @param p - cannot be null
     */
    public void setPoint(Point p){
        pt=p;
    }
    
    /**
     * Set the direction to the given number in [0,3].
     * Note Point has the macro definitions of the 4 directions.
     * @param v 
     */
    public void setDirection(int v){
        throw new UnsupportedOperationException("incomplete");
    }
    
    /**
     * The current point of the explorer.
     * @return the current point
     */
    public Point getPoint(){
        return pt;
    }
    
    /**
     * Return the current direction. 
     * @return an int in range [0,3]
     */
    public int getDirection(){
        return dir;
    }
}
