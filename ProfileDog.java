package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileDog extends Application{
	
	Label titlelbl, dognamelbl, genderlbl, breedlbl, birthdaylbl, weightlbl, vetlbl;
	
	TextField dognametf, breedtf, weighttf;
	DatePicker birthdaypicker;
	DatePicker vetpicker;
	Button nextbtn;
	Scene scene;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	public void profile() {
		titlelbl = new Label("PROFILE");
		titlelbl.setFont(Font.font("Arial", FontWeight.BOLD, 24));
//		
		dognamelbl = new Label("Dog Name");
		dognametf = new TextField();
		
		genderlbl = new Label("Gender");
        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Boy", "Girl");
        
        breedlbl = new Label("Breed");
        breedtf = new TextField();
        
        birthdaylbl = new Label("Birthday");
        birthdaypicker = new DatePicker();
        
        weightlbl = new Label("Weight");
        weighttf = new TextField();
        weightlbl.setTextFill(Color.BEIGE);
        
        vetlbl = new Label("Vet Appointment");
        vetpicker = new DatePicker();
        
        nextbtn = new Button("Next");
        
        Image dogImage = new Image(getClass().getResourceAsStream("dog3.png")); 
        ImageView viewImage = new ImageView(dogImage);
        viewImage.setFitWidth(150);
        viewImage.setFitHeight(150);
        
        GridPane gp = new GridPane();
        BorderPane bp = new BorderPane();
        bp.setTop(viewImage);
        
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(5);
        gp.setPadding(new Insets(25, 25, 25, 25));
        gp.add(titlelbl, 0, 1);
        gp.add(dognamelbl, 0, 3);
        gp.add(dognametf, 0, 4);
        gp.add(genderlbl, 0, 5);
        gp.add(genderComboBox, 0, 6);
        gp.add(breedlbl, 0, 7);
        gp.add(breedtf, 0, 8);
        gp.add(birthdaylbl, 0, 9);
        gp.add(birthdaypicker, 0, 10);
        gp.add(weightlbl, 0, 11);
        gp.add(weighttf, 0, 12);
        gp.add(vetlbl, 0, 13);
        gp.add(vetpicker, 0, 14);
        gp.add(nextbtn, 0, 15);
        
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
//        hbox.getChildren().add(nextbtn);
        
        VBox vbox = new VBox(20, viewImage);
        vbox.setPadding(new Insets(25,25,25,25));
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(gp, hbox);
        
        vbox.setStyle("-fx-background-color: #800000; ");
        gp.setStyle("-fx-background-color: #FFE4B5;-fx-background-radius: 10px;");
//        gp.setPadding(new Insets(5,5,5,5));
        titlelbl.setTextFill(Color.DARKRED);
        dognamelbl.setTextFill(Color.DARKRED); 
        genderlbl.setTextFill(Color.DARKRED);
        breedlbl.setTextFill(Color.DARKRED);
        birthdaylbl.setTextFill(Color.DARKRED);
        weightlbl.setTextFill(Color.DARKRED);
        vetlbl.setTextFill(Color.DARKRED);
        
        scene = new Scene(vbox, 400, 700);
        
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		profile();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
