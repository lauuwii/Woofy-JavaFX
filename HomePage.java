package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import main.health2;
import main.schedule2;
import main.ProfileDog2;


public class HomePage extends Application{
	
	Label lbltitle, lblgreet, lblarticle, lblmoney, lblcoin;
	Image homeLogo, moneyLogo, dogwalkerLogo, healthLogo, scheduleLogo, profileLogo, artichelImg, dogImg, histImg;
	ImageView homeImgView, moneyImgView, dogWalkImgView, healthImgView, scheduleImgView, 
				profileImgView, artichleImgView, dogImgView, histImgView;
	Rectangle rectangnavBar, rectangGreet, rectangArticle, rectangtaskbar, rectangSaldo;
	Button topUpBtn, historyBtn, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn;
	HBox navBar, taskbar, saldoHb, btnHb;
	VBox saldoVb, greetVb, mainVb, articleVb;
	StackPane spNavbar, spSaldo, spGreet, spArticle, spTaskBar;
	Scene scene;
	
	public void home() {
		lbltitle = new Label("Woofy");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lbltitle.setTextFill(Color.BEIGE);
        
        lblgreet = new Label("Welcome back, Bon");
        lblgreet.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblgreet.setTextFill(Color.BLACK);
        
        lblmoney = new Label("Rp 1.989.000");
        lblmoney.setFont(Font.font("Inter", FontWeight.LIGHT, 16));
        lblmoney.setTextFill(Color.BLACK);
        
        lblcoin = new Label("1000 coin");
        lblcoin.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        lblcoin.setTextFill(Color.BLACK);
        
        lblarticle = new Label("New Articles");
        lblarticle.setFont(Font.font("Inter", FontWeight.BLACK, 17));
        lblarticle.setTextFill(Color.BLACK);
        
        
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
		
		histImg = new Image(getClass().getResourceAsStream("history.png"));
        histImgView = new ImageView(histImg);
        histImgView.setFitHeight(30);
		histImgView.setFitWidth(40);
		
		dogImg = new Image(getClass().getResourceAsStream("dog3.png"));
		dogImgView = new ImageView(dogImg);
		dogImgView.setFitHeight(45);
		dogImgView.setFitWidth(45);
		
		moneyLogo = new Image(getClass().getResourceAsStream("money.png"));
		moneyImgView = new ImageView(moneyLogo);
		moneyImgView.setFitHeight(30);
		moneyImgView.setFitWidth(40);
		
		artichelImg = new Image(getClass().getResourceAsStream("article.jpg"));
		artichleImgView = new ImageView(artichelImg);
		artichleImgView.setFitHeight(220);
		artichleImgView.setFitWidth(340);
		
		topUpBtn = new Button();
        topUpBtn.setPrefSize(60, 30);
        topUpBtn.setGraphic(moneyImgView);
        topUpBtn.setStyle("-fx-background-color: #5AB2FF; ");
        historyBtn = new Button();
        historyBtn.setGraphic(histImgView);
        historyBtn.setStyle("-fx-background-color: #5AB2FF; ");
//        historyBtn.setPrefSize(60, 30);
        
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
		
		rectangnavBar = new Rectangle(400, 70);
		rectangnavBar.setStyle("-fx-fill: #5AB2FF;");
		rectangGreet = new Rectangle(370, 150, Color.BEIGE);
		rectangGreet.setArcHeight(20);
        rectangGreet.setArcWidth(20);
		rectangArticle = new Rectangle(370, 250, Color.BEIGE);
		rectangArticle.setArcHeight(20);
        rectangArticle.setArcWidth(20);
		rectangtaskbar = new Rectangle(400, 65);
		rectangtaskbar.setStyle("-fx-fill: #5AB2FF;");
		rectangSaldo = new Rectangle(345, 80);
		rectangSaldo.setArcHeight(20);
        rectangSaldo.setArcWidth(20);
        rectangSaldo.setStyle("-fx-fill: #A0DEFF;");
		
		navBar = new HBox(187, lbltitle, dogImgView);
//		navBar.setAlignment(Pos.TOP_CENTER);
		navBar.setPadding(new Insets(13,15,25,30));
		
		saldoVb = new VBox(lblmoney, lblcoin);
//		saldoVb.setPadding(new Insets(25,25,25,25));
		
		btnHb = new HBox(10, topUpBtn, historyBtn);
		saldoHb = new HBox(80, saldoVb, btnHb);
		saldoHb.setPadding(new Insets(25,25,25,20));
		
		spSaldo = new StackPane();
		spSaldo.getChildren().addAll(rectangSaldo, saldoHb);
//		spSaldo.setPadding(new Insets(25,25,25,25));
		
		greetVb = new VBox(0, lblgreet, spSaldo);
		greetVb.setPadding(new Insets(25,25,25,25));
		
		spArticle = new StackPane();
		spArticle.getChildren().addAll(rectangArticle, artichleImgView);
		spArticle.setPadding(new Insets(-20,0,82,0));
		
		articleVb = new VBox(lblarticle);
		articleVb.setPadding(new Insets(-25,25,-50,25));
		
		spGreet = new StackPane();
		spGreet.getChildren().addAll(rectangGreet, greetVb);
		spGreet.setPadding(new Insets(-25,0,0,0));
		
		spNavbar = new StackPane();
		spNavbar.getChildren().addAll(rectangnavBar, navBar);
		spNavbar.setAlignment(Pos.TOP_CENTER);
//		spNavbar.setPadding(new Insets(25,25,25,25));
		
		taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 5, 0));
		
		spTaskBar = new StackPane();
		spTaskBar.getChildren().addAll(rectangtaskbar, taskbar);
		
		mainVb = new VBox(20, spNavbar, spGreet, articleVb, spArticle, spTaskBar);
		mainVb.setStyle("-fx-background-color: #CAF4FF; ");
		
		// Di kelas HomePage

		dogWalkBtn.setOnAction(e -> {
		    dogWalker1 dogWalkerPage = new dogWalker1();
		    try {
		        dogWalkerPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) dogWalkBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		healthBtn.setOnAction(e -> {
		    health2 healthPage = new health2();
		    try {
		        healthPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) healthBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		scheduleBtn.setOnAction(e -> {
		    schedule2 schedule2Page = new schedule2();
		    try {
		        schedule2Page.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) scheduleBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		dogProfileBtn.setOnAction(e -> {
		    ProfileDog2 dogProfilePage = new ProfileDog2();
		    try {
		        dogProfilePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) dogProfileBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		dogImgView.setOnMouseClicked(e -> {
		    ProfileDog2 dogProfilePage = new ProfileDog2();
		    try {
		        dogProfilePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) dogImgView.getScene().getWindow()).close();
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
		home();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
