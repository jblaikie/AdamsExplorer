/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamsexplorer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class AdamsExplorer extends Application {

   protected VRView vv;
    protected KeyboardController kc;
    protected Map map;
    protected MouseController mc;
    protected MapView mv;
    


    /**
     * Creates one ImageView for VRView and one Canvas for MapView.
     * Creates VRController, MouseController, MapView and VRView.
     * Set up mouse and keyboard events.
     * Width: 800, Height: 600.
     * Each view is 400*600.
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
        GridPane gp = new GridPane();
        ImageView iv = new ImageView();
        gp.add(iv, 0, 0);
        Canvas cvs = new Canvas();
        gp.add(cvs, 1, 0);
        cvs.setWidth(400);
        cvs.setHeight(600);
        

        Scene scene = new Scene(gp, 800, 800);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            public void handle(KeyEvent ke) {
                KeyCode cc = ke.getCode();
                switch (cc) {
                    case UP:
                        kc.handleKey(KeyboardController.KEY.UP);
                        break;
                    case DOWN:
                        kc.handleKey(KeyboardController.KEY.DOWN);
                        break;
                    case LEFT:
                        kc.handleKey(KeyboardController.KEY.LEFT);
                        break;
                    case RIGHT:
                        kc.handleKey(KeyboardController.KEY.RIGHT);
                        break;

                }
            }
        });
        
         this.map = new Map();
        map.loadFromFile("null");
        this.vv = new VRView(iv);
        this.kc = new KeyboardController(map, vv);
        map.register(kc);

        this.mv = new MapView(cvs);
        this.mc = new MouseController(map, mv);
        map.register(this.mc);
        
        
        cvs.setOnMouseClicked(
                new EventHandler<MouseEvent>() {
            

            @Override
            public void handle(MouseEvent event) {
                double x = event.getX();
                double y = event.getY();
                mc.handleMouse(x, y);
            }
        }
        );
        
        
         primaryStage.setTitle("Adams Explorer");
        primaryStage.setScene(scene);
        primaryStage.show();
        this.map.updateAll();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
