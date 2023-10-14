import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();

        // Load image files
        Image caImage = new Image("ca.gif");
        Image chinaImage = new Image("china.gif");
        Image ukImage = new Image("uk.gif");
        Image usImage = new Image("us.gif");

        // Create ImageViews for the images
        ImageView caImageView = new ImageView(caImage);
        ImageView chinaImageView = new ImageView(chinaImage);
        ImageView ukImageView = new ImageView(ukImage);
        ImageView usImageView = new ImageView(usImage);

        // Add ImageViews to the GridPane
        gridPane.add(caImageView, 0, 0);
        gridPane.add(chinaImageView, 1, 0);
        gridPane.add(ukImageView, 0, 1);
        gridPane.add(usImageView, 1, 1);

        // Create a Scene with the GridPane
        Scene scene = new Scene(gridPane, 400, 400);

        // Set the stage title
        primaryStage.setTitle("Image Grid Pane Example");

        // Set the scene on the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
