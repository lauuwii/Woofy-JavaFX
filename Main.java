package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application{
	
	Label lblTitle, lblEmail, lblPassword, lblForgetPassword, lblSignUp, lblWoofy, lblCaring;
	Button btnLogin;
	
	GridPane gp;
	VBox vbox;
	HBox hbox;
	StackPane stackPane;
	Scene scene;
	BorderPane bp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	public void init() {
		Label lblTitle = new Label("LOGIN");
        lblTitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        lblTitle.setTextFill(Color.BEIGE);

        Label lblEmail = new Label("Email:");
        TextField txtEmail = new TextField();
        txtEmail.setStyle("-fx-background-color: beige;");
        
        // Mengatur warna dan ketebalan border
        txtEmail.setStyle("-fx-border-color: #8B0000; -fx-border-width: 2px; -fx-border-radius: 5px;");
        
        Label lblPassword = new Label("Password:");
        TextField txtPassword = new PasswordField();
        txtPassword.setStyle("-fx-background-color: beige;");
        
        // Mengatur warna dan ketebalan border
        txtPassword.setStyle("-fx-border-color: #8B0000; -fx-border-width: 2px; -fx-border-radius: 5px;");
        
        Button btnLogin = new Button("Login");
        btnLogin.setStyle("-fx-background-color: #800000; -fx-text-fill: white;");

        Label lblForgetPassword = new Label("Forget password?");
        lblForgetPassword.setTextFill(Color.BLUE);

        Label lblSignUp = new Label("Don't have an account? Sign Up");
        lblSignUp.setTextFill(Color.BLUE);
        
        Label lblWoofy = new Label("Woofy");
        lblWoofy.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        lblWoofy.setTextFill(Color.BEIGE);
        
        Label lblCaring = new Label("CARING WITH LOVE");
        lblCaring.setFont(Font.font("Arial", 18));
        lblCaring.setTextFill(Color.BEIGE);
        
        Image imageAnjingBola = new Image(getClass().getResourceAsStream("/main/dogfamily.jpg"));
		ImageView viewImage = new ImageView(imageAnjingBola);
		viewImage.setFitHeight(220);
		viewImage.setFitWidth(400);
		
		

        // Layout
        GridPane gp = new GridPane();
        BorderPane bp = new BorderPane();
//        bp.setTop(viewImage);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        
        
        gp.add(lblEmail, 0, 1);
        gp.add(txtEmail, 1, 1);
        gp.add(lblPassword, 0, 2);
        gp.add(txtPassword, 1, 2);
        gp.add(btnLogin, 1, 3);
        gp.add(lblForgetPassword, 1, 4);
        gp.add(lblSignUp, 1, 5);
        
        gp.setStyle("-fx-background-color: beige; -fx-border-width: 2px; -fx-background-radius: 5px;");
        

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setPadding(new Insets(50, 25, 25, 25));
        vbox.getChildren().addAll(lblTitle, gp);

        VBox hbox = new VBox(10);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new Insets(45, 25, 25, 25));
        hbox.getChildren().addAll(lblWoofy, lblCaring);
        
        VBox hv = new VBox(viewImage);
        hv.setAlignment(Pos.TOP_CENTER);
        hv.setPadding(new Insets(0,25,25,25));
        hv.getChildren().addAll(vbox, hbox);
        
        hv.setStyle("-fx-background-color: #800000; ");

//        StackPane stackPane = new StackPane(vbox, hbox);
//        stackPane.setAlignment(Pos.TOP_CENTER);
        
//        bp.setTop(viewImage);
//        bp.setCenter(stackPane);
//        bp.setBackground(new Background(new BackgroundFill(Color.DARKRED, null, null)));
        
        scene = new Scene(hv, 400, 700);
//        scene.setFill(Color.DARKRED); 

        // Set scene
//        scene = new Scene(stackPane, 400, 700);
//        scene.setFill(Color.DARKRED); 
        

        btnLogin.setOnAction(e -> {
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            if (email.isEmpty() || password.isEmpty()) {
            	
            } else {
            	
            }
        });
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		init();
//		layout();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Page");
		primaryStage.show();
		
	}

}
