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
public class KeyboardController implements IController {

    Map map;
    IView view;

    /**
     * Constructor of KeyboardController
     * @param map - the model object
     * @param view - the view it controls
     */
    public KeyboardController(Map map, IView view) {
        this.map = map;
        this.view = view;
    }

    /**
     * Needs to ask the view to redraw map
     */
    @Override
    public void update() {
        view.draw(map);
    }

    public enum KEY {
        UP, DOWN, LEFT, RIGHT
    };

    /**
     * Handle 4 arrow keys. LEFT/RIGHT for turn and UP/DOWN for forward/backbward.
     * @param key 
     */
    public void handleKey(KEY key) {
        Explorer ex = map.getExplorer();
        Point pt = ex.getPoint();
        Point[] nb = pt.getNeighbors();
        int dir = ex.getDirection();
        switch(key){
        case UP:
        	//pt=nb[dir];
        	ex.forward();
                map.updateAll();
        	break;
        case DOWN:
        	//pt=nb[Point.SOUTH];
        	ex.backward();
                map.updateAll();
        	break;
        case LEFT:
        	//pt =nb[Point.WEST];
        	ex.rotateLeft();
                map.updateAll();
        	break;
        case RIGHT:
        	//pt=nb[Point.EAST];
        	ex.rotateRight();
                map.updateAll();
        	break;
    	default:
    		break;
		
		//if(pt!=null)
			//ex.setPoint(pt);
    	
    }}

}
