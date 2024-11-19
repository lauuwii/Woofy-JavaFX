package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class health extends Application{
	
	Image healthImage, doc1Img, doc2Img;
	
	Label healtlbl, findvetlbl, onlineConsultlbl;
	Button doctor1Btn, doctor2Btn, goNow;
	HBox doctor1Hbox, doctor2Hbox, healtImgBox;
	VBox doctor1Vbox, doctor2Vbox, mainVbox;
	ImageView healthImageView, doc1ImgView, doc2ImgView;
	BorderPane bp;
	
	Scene scene;
	
	public void healthPage() {
		healthImage = new Image(getClass().getResourceAsStream("doghealth.jpg"));
		doc1Img = new Image(getClass().getResourceAsStream("doc1.jpg"));
		doc2Img = new Image(getClass().getResourceAsStream("doc2.jpg"));
		
		healtlbl = new Label("Health");
		healtlbl.setFont(Font.font("Arial", FontWeight.BOLD, 48));
        healtlbl.setTextFill(Color.GOLD);
        
        onlineConsultlbl = new Label("Online Consultation");
        
        healthImageView = new ImageView(healthImage);
        doc1ImgView = new ImageView(doc1Img);
        doc2ImgView = new ImageView(doc2Img);
        
        doctor1Btn = new Button("Drh. Jonathan Setisaro.SKH MM");
        doctor1Btn.setPrefWidth(250);
        doctor1Btn.setStyle("-fx-background-color: #FFFFE0; -fx-text-fill: black; -fx-font-size: 16px;");
        
        doctor2Btn = new Button("Drh. Vionita Santosa.SKH MM");
        doctor2Btn.setPrefWidth(250);
        doctor2Btn.setStyle("-fx-background-color: #FFFFE0; -fx-text-fill: black; -fx-font-size: 16px;");
		
        goNow = new Button("Go now");
        goNow.setPrefWidth(100);
        goNow.setStyle("-fx-background-color: #00BFFF; -fx-text-fill: white; -fx-font-size: 14px;");
        
        healtImgBox = new HBox(10, healthImageView);
        healtImgBox.setAlignment(Pos.TOP_CENTER);
        healtImgBox.setPadding(new Insets(20));
//        bp = new BorderPane();
//        bp.setTop(healthImageView);
        
        doctor1Hbox = new HBox(10, doc1ImgView, doctor1Btn);
        doctor1Hbox.setAlignment(Pos.CENTER_LEFT);
        doctor1Hbox.setPadding(new Insets(20));
        
        doctor2Hbox = new HBox(10, doc2ImgView, doctor2Btn);
        doctor2Hbox.setAlignment(Pos.CENTER_LEFT);
        doctor2Hbox.setPadding(new Insets(20));
        
        doctor1Vbox = new VBox(10, doctor1Hbox, new Label("Biaya konsultasi: Rp.50.000"), new HBox(10, new Label("10 tahun"), new Label("98%"), goNow));
        doctor1Vbox.setAlignment(Pos.CENTER);
        doctor1Vbox.setPadding(new Insets(20));
        
        doctor2Vbox = new VBox(10, doctor2Hbox, new Label("Biaya konsultasi: Rp.50.000"), new HBox(10, new Label("10 tahun"), new Label("99%"), goNow));
        doctor2Vbox.setAlignment(Pos.CENTER);
        doctor2Vbox.setPadding(new Insets(20));
        
        mainVbox = new VBox(20, healtlbl, findvetlbl, healtImgBox, onlineConsultlbl, doctor1Vbox, doctor2Vbox);
        mainVbox.setAlignment(Pos.CENTER);
        mainVbox.setPadding(new Insets(25,25,25,25));
        
        mainVbox.setStyle("-fx-background-color: #800000; ");
        
        scene = new Scene(mainVbox, 400, 700);
        scene.setFill(Color.LIGHTBLUE);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		healthPage();
		primaryStage.setTitle("Health App");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
