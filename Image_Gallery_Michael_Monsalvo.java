/*
Name: Michael Monsalvo
Date: 4/9/26
Lab 10: Image Gallery

This program displays six images in a JavaFX GridPane layout.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class ImageGallery_Michael_Monsalvo extends Application {

    // Class-level image variables
    Image img1, img2, img3, img4, img5, img6;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6;

    @Override
    public void start(Stage primaryStage) {

        // Load images (Wikimedia Commons - safe URLs)
        img1 = new Image("https://upload.wikimedia.org/wikipedia/commons/3/3a/Cat03.jpg");
        img2 = new Image("https://upload.wikimedia.org/wikipedia/commons/9/99/Black_and_White_Dog.jpg");
        img3 = new Image("https://upload.wikimedia.org/wikipedia/commons/5/50/Vd-Orig.jpg");
        img4 = new Image("https://upload.wikimedia.org/wikipedia/commons/6/6e/Golde33443.jpg");
        img5 = new Image("https://upload.wikimedia.org/wikipedia/commons/2/24/Blue_Tiger_India.jpg");
        img6 = new Image("https://upload.wikimedia.org/wikipedia/commons/4/4f/Beagle_600.jpg");

        // Create ImageViews
        iv1 = new ImageView(img1);
        iv2 = new ImageView(img2);
        iv3 = new ImageView(img3);
        iv4 = new ImageView(img4);
        iv5 = new ImageView(img5);
        iv6 = new ImageView(img6);

        // Resize images
        ImageView[] images = {iv1, iv2, iv3, iv4, iv5, iv6};
        for (ImageView iv : images) {
            iv.setFitWidth(150);
            iv.setFitHeight(150);
            iv.setPreserveRatio(true);
        }

        // GridPane setup
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        // Add images to grid (2 rows × 3 columns)
        grid.add(iv1, 0, 0);
        grid.add(iv2, 1, 0);
        grid.add(iv3, 2, 0);
        grid.add(iv4, 0, 1);
        grid.add(iv5, 1, 1);
        grid.add(iv6, 2, 1);

        // Scene + Stage
        Scene scene = new Scene(grid, 900, 650);

        primaryStage.setTitle("Michael's Image Gallery");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
 
