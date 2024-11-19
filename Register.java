package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Register extends Application{
	
	Label lblTitle, lblName, lblEmail, lblCreatePass, lblConfPassword, lblLogin,
		 lblTC, lblOr;
	Button btnSignUp, btnPhonNum, btnGoogle, btnLogIn;
	
	GridPane gp;
	VBox vbox;
	HBox hbox;
	StackPane stackPane;
	Scene scene;
	BorderPane bp;
	TextField tfName, tfEmail, tfCreatePass, tfConfPass;
	CheckBox cbTC;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	public void signUp() {
		lblTitle = new Label("SIGN UP");
		lblTitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        lblTitle.setTextFill(Color.BLACK);
        
        lblName = new Label("Name");
        tfName = new TextField();
        
        lblEmail = new Label("Email");
        tfEmail = new TextField();
        
        lblCreatePass = new Label("Create Password");
        tfCreatePass = new TextField();
        
        lblConfPassword = new Label("Create Password");
        tfConfPass = new TextField();
        
        lblTC = new Label("I agree to the Terms and Conditions");
        cbTC = new CheckBox();
        
        btnSignUp = new Button("Sign Up");
        btnSignUp.setStyle("-fx-background-color: #800000; -fx-text-fill: white;");
        
        lblLogin = new Label("Already have an account? Log In");
        btnLogIn = new Button("Log In");
        
        lblOr = new Label("Or");
        
        btnPhonNum = new Button("Login with Phone Number");
        btnPhonNum.setStyle("-fx-background-color: #800000; -fx-text-fill: white;");
        
        btnGoogle = new Button("Login with Google");
        btnGoogle.setStyle("-fx-background-color: #800000; -fx-text-fill: white;");
		
        GridPane gp = new GridPane();
        BorderPane bp = new BorderPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        
        gp.add(lblTitle, 0, 0, 2, 1);
        gp.add(lblName, 0, 1);
        gp.add(tfName, 1, 1);
        gp.add(lblEmail, 0, 2);
        gp.add(tfEmail, 1, 2);
        gp.add(lblCreatePass, 0, 3);
        gp.add(tfCreatePass, 1, 3);
        gp.add(lblConfPassword, 0, 4);
        gp.add(tfConfPass, 1, 4);
        gp.add(cbTC, 0, 5);
        gp.add(lblTC, 1, 5);
        gp.add(btnSignUp, 1, 6);
        gp.add(lblLogin, 1, 7);
        
//        gp.setStyle("-fx-background-color: beige; -fx-border-width: 2px; -fx-background-radius: 5px;");
        
        
        
        vbox = new VBox(20);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setPadding(new Insets(100, 25, 25, 25));
        vbox.getChildren().addAll(gp);
        
        hbox = new HBox(10);
        hbox.setAlignment(Pos.TOP_CENTER);
        hbox.setPadding(new Insets(25, 25, 25, 25));
        
        vbox.setStyle("-fx-background-color: #800000; ");
        gp.setStyle("-fx-background-color: beige; -fx-border-width: 2px; -fx-background-radius: 5px;");
        
//        StackPane stackPane = new StackPane(vbox, hbox);
//        stackPane.setAlignment(Pos.TOP_CENTER);
//        stackPane.setStyle("-fx-background-color: beige; -fx-border-width: 2px; -fx-background-radius: 5px;");
//        bp.setCenter(stackPane);
//        bp.setBackground(new Background(new BackgroundFill(Color.DARKRED, null, null)));
        
        
        
        
        scene = new Scene(vbox, 400, 700);
        scene.setFill(Color.DARKRED); 
        
        
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		signUp();
//		layout();
		primaryStage.setScene(scene);
		primaryStage.setTitle("SignUp Page");
		primaryStage.show();
		
	}

	

}
