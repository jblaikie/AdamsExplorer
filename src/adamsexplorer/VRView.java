/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamsexplorer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author csc190
 */
public class VRView implements IView{

    protected ImageView iv;
    
    /**
     * Constructor
     * @param iv 
     */
    public VRView(ImageView iv){
        this.iv = iv;
        this.iv.setFitHeight(600);
        this.iv.setFitWidth(400);
    }
    
   
    /**
     * Draw the model. Needs to take out the current point of the
     * explorer and reads its direction to draw the image.
     * @param model 
     */
    @Override
    public void draw(IModel model) {
        FileInputStream fis = null;
        try {
            Map map = (Map)model;
            Explorer exp = map.getExplorer();
            String pic=exp.getPoint().arrPics[exp.getDirection()];
            fis = new FileInputStream("images/"+pic);
            Image im = new Image(fis);
            iv.setImage(im);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VRView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(VRView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
