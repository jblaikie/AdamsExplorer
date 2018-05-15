/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamsexplorer;

import java.awt.geom.AffineTransform;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Transform;

/**
 *
 * @author csc190
 */
public class MapView implements IView {

    protected Canvas canvas;

    /**
     * Needs a canvas object to draw
     * @param canvas 
     */
    public MapView(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * Need to convert model to a map object and draw. It first draws the background.png,
     * and then draws all points, and then draws lines between neighboring points,
     * and finally draw the explorer. Note there are 4 pictures available for explorer,
     * e.g., "explorer_east.png"
     * @param model 
     */
    @Override
    public void draw(IModel model) {
        throw new UnsupportedOperationException("incomplete");
    }

}
