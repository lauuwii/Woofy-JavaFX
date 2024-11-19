package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.HomePage;

public class health2 extends Application{
	
	Label lblTitle, lblConsult, lbldoc1, lbldoc2, lbldoc3, lblPrice1, lblPrice2, lblPrice3, 
			lblpriceInfo1, lblpriceInfo2, lblpriceInfo3;
	Image healthImg, doc1Img, doc2Img, doc3Img, homeLogo, dogwalkerLogo, healthLogo, scheduleLogo, 
			artichelImg, profileLogo;
	HBox hbox1, hbox2, hbox3, taskbar;
	VBox vbox, vb, mainVbox, doc1Vb, doc2Vb, doc3Vb, mainVb;
	
	ImageView healthArtImgView, doc1ImgView, doc2ImgView, doc3ImgView, homeImgView, dogWalkImgView, healthImgView, scheduleImgView, 
	artichleImgView, profileImgView;
	Scene scene;
	Button homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn;
	BorderPane bp;
	StackPane stackPane1, stackPane2, stackPane3, spNavBar, spTaskbar;
	
	Rectangle rectangBorder1, rectangBorder2, rectangBorder3, rectangNavBar, rectangTb, clip, clipDoc, clipDoc2, clipDoc3;
	ScrollPane scroll;
	DropShadow dropShadow;
	
	public void healthApp() {
		lblTitle = new Label("Health");
		lblTitle.setFont(Font.font("Inter", FontWeight.BLACK, 32));
        lblTitle.setTextFill(Color.BEIGE);
        
        lblConsult = new Label("Online Consultation");
        lblConsult.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblConsult.setStyle("-fx-text-fill: #5AB2FF;");
//        lblConsult.setPadding(new Insets(25,25,25,15));
        
        lblpriceInfo1 = new Label("Biaya konsultasi:");
        lblpriceInfo1.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblpriceInfo1.setStyle("-fx-text-fill: #5AB2FF;");
        lblpriceInfo2 = new Label("Biaya konsultasi:");
        lblpriceInfo2.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblpriceInfo2.setStyle("-fx-text-fill: #5AB2FF;");
        lblpriceInfo3 = new Label("Biaya konsultasi:");
        lblpriceInfo3.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblpriceInfo3.setStyle("-fx-text-fill: #5AB2FF;");
        
        lbldoc1 = new Label("Drh. Jonathan Setisaro.SKH MM");
        lbldoc1.setFont(Font.font("Inter", FontWeight.EXTRA_BOLD, 14));
        lbldoc1.setStyle("-fx-text-fill: #5AB2FF;");
        lbldoc2 = new Label("Drh. Vionita Santosa.SKH MM");
        lbldoc2.setFont(Font.font("Inter", FontWeight.EXTRA_BOLD, 14));
        lbldoc2.setStyle("-fx-text-fill: #5AB2FF;");
        lbldoc3 = new Label("Drh. Johnny Single.SKH MM");
        lbldoc3.setFont(Font.font("Inter", FontWeight.EXTRA_BOLD, 14));
        lbldoc3.setStyle("-fx-text-fill: #5AB2FF;");
        
        
        lblPrice1 = new Label("Rp 50.000");
        lblPrice1.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblPrice1.setStyle("-fx-text-fill: #5AB2FF;");
        lblPrice2 = new Label("Rp 100.000");
        lblPrice2.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblPrice2.setStyle("-fx-text-fill: #5AB2FF;");
        lblPrice3 = new Label("Rp 10.000");
        lblPrice3.setFont(Font.font("Inter", FontWeight.SEMI_BOLD, 13));
        lblPrice3.setStyle("-fx-text-fill: #5AB2FF;");
        
        healthImg = new Image(getClass().getResourceAsStream("doghealth.jpg"));
        doc1Img = new Image(getClass().getResourceAsStream("doc1a.jpg"));
        doc2Img = new Image(getClass().getResourceAsStream("doc2a.jpg"));
        doc3Img = new Image(getClass().getResourceAsStream("doc4.jpg"));
        
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
        
        healthArtImgView = new ImageView(healthImg);
        healthArtImgView.setFitHeight(170);
		healthArtImgView.setFitWidth(290);
		
		doc1ImgView = new ImageView(doc1Img);
		doc1ImgView.setFitHeight(90);
		doc1ImgView.setFitWidth(90);
		
		doc2ImgView = new ImageView(doc2Img);
		doc2ImgView.setFitHeight(90);
		doc2ImgView.setFitWidth(90);
		
		doc3ImgView = new ImageView(doc3Img);
		doc3ImgView.setFitHeight(90);
		doc3ImgView.setFitWidth(90);
		
		clip = new Rectangle(healthArtImgView.getFitWidth(), healthArtImgView.getFitHeight());
        clip.setArcWidth(30);  // Mengatur radius horizontal
        clip.setArcHeight(30);
        
        clipDoc = new Rectangle(doc1ImgView.getFitWidth(), doc1ImgView.getFitHeight());
        clipDoc.setArcWidth(30);  // Mengatur radius horizontal
        clipDoc.setArcHeight(30);
        
        clipDoc2 = new Rectangle(doc1ImgView.getFitWidth(), doc1ImgView.getFitHeight());
        clipDoc2.setArcWidth(30);  // Mengatur radius horizontal
        clipDoc2.setArcHeight(30);
        
        clipDoc3 = new Rectangle(doc1ImgView.getFitWidth(), doc1ImgView.getFitHeight());
        clipDoc3.setArcWidth(30);  // Mengatur radius horizontal
        clipDoc3.setArcHeight(30);
        
        healthArtImgView.setClip(clip);
        doc1ImgView.setClip(clipDoc);
        doc2ImgView.setClip(clipDoc2);
        doc3ImgView.setClip(clipDoc3);
		
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
        
        rectangTb = new Rectangle(400, 60);
		rectangTb.setStyle("-fx-fill: #5AB2FF;");
        
        vbox = new VBox(40, healthArtImgView);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setPadding(new Insets(25,25,15,25));
        
        vb = new VBox(30, lblConsult);
        vb.setAlignment(Pos.CENTER_LEFT);
        vb.setPadding(new Insets(0,25,0,25));
        
        doc1Vb = new VBox(5, lbldoc1, lblpriceInfo1, lblPrice1);
        doc2Vb = new VBox(5, lbldoc2, lblpriceInfo2, lblPrice2);
        doc3Vb = new VBox(5, lbldoc3, lblpriceInfo3, lblPrice3);
        
        hbox1 = new HBox(20, doc1ImgView, doc1Vb);
        hbox1.setAlignment(Pos.CENTER_LEFT);
        hbox1.setPadding(new Insets(13,25,25,40));
//        hbox.setStyle("-fx-background-color: beige; -fx-background-radius: 5px;");
//        hbox.setMaxWidth(300);
        
        hbox2 = new HBox(20, doc2ImgView, doc2Vb);
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.setPadding(new Insets(13,25,25,40));
        
        hbox3 = new HBox(20, doc3ImgView, doc3Vb);
        hbox3.setAlignment(Pos.CENTER_LEFT);
        hbox3.setPadding(new Insets(13,25,25,40));
        
        taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 0, 0));
        
        rectangBorder1 = new Rectangle(360, 150, Color.BEIGE);
        rectangBorder1.setArcHeight(20);
        rectangBorder1.setArcWidth(20);
        
        rectangBorder2 = new Rectangle(360, 150, Color.BEIGE);
        rectangBorder2.setArcHeight(20);
        rectangBorder2.setArcWidth(20);
        
        rectangBorder3 = new Rectangle(360, 150, Color.BEIGE);
        rectangBorder3.setArcHeight(20);
        rectangBorder3.setArcWidth(20);
        
        rectangNavBar = new Rectangle(400, 70);
        rectangNavBar.setStyle("-fx-fill: #5AB2FF;");
