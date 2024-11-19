package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.HomePage;
import main.register2;

public class LogIn extends Application{
	
	Label lbltitle, lblforget, lblsignup, lblWoofy, lblCare;
	Image dogImg;
	ImageView dogImgView;
	TextField emailTf, passTf;
	Button loginBtn;
	Rectangle rectang;
	StackPane sp;
	VBox vbTitle, vbEmail, vbForget, vbLogin, vbWoofy, mainVb, borderVb;
	Scene scene;
	
	public void login() {
		lbltitle = new Label("LOGIN");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 28));
        lbltitle.setTextFill(Color.DEEPSKYBLUE);
        lblforget = new Label("Forget password?");
        lblforget.setFont(Font.font("Inter", FontWeight.LIGHT, 12));
        lblforget.setTextFill(Color.BLACK);
        lblsignup = new Label("Dont have an account? Sign Up");
        lblsignup.setFont(Font.font("Inter", FontWeight.LIGHT, 12));
        lblsignup.setTextFill(Color.BLACK);
        
        dogImg = new Image(getClass().getResourceAsStream("imangeAnjingBola.jpg"));
        dogImgView = new ImageView(dogImg);
        dogImgView.setFitHeight(250);
        dogImgView.setFitWidth(400);
        
        emailTf = new TextField();
        emailTf.setPromptText("Email");
        emailTf.setStyle("-fx-background-color: #F5F5DC; -fx-border-color: #5AB2FF; -fx-border-width: 0 0 2 0;");
        
        passTf = new TextField();
        passTf.setPromptText("Password");
        passTf.setStyle("-fx-background-color: #F5F5DC; -fx-border-color: #5AB2FF; -fx-border-width: 0 0 2 0;");
        
        loginBtn = new Button("Login");
        loginBtn.setPrefSize(120, 15);
        loginBtn.setStyle("-fx-background-color: #5AB2FF; ");
        loginBtn.setFont(Font.font("Inter", FontWeight.BLACK, 16));
        loginBtn.setTextFill(Color.BEIGE);
        
        lblWoofy = new Label("Woofy");
		lblWoofy.setFont(Font.font("Inter", FontWeight.BLACK, 36));
        lblWoofy.setTextFill(Color.BEIGE);
        
        rectang = new Rectangle(330, 280);
        rectang.setStyle("-fx-fill: #FFF9D0; ");
        rectang.setArcHeight(20);
        rectang.setArcWidth(20);
        
        lblCare = new Label("CARING WITH LOVE");
		lblCare.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        lblCare.setTextFill(Color.BEIGE);
        
        vbTitle = new VBox(lbltitle);
        vbTitle.setAlignment(Pos.CENTER);
        vbTitle.setPadding(new Insets(25,25,25,25));
        
        vbEmail = new VBox(5, emailTf, passTf);
        vbEmail.setAlignment(Pos.CENTER);
        vbEmail.setPadding(new Insets(0,60,0,60));
        vbForget = new VBox(lblforget);
        vbForget.setAlignment(Pos.CENTER_RIGHT);
        vbForget.setPadding(new Insets(0,60,10,25));
        
        vbLogin = new VBox(3, loginBtn, lblsignup);
        vbLogin.setAlignment(Pos.CENTER);
        
        vbWoofy = new VBox(lblWoofy, lblCare);
        vbWoofy.setAlignment(Pos.BOTTOM_CENTER);
        
        borderVb = new VBox(vbTitle, vbEmail, vbForget, vbLogin);
        
        sp = new StackPane();
        sp.getChildren().addAll(rectang, borderVb);
        sp.setPadding(new Insets(35,25,25,25));
        
        mainVb = new VBox(dogImgView, sp, vbWoofy);
        mainVb.setStyle("-fx-background-color: #5AB2FF;");
        
        loginBtn.setOnAction(e -> {
        	String email = emailTf.getText();
        	String pass = passTf.getText();
        	if(email.isEmpty()) {
        		showAlert("Error Email", "Email must be filled");
        	}else if(!email.contains("@")) {
        		showAlert("Error Email", "Email must have @");
        	} else if(!email.endsWith(".com")) {
        		showAlert("Error Email", "Email must end with .com");
        	} else if(pass.isEmpty()) {
        		showAlert("Error Password", "Password must be filled");
        	} else if(pass.length() < 6) {
        		showAlert("Error Password", "Password must be at least 6 characters");
        	} else {
        		HomePage homePage = new HomePage();
    		    try {
    		        homePage.start(new Stage());
    		        // Tutup jendela HomePage
    		        ((Stage) loginBtn.getScene().getWindow()).close();
    		    } catch (Exception exception) {
    		        exception.printStackTrace();
    		    }
        	}
		});
        
        lblsignup.setOnMouseClicked(e -> {
		    register2 registerPage = new register2();
		    try {
		        registerPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) lblsignup.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
        
        scene = new Scene(mainVb, 400, 700);
        
        
        
	}

	public void showAlert(String title, String message) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle(title);
		alert.setContentText(message);
		alert.showAndWait();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		login();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
