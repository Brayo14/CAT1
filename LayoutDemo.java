import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

   public static void main(String[] args) {
      Application.launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {

      GridPane root = new GridPane();
      FlowPane leftbanner = new FlowPane();
      leftbanner.setPrefWidth(200);
      String bgStyle = "-fx-background-color: lightblue;"
         + "-fx-background-radius: 0%;"
         + "-fx-background-inset: 5px;";
         leftbanner.setStyle(bgStyle);

         root.add(leftbanner, 0, 0, 1, 1);
         root.add(createGridPane(), 1, 0, 1, 1);
         Scene scene = new Scene(root, 550, 300);
         stage.setTitle("Layout Demo");
         stage.setScene(scene);
         stage.show();
   }

   public GridPane createGridPane() {
      GridPane grid = new GridPane();
      grid.setPadding(new Insets(10));
      grid.setHgap(10);
      grid.setVgap(10);

      Text txt = new Text("Facebook ");
      txt.setFont(Font.font("Dialog", FontWeight.BOLD, 12));

      grid.add(txt, 0, 0, 1, 1);
      grid.add(new Separator(), 0, 1, 3, 1);

      
      FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 10, 10);
      fp.setAlignment(Pos.CENTER_RIGHT);
      fp.getChildren().addAll(
         new Button("< Back"),
         new Button("Next >"),
         new Button("Finish"),
         new Button("Cancel"),
         new Button("Help"));
      grid.add(fp, 0, 16, 3, 1);

      return grid;
   }
}