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
import javafx.scene.control.skin.DatePickerSkin;
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

public class ProfileDog2 extends Application{
	
	Label lbltitle, lbldogName, lblInfo, lblhealthInfo;
	Rectangle rectangNavbar;
	Image dogImg;
	ImageView dogImgView;
	TextField nameTf, breedTf, weightTf;
	ComboBox<String> genderCb;
	DatePicker BodDp, vetApointDp;
	DatePickerSkin dpSkin;
	StackPane spNavbar;
	VBox dogNameVb, infoVb, healthInfoVb, mainVb, imgVb, btnVb;
	Button nextBtn;
	
	Scene scene;
	
	public void profileDog() {
		lbltitle = new Label("Profile");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lbltitle.setTextFill(Color.BEIGE);
        
        lbldogName = new Label("Name");
        lbldogName.setFont(Font.font("Inter", FontWeight.MEDIUM,15));
        lbldogName.setStyle("-fx-text-fill: #5AB2FF;");
        
        lblInfo = new Label("Information");
        lblInfo.setFont(Font.font("Inter", FontWeight.MEDIUM,15));
        lblInfo.setStyle("-fx-text-fill: #5AB2FF;");
        
        lblhealthInfo = new Label("Health Information");
        lblhealthInfo.setFont(Font.font("Inter", FontWeight.MEDIUM,15));
        lblhealthInfo.setStyle("-fx-text-fill: #5AB2FF;");
        
        nextBtn = new Button("Next");
        nextBtn.setPrefSize(120, 15);
        nextBtn.setStyle("-fx-background-color: #5AB2FF; ");
        nextBtn.setFont(Font.font("Inter", FontWeight.BLACK, 16));
        
        nameTf = new TextField("Name");
        nameTf.setPrefSize(100, 30);
        nameTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        nameTf.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        breedTf = new TextField("Breed");
        breedTf.setPrefSize(300, 30);
        breedTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        breedTf.setPrefSize(100, 30);
        breedTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        breedTf.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        weightTf = new TextField("Weight");
        weightTf.setPrefSize(300, 30);
        weightTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        weightTf.setPrefSize(100, 30);
        weightTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        weightTf.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        genderCb = new ComboBox<>();
        genderCb.getItems().addAll("Boy", "Girl");
        genderCb.setPrefSize(300, 30);
//        nameTf.setPrefSize(100, 30);
//        nameTf.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        genderCb.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        BodDp = new DatePicker();
        BodDp.setPrefSize(300, 30);
        BodDp.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        dpSkin = new DatePickerSkin(BodDp);
        dpSkin.getPopupContent().lookup(".date-picker-popup").setStyle("-fx-background-color: #5AB2FF;");
        BodDp.setSkin(dpSkin);
        
        vetApointDp = new DatePicker();
        vetApointDp.setPrefSize(300, 30);
        vetApointDp.setStyle("-fx-background-color: #F3EDC8; -fx-border-color: #5AB2FF; -fx-text-fill: #5AB2FF;");
        
        dogImg = new Image(getClass().getResourceAsStream("dog3.png"));
        dogImgView = new ImageView(dogImg);
        dogImgView.setFitWidth(150);
        dogImgView.setFitHeight(150);
        
        imgVb = new VBox(dogImgView);
        imgVb.setAlignment(Pos.CENTER);
        imgVb.setPadding(new Insets(25,25,25,25));
        
        rectangNavbar = new Rectangle(400, 60);
        rectangNavbar.setStyle("-fx-fill: #5AB2FF;");
        
        spNavbar = new StackPane();
        spNavbar.getChildren().addAll(rectangNavbar, lbltitle);
        
        dogNameVb = new VBox(lbldogName, nameTf);
        dogNameVb.setAlignment(Pos.CENTER_LEFT);
        dogNameVb.setPadding(new Insets(10,50,0,50));
        
        infoVb = new VBox(5, lblInfo, genderCb, breedTf, BodDp);
        infoVb.setAlignment(Pos.CENTER_LEFT);
        infoVb.setPadding(new Insets(5,50,0,50));
        
        healthInfoVb = new VBox(5, lblhealthInfo, weightTf, vetApointDp);
        healthInfoVb.setAlignment(Pos.CENTER_LEFT);
        healthInfoVb.setPadding(new Insets(5,50,25,50));
        
        btnVb = new VBox(nextBtn);
        btnVb.setAlignment(Pos.CENTER_RIGHT);
        btnVb.setPadding(new Insets(5,50,5,25));
        
        mainVb = new VBox(spNavbar, imgVb, dogNameVb, infoVb, healthInfoVb, btnVb);
        mainVb.setStyle("-fx-background-color: #CAF4FF;");
        
        nextBtn.setOnAction(e -> {
		    HomePage homePage = new HomePage();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) nextBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
        
        scene = new Scene(mainVb, 400, 700);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		profileDog();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
