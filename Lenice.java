import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Lenice {

    static boolean score;

    public static boolean Display(int number) {
        GridPane grid;
        Stage windowL;
        Label Q;
        Button A, B, C, D;
        Scene scene;
        VBox layout1;

        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        windowL = new Stage();
        windowL.initModality(Modality.NONE);
        windowL.setTitle("Category: Science");
        windowL.setMinWidth(1000);

        if (number == 1) {
            Q = new Label("What is a tomato categorized as?");
            A = new Button("Both");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Fruit");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Neither");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Vegetable");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 2) {
            Q = new Label("What is the longest type of cell in the human body?");
            A = new Button("Skin Cells");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Blood Cells");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Muscle Cells");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Nerve Cells");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 3) {
            Q = new Label("What is the age of the earth?");
            A = new Button("about 4.5 trillion years");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("about 5.4 trillion years");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("about 4.5 billion years");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("about 5.4 billion years");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 4) {
            Q = new Label("What is the fastest rotating planet?");
            A = new Button("Mercury");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Venus");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Saturn");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Jupiter");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 5) {
            Q = new Label("How many bones are in the adult human body?");
            A = new Button("198");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("206");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("243");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("300");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 6) {
            Q = new Label("How many bones are in the infant human body?");
            A = new Button("198");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("206");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("243");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("300");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 7) {
            Q = new Label("Which element can burn on the surface of water?");
            A = new Button("Mercury");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Potassium");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Helium");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Krypton");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 8) {
            Q = new Label("What is the world's largest ocean?");
            A = new Button("Atlantic");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Pacific");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Indian");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Arctic");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 9) {
            Q = new Label("What is the largest to have ever live?");
            A = new Button("Whale Shark");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Hammerhead");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("Great White");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Megalodan");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }
        else if (number == 0) {
            Q = new Label("If you mix all the colors in the light spectrum together, what color do you get?");
            A = new Button("None of the above");
            A.setOnAction(e -> {
                score = Lenice.Answers(number, 'A');
                windowL.hide();
            });
            B = new Button("Rainbow");
            B.setOnAction(e -> {
                score = Lenice.Answers(number, 'B');
                windowL.hide();
            });
            C = new Button("White");
            C.setOnAction(e -> {
                score = Lenice.Answers(number, 'C');
                windowL.hide();
            });
            D = new Button("Black");
            D.setOnAction(e -> {
                score = Lenice.Answers(number, 'D');
                windowL.hide();
            });
            layout1 = new VBox(20);
            layout1.getChildren().addAll(Q, A, B, C, D);
            scene = new Scene(layout1, 800, 500);
            windowL.setScene(scene);
            windowL.showAndWait();
        }

        return score;
    }

    public static boolean Answers(int number, char answer) {
        if (number == 1 && answer == 'B') {
            return true;
        }
        else if (number == 2 && answer =='D') {
            return true;
        }
        else if (number == 3 && answer == 'C') {
            return true;
        }
        else if (number == 4 && answer == 'D') {
            return true;
        }
        else if (number == 5 && answer == 'B') {
            return true;
        }
        else if (number == 6 && answer == 'D') {
            return true;
        }
        else if (number == 7 && answer == 'B') {
            return true;
        }
        else if (number == 8 && answer == 'B') {
            return true;
        }
        else if (number == 9 && answer == 'D') {
            return true;
        }
        else if (number == 0 && answer == 'C') {
            return true;
        }
        else {
            return false;
        }
    }
}