//        rectangNavBar.setArcHeight(20);
//        rectangNavBar.setArcWidth(20);
        
        stackPane1 = new StackPane();
        stackPane1.getChildren().addAll(rectangBorder1, hbox1);
        
        stackPane2 = new StackPane();
        stackPane2.getChildren().addAll(rectangBorder2, hbox2);
//        lblConsult.setStyle("-fx-background-color: #000000; -fx-border-width: 2px; -fx-background-radius: 5px;");
        stackPane3 = new StackPane();
        stackPane3.getChildren().addAll(rectangBorder3, hbox3);
        
        dropShadow = new DropShadow();
        dropShadow.setRadius(10.0);           // Mengatur radius bayangan
        dropShadow.setOffsetX(0.0);           // Mengatur offset horizontal bayangan
        dropShadow.setOffsetY(5.0);           // Mengatur offset vertikal bayangan
        dropShadow.setColor(Color.BLACK);
        
        spNavBar = new StackPane();
        spNavBar.getChildren().addAll(rectangNavBar, lblTitle);
        spNavBar.setEffect(dropShadow);
        
        spTaskbar = new StackPane();
		spTaskbar.getChildren().addAll(rectangTb, taskbar);
        
        mainVbox = new VBox(10, vbox, vb, stackPane1, stackPane2, stackPane3);
        mainVbox.setStyle("-fx-background-color: #ADD8E6; ");
        mainVbox.setPrefSize(400, 800);
        
        scroll = new ScrollPane();
        scroll.setContent(mainVbox);
//        scroll.setPrefSize(400, 700);
        
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);  // Menghilangkan scrollbar horizontal
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);	 // Menghilangkan scrollbar vertical
        
        mainVb = new VBox(-10, spNavBar, scroll, spTaskbar);
//        mainVb.getChildren().addAll(spNavBar, scroll, spTaskbar);
//        mainVb.setStyle("-fx-background-color: #ADD8E6; ");
        
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
		healthApp();
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
