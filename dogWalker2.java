package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.dogWalker1;
import main.HomePage;

public class dogWalker2 extends Application{
	
	Label lbltitle, lblVendor, lblOrder, lblBookDate, lblBookTime;
	DatePicker bookDate;
//	TextField bookTime;
	ComboBox<String> bookTime;
	Image homeLogo, dogwalkerLogo, healthLogo, scheduleLogo, profileLogo, artichelImg, dogImg;
	ImageView homeImgView, dogWalkImgView, healthImgView, scheduleImgView, 
				profileImgView, artichleImgView, dogImgView;
	Rectangle rectangBorder2, rectangBorder1, rectangDate, rectangTime, rectangtaskbar;
	Button homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn, btnOrder, btnVendor, confirmBtn;
	HBox hbox1, taskbar;
	VBox mainVb, vbDate, vbTime, dogImgVb, btnVb;
	Image dogWalkerimg;
	ImageView dogWalkImgV;
	StackPane spVO, spNavbar, spDate, spTime, spTaskBar;
	
	Scene scene;
	
	public void OrderNow() {
		lbltitle = new Label("Dog Walker");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lbltitle.setTextFill(Color.BEIGE);
        
        lblBookDate = new Label("Booking Date");
        lblBookTime = new Label("Booking Time");
        
        lblVendor = new Label("Vendor List");
        lblVendor.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblOrder = new Label("Order Now");
        lblOrder.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblOrder.setStyle("-fx-underline: true;");
        
        dogWalkerimg = new Image(getClass().getResourceAsStream("dog-walker.png"));
        dogWalkImgV = new ImageView(dogWalkerimg);
        dogWalkImgV.setFitHeight(200);
		dogWalkImgV.setFitWidth(220);
        
        bookDate = new DatePicker();
        bookDate.setPrefWidth(280);
        bookTime = new ComboBox<>();
        bookTime.getItems().addAll("10.00", "13.00", "17.00", "20.00");
        bookTime.setPrefWidth(280);
        
        homeLogo = new Image(getClass().getResourceAsStream("home.png"));
        homeImgView = new ImageView(homeLogo);
        homeImgView.setFitHeight(50);
		homeImgView.setFitWidth(50);
		
		scheduleLogo = new Image(getClass().getResourceAsStream("schedule.png"));
        scheduleImgView = new ImageView(scheduleLogo);
        scheduleImgView.setFitHeight(50);
		scheduleImgView.setFitWidth(50);
		
		healthLogo = new Image(getClass().getResourceAsStream("health.png"));
        healthImgView = new ImageView(healthLogo);
        healthImgView.setFitHeight(50);
		healthImgView.setFitWidth(50);
		
		dogwalkerLogo = new Image(getClass().getResourceAsStream("dogwalker.png"));
        dogWalkImgView = new ImageView(dogwalkerLogo);
        dogWalkImgView.setFitHeight(50);
		dogWalkImgView.setFitWidth(50);
		
		profileLogo = new Image(getClass().getResourceAsStream("dogprofile.png"));
        profileImgView = new ImageView(profileLogo);
        profileImgView.setFitHeight(50);
		profileImgView.setFitWidth(50);
		
		homeBtn = new Button();
        homeBtn.setGraphic(homeImgView);
        homeBtn.setStyle("-fx-background-color: #5AB2FF; ");
        scheduleBtn = new Button();
        scheduleBtn.setGraphic(scheduleImgView);
        scheduleBtn.setStyle("-fx-background-color: #5AB2FF; ");
        healthBtn = new Button();
        healthBtn.setGraphic(healthImgView);
        healthBtn.setStyle("-fx-background-color: #5AB2FF; ");
        dogWalkBtn = new Button();
        dogWalkBtn.setGraphic(dogWalkImgView);
        dogWalkBtn.setStyle("-fx-background-color: #5AB2FF; ");
        dogProfileBtn = new Button();
        dogProfileBtn.setGraphic(profileImgView);
        dogProfileBtn.setStyle("-fx-background-color: #5AB2FF; ");
        
        confirmBtn = new Button("Confim");
//        confirmBtn.setStyle("-fx-background-color: #5AB2FF; ");
        confirmBtn.setPrefSize(100, 15);
        confirmBtn.setStyle("-fx-background-color: #5AB2FF; ");
        confirmBtn.setFont(Font.font("Inter", FontWeight.BLACK, 12));
        confirmBtn.setTextFill(Color.BEIGE);
        
        btnVendor = new Button("Vendor List");
        btnVendor.setPrefSize(100, 38);
        btnVendor.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        btnVendor.setStyle("-fx-background-color: #F3EDC8; ");
        btnOrder = new Button("Order Now");
        btnOrder.setPrefSize(100, 38);
        btnOrder.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        btnOrder.setStyle("-fx-underline: true; -fx-background-color: #F3EDC8; ");
        
        rectangtaskbar = new Rectangle(400, 65);
		rectangtaskbar.setStyle("-fx-fill: #5AB2FF;");
        rectangBorder2 = new Rectangle(300, 40);
        rectangBorder2.setStyle("-fx-fill: #F3EDC8; ");
        rectangBorder1 = new Rectangle(400, 60, Color.DODGERBLUE);
        rectangDate = new Rectangle(300, 60, Color.BEIGE);
        rectangTime= new Rectangle(300, 60, Color.BEIGE);
        
        dogImgVb = new VBox(dogWalkImgV);
        dogImgVb.setAlignment(Pos.CENTER);
        
        hbox1 = new HBox(50, btnVendor, btnOrder);
        hbox1.setAlignment(Pos.TOP_CENTER);
        hbox1.setPadding(new Insets(25,25,25,25));
        
        vbDate = new VBox(5, lblBookDate, bookDate);
        vbDate.setAlignment(Pos.CENTER_LEFT);
        vbDate.setPadding(new Insets(25,25,25,35));
        
        vbTime = new VBox(5, lblBookTime, bookTime);
        vbTime.setAlignment(Pos.CENTER_LEFT);
        vbTime.setPadding(new Insets(25,10,25,35));
        
        btnVb = new VBox(confirmBtn);
        btnVb.setAlignment(Pos.CENTER);
        btnVb.setPadding(new Insets(0, 25,39,25));
        
        spNavbar = new StackPane();
        spNavbar.getChildren().addAll(rectangBorder1, lbltitle);
        
        spVO = new StackPane();
        spVO.getChildren().addAll(rectangBorder2, hbox1);
        spVO.setPadding(new Insets(0,25,-35,25));
        spDate = new StackPane();
        spDate.getChildren().addAll(rectangDate, vbDate);
        spDate.setPadding(new Insets(-35,25,0,25));
        spTime = new StackPane();
        spTime.getChildren().addAll(rectangTime, vbTime);
        spTime.setPadding(new Insets(-25,25,0,25));
        
        taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 5, 0));
		
		spTaskBar = new StackPane();
		spTaskBar.getChildren().addAll(rectangtaskbar, taskbar);
        
        mainVb = new VBox(20, spNavbar, spVO, dogImgVb, spDate, spTime, btnVb, spTaskBar);
        mainVb.setStyle("-fx-background-color: #ADD8E6; ");
        
        btnVendor.setOnAction(e -> {
		    dogWalker1 dogWalkerPage = new dogWalker1();
		    try {
		        dogWalkerPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) btnVendor.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
        
        homeBtn.setOnAction(e -> {
		    HomePage homePage = new HomePage();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) homeBtn.getScene().getWindow()).close();
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
		OrderNow();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
