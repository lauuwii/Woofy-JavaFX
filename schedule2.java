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
import main.HomePage;
import main.dogWalker1;
import main.health2;
import main.ProfileDog2;

public class schedule2 extends Application{
	
	Label lbltitle, lblVaksin, lblEat, lblEatSchedule, lblTime1, lblTime2, lblTime3, lblTime4, lblMeal1, lblMeal2
			, lblMeal3, lblMeal4;
	Rectangle rectangNavbar, rectang1, rectang2, rectang3, rectang4, rectang5, rectangtaskbar;
	Image homeLogo, dogwalkerLogo, healthLogo, scheduleLogo, profileLogo, artichelImg, dogImg;
	ImageView homeImgView, dogWalkImgView, healthImgView, scheduleImgView, 
				profileImgView, artichleImgView, dogImgView;
	Button  homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn, btnVaksin, btnEat;
	HBox hbox1, hbox2, hbox3, hbox4, hbox5, taskbar;
	VBox vboxMeal, mainVb, labelVb;
	StackPane spNavbar, sp1, sp2, sp3, sp4, sp5, spTaskBar;
	Scene scene;
	
	public void eatSchedule() {
		lbltitle = new Label("Schedule");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lbltitle.setTextFill(Color.BEIGE);
        
        lblVaksin = new Label("Vaksin Schedule");
        lblVaksin.setFont(Font.font("Inter", FontWeight.BLACK, 20));
        lblVaksin.setStyle("-fx-text-fill: #A0DEFF; ");
        
        lblEat = new Label("Eat Schedule");
        lblEat.setFont(Font.font("Inter", FontWeight.BLACK, 20));
        lblEat.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblEatSchedule = new Label("Eat Schedule");
        lblEatSchedule.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblEatSchedule.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblTime1 = new Label("08:00");
        lblTime1.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblTime1.setStyle("-fx-text-fill: #5AB2FF; ");

        lblTime2 = new Label("12:00");
        lblTime2.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblTime2.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblTime3 = new Label("16:00");
        lblTime3.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblTime3.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblTime4 = new Label("20:00");
        lblTime4.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblTime4.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblMeal1 = new Label("Meal1");
        lblMeal1.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblMeal1.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblMeal2 = new Label("Meal2");
        lblMeal2.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblMeal2.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblMeal3 = new Label("Meal3");
        lblMeal3.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblMeal3.setStyle("-fx-text-fill: #5AB2FF; ");
        
        lblMeal4 = new Label("Meal4");
        lblMeal4.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblMeal4.setStyle("-fx-text-fill: #5AB2FF; ");
        
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
        
        btnVaksin = new Button("Vaksin Schedule");
        btnVaksin.setPrefSize(170,  60);
        btnVaksin.setFont(Font.font("Inter", FontWeight.BLACK, 18));
        btnVaksin.setStyle("-fx-text-fill: #A0DEFF; -fx-background-color: #FFF9D0;");
        
        btnEat = new Button("Eat Schedule");
        btnEat.setPrefSize(140, 60);
        btnEat.setFont(Font.font("Inter", FontWeight.BLACK, 18));
        btnEat.setStyle("-fx-text-fill: #5AB2FF; -fx-background-color: #FFF9D0;");
        
        rectang1 = new Rectangle(350, 60);
        rectang1.setStyle("-fx-fill: #FFF9D0;");
        rectang2 = new Rectangle(350, 60);
        rectang2.setStyle("-fx-fill: #FFF9D0;");
        rectang3 = new Rectangle(350, 60);
        rectang3.setStyle("-fx-fill: #FFF9D0;");
        rectang4 = new Rectangle(350, 60);
        rectang4.setStyle("-fx-fill: #FFF9D0;");
        rectang5 = new Rectangle(350, 60);
        rectang5.setStyle("-fx-fill: #FFF9D0;");
        rectangNavbar = new Rectangle(400, 60);
        rectangNavbar.setStyle("-fx-fill: #5AB2FF;");
        rectangtaskbar = new Rectangle(400, 65);
		rectangtaskbar.setStyle("-fx-fill: #5AB2FF;");
        
        spNavbar = new StackPane();
        spNavbar.getChildren().addAll(rectangNavbar, lbltitle);
//        spNavbar.setAlignment(Pos.TOP_CENTER);
        hbox1 = new HBox(30, btnVaksin, btnEat);
        hbox1.setAlignment(Pos.CENTER);
        
        sp1 = new StackPane();
        sp1.getChildren().addAll(rectang1, hbox1);
        
        labelVb = new VBox(lblEatSchedule);
        labelVb.setPadding(new Insets(10,0,-20,25));
        
        hbox2 = new HBox(40, lblTime1, lblMeal1);
        hbox2.setPadding(new Insets(10,0,0,45));
        
        sp2 = new StackPane();
        sp2.getChildren().addAll(rectang2, hbox2);
        
        hbox3 = new HBox(40, lblTime2, lblMeal2);
        hbox3.setPadding(new Insets(10,0,0,45));
        
        sp3 = new StackPane();
        sp3.getChildren().addAll(rectang3, hbox3);
        
        hbox4 = new HBox(40, lblTime3, lblMeal3);
        hbox4.setPadding(new Insets(10,0,0,45));
        
        sp4 = new StackPane();
        sp4.getChildren().addAll(rectang4, hbox4);
        
        hbox5 = new HBox(40, lblTime4, lblMeal4);
        hbox5.setPadding(new Insets(10,0,0,45));
        
        sp5 = new StackPane();
        sp5.getChildren().addAll(rectang5, hbox5);
        sp5.setPadding(new Insets(0,0,110,0));
        
        taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 5, 0));
		
		spTaskBar = new StackPane();
		spTaskBar.getChildren().addAll(rectangtaskbar, taskbar);
        
        mainVb = new VBox(20, spNavbar, sp1, labelVb, sp2, sp3, sp4, sp5, spTaskBar);
        mainVb.setStyle("-fx-background-color: #CAF4FF;");
        
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

        
        scene = new Scene(mainVb, 400, 700);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		eatSchedule();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
