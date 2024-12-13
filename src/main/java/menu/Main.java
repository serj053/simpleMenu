package menu;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main extends Application {
    private static List<AnchorPane> anchorPane = new ArrayList<>();
    private static BorderPane node;

    public static void setPane(int idWindow) {
        node.setCenter(anchorPane.get(idWindow));
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("main.fxml")));

        anchorPane.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("window0.fxml"))));
        anchorPane.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("window1.fxml"))));
        anchorPane.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("window2.fxml"))));

        ObservableList<Node> nodes = root.getChildrenUnmodifiable();
        node = (BorderPane) nodes.get(1);

        System.out.println(nodes);
        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}