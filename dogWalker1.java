package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
import main.dogWalker2;
import main.HomePage;

public class dogWalker1 extends Application{
	
	Label lbltitle, lblVendor, lblOrder, lblSearch, lblName1, lblName2, lblName3, lblLoc1, lblLoc2, lblLoc3,
			lblChat1, lblChat2, lblChat3, lblChat4, lblNext;
	Rectangle rectangBorder1, rectangBorder2, rectangBorder3, rectangBorder4, rectangBorder5, rectangBorder6,
			rectangTb;
	Image homeLogo, dogwalkerLogo, healthLogo, scheduleLogo, artichelImg, profileLogo;
	ImageView homeImgView, dogWalkImgView, healthImgView, scheduleImgView, 
	artichleImgView, profileImgView;
	TextField searchTf;
	Button btnChat1, btnChat2, btnChat3, btnChat4, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn
			, btnOrder, btnVendor;
	HBox hbox1, hbox2, hbox3, hbox4, taskbar;
	VBox vbox1, vbox2, vbox3, mainVb, vb, vbBtn;
	StackPane spNavbar, spVO, spSearch, spName1, spName2, spName3, spTaskbar;
	
	Scene scene;
	
	public void VendorList() {
		lbltitle = new Label("Dog Walker");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lbltitle.setTextFill(Color.BEIGE);
        
        lblNext = new Label("NEXT");
		lblNext.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lblNext.setTextFill(Color.BEIGE);
        
        lblVendor = new Label("Vendor List");
        lblVendor.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblVendor.setStyle("-fx-underline: true;");
        lblOrder = new Label("Order Now");
        lblOrder.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        
        searchTf = new TextField("Search vendor");
        searchTf.setPrefHeight(40);
        searchTf.setStyle("-fx-background-color: #F3EDC8;");
        searchTf.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        
        lblSearch = new Label("Search vendor");
        lblSearch.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblName1 = new Label("Dog Walker SetiaBudi");
        lblName1.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblName2 = new Label("Siti Maksita");
        lblName2.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        lblName3 = new Label("Dog Walker Binus");
        lblName3.setFont(Font.font("Inter", FontWeight.LIGHT, 18));
        
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
        
        btnVendor = new Button("Vendor List");
        btnVendor.setPrefSize(100, 50);
        btnVendor.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        btnVendor.setStyle("-fx-underline: true; -fx-background-color: #F3EDC8; ");
        btnOrder = new Button("Order Now");
        btnOrder.setPrefSize(100, 50);
        btnOrder.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        btnOrder.setStyle("-fx-background-color: #F3EDC8; ");
//        btnOrder.setStyle("-fx-underline: true;");
		
        lblLoc1 = new Label("Kuningan timur");
        lblLoc2 = new Label("Senayan");
        lblLoc3 = new Label("Rawa Belong");
        
        btnChat1 = new Button("Chat now");
        btnChat1.setPrefSize(80, 15);
        btnChat1.setStyle("-fx-background-color: #5AB2FF; ");
        btnChat1.setFont(Font.font("Inter", FontWeight.BLACK, 12));
        btnChat1.setTextFill(Color.BEIGE);
        btnChat2 = new Button("Chat now");
        btnChat2.setPrefSize(80, 15);
        btnChat2.setStyle("-fx-background-color: #5AB2FF; ");
        btnChat2.setFont(Font.font("Inter", FontWeight.BLACK, 12));
        btnChat2.setTextFill(Color.BEIGE);
        btnChat3 = new Button("Chat now");
        btnChat3.setPrefSize(80, 15);
        btnChat3.setStyle("-fx-background-color: #5AB2FF; ");
        btnChat3.setFont(Font.font("Inter", FontWeight.BLACK, 12));
        btnChat3.setTextFill(Color.BEIGE);
        btnChat4 = new Button("Check more");
        btnChat4.setPrefSize(100, 15);
        btnChat4.setStyle("-fx-background-color: #5AB2FF; ");
        btnChat4.setFont(Font.font("Inter", FontWeight.BLACK, 12));
        btnChat4.setTextFill(Color.BEIGE);
        
        rectangBorder1 = new Rectangle(400, 60);
        rectangBorder1.setStyle("-fx-fill: #5AB2FF;");
        rectangBorder2 = new Rectangle(300, 40);
        rectangBorder2.setStyle("-fx-fill: #F3EDC8;");
        rectangBorder3 = new Rectangle(300, 40, Color.BEIGE);
        
        rectangBorder4 = new Rectangle(300, 80, Color.BEIGE);
        rectangBorder5 = new Rectangle(300, 80, Color.BEIGE);
        rectangBorder6 = new Rectangle(300, 80, Color.BEIGE);
        
        rectangTb = new Rectangle(400, 65);
		rectangTb.setStyle("-fx-fill: #5AB2FF;");
        
        hbox1 = new HBox(50, btnVendor, btnOrder);
        hbox1.setAlignment(Pos.TOP_CENTER);
        hbox1.setPadding(new Insets(25,25,25,25));
        
        vbox1 = new VBox(5, lblName1, lblLoc1);
        vbox2 = new VBox(5, lblName2, lblLoc2);
        vbox3 = new VBox(5, lblName3, lblLoc3);
        
        hbox2 = new HBox(20, vbox1, btnChat1);
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.setPadding(new Insets(25,25,25,40));
        hbox3 = new HBox(102, vbox2, btnChat2);
        hbox3.setAlignment(Pos.CENTER_LEFT);
        hbox3.setPadding(new Insets(25,25,25,40));
        hbox4 = new HBox(52, vbox3, btnChat3);
        hbox4.setAlignment(Pos.CENTER_LEFT);
        hbox4.setPadding(new Insets(25,25,25,40));
        
        vb = new VBox(30, lblSearch);
        vb.setAlignment(Pos.CENTER_LEFT);
        vb.setPadding(new Insets(25,25,25,40));
        
        vbBtn = new VBox(20, btnChat4);
        vbBtn.setAlignment(Pos.CENTER);
        vbBtn.setPadding(new Insets(25,25,60,25));
        
        spNavbar = new StackPane();
        spNavbar.getChildren().addAll(rectangBorder1, lbltitle);
        
        spVO = new StackPane();
        spVO.getChildren().addAll(rectangBorder2, hbox1);
        
        spSearch = new StackPane();
        spSearch.getChildren().addAll(searchTf);
        spSearch.setPadding(new Insets(-30,50,-15,50));
        
        spName1 = new StackPane();
        spName1.getChildren().addAll(rectangBorder4, hbox2);
        spName1.setPadding(new Insets(0,25,-25,25));
        
        spName2 = new StackPane();
        spName2.getChildren().addAll(rectangBorder5, hbox3);
        spName2.setPadding(new Insets(0,25,-25,25));
        
        spName3 = new StackPane();
        spName3.getChildren().addAll(rectangBorder6, hbox4);
        spName3.setPadding(new Insets(0,25,0,25));
        
        taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 5, 0));
		
		spTaskbar = new StackPane();
		spTaskbar.getChildren().addAll(rectangTb, taskbar);
        
//        spTaskbar = new StackPane();
//        spTaskbar.getChildren().addAll(rectangTb, lblNext);
        
        mainVb = new VBox(20, spNavbar, spVO, spSearch, spName1, spName2, spName3, vbBtn, spTaskbar);
        mainVb.setStyle("-fx-background-color: #ADD8E6; ");
        
        btnOrder.setOnAction(e -> {
		    dogWalker2 dogWalker2Page = new dogWalker2();
		    try {
		        dogWalker2Page.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) btnOrder.getScene().getWindow()).close();
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
		VendorList();
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
