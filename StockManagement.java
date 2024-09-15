import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StockManagement extends Application {
	
    private static ArrayList<String> groupMembers = new ArrayList<>();
	private Stage primaryStage;
	private Scene menusc;
	private static int maxproduct;
	private static ArrayList<Product> Plist;
	
	
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
        groupMembers.add("Ling Ji Xiang");
        groupMembers.add("Ling Zheng Hong");
        groupMembers.add("Charmaine Hooi Wai Yee");
        groupMembers.add("Lee Jia Yu");
        Collections.sort(groupMembers);
        
		//login GUI
//		primaryStage.setResizable(false);  
        VBox vbox = new VBox(30);
		HBox hbox = new HBox(10);
		
		HBox titleBox = new HBox();
		titleBox.setAlignment(Pos.CENTER);
        Text welcome = new Text("Welcome to the SMS!");
        welcome.setFont(Font.font("Segoe UI", FontWeight.BOLD, 50));
        welcome.setFill(Color.rgb(61, 137, 212));
        titleBox.getChildren().add(welcome);
        vbox.getChildren().add(titleBox);
        titleBox.setStyle("-fx-background-color: #c2e0ff;");
        vbox.setAlignment(Pos.TOP_CENTER);
        
   
        // Display current date and time
        HBox subtitleBox = new HBox();
        subtitleBox.setAlignment(Pos.CENTER);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = LocalDateTime.now().format(formatter);
        Text dateTime = new Text(currentDateTime);
        dateTime.setFont(Font.font("Montserrat", FontPosture.ITALIC , 25));
        subtitleBox.getChildren().add(dateTime);
        vbox.getChildren().add(subtitleBox);
        subtitleBox.setStyle(" -fx-background-color: #fabd4d; -fx-border-color: #ffa500;"
        		+ "-fx-border-width: 3px; -fx-border-radius: 5 5 5 5; -fx-background-radius: 5 5 5 5;");
        subtitleBox.setMaxWidth(Control.USE_PREF_SIZE);
        
        
        // Display group members
        Label groupMembersLabel = new Label("Group Members:");
        groupMembersLabel.setFont(Font.font("Segoe UI", FontWeight.BOLD, 30));
        groupMembersLabel.setTextFill(Color.rgb(33, 80, 122));
        vbox.getChildren().add(groupMembersLabel);
        for (String member : groupMembers) {
        	Label memberLabel = new Label("- " + member);
            memberLabel.setFont(Font.font("Roboto", FontWeight.NORMAL, 20));
            memberLabel.setTextFill(Color.rgb(33, 80, 122));
            vbox.getChildren().add(memberLabel);
        }
        
        
        Label wlc = new Label(); //use for menu GUI
        //set background color
		vbox.setStyle("-fx-background-color:#ebf3fc; -fx-padding: 10; -fx-alignment: center;");
		TextField nameinput = new TextField();
		nameinput.setOnAction(e -> {
			UserInfo cur = new UserInfo(nameinput.getText());
			wlc.setText("USERID : " + cur.getUserId());
			
			maxproduct();
		});
		
		Label nameLabel = new Label("Enter Your Full Name: ");
		nameLabel.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
		nameLabel.setTextFill(Color.rgb(33, 80, 122));
		hbox.getChildren().addAll(nameLabel, nameinput);
		hbox.setStyle("-fx-padding: 10; -fx-alignment: center;");
		
		Label instruc = new Label("Press Enter to Continue");
		instruc.setFont(Font.font("Segoe UI", FontWeight.BOLD, 15));
		instruc.setTextFill(Color.rgb(33, 80, 122));
		instruc.setStyle("-fx-alignment: TOP_CENTER;");
		vbox.getChildren().addAll(hbox, instruc);
		
		BorderPane loginpane = new BorderPane();
		loginpane.setCenter(vbox);

		Plist = new ArrayList<>(maxproduct);
//		Plist.add(new TV(1, "Samsung TV", 10, 999.99, "LED", "4K", 55.5));
//		Plist.add(new TV(2, "Samsung Neo TV", 5, 1699.99, "OLED", "4K", 65.0));
//		Plist.add(new TV(3, "LG TV", 20, 2499.99, "LED", "Full HD", 50.0));
//		Plist.add(new TV(4, "Apple TV", 12, 6978.99, "QLED", "4K Ultra HD", 65.5));
//		Plist.add(new TV(5, "Sharp Ultra Slim", 18, 1199.99, "LCD", "8K Ultra HD", 75));
//		Plist.add(new Refrigerator(6, "LG Fridge", 10, 1888.90, "Single-door", "Mint", 325));
//		Plist.add(new Refrigerator(7, "LG Slim French Door Fridge", 8, 2300.00, "Multi-door", "Grey", 465));
//		Plist.add(new Refrigerator(8, "LG Fridge Limited Edition", 5, 3900.90, "Side-by-side", "Sky Blue", 485));
//		Plist.add(new Refrigerator(9, "LG Top Mount Freezer A Series", 10, 2200.90, "Top Mount", "Beige", 375));
//		Plist.add(new Refrigerator(10, "LG Top Mount Freezer X Series", 10, 2300.90, "Top Mount", "White", 375));
//		Plist.add(new Refrigerator(11, "LG Top Mount Freezer S Series", 10, 2400.90, "Top Mount", "Matte Black", 375));
//		Plist.add(new Refrigerator(12, "LG Freezer Limited Edition", 10, 4700.90, "Top Mount", "Clay Pink", 635));
//		Plist.add(new Refrigerator(13, "LG Fridge Pro", 10, 5000.90, "Multi Door", "Black", 694));
//		Plist.add(new WashingMachine(14, "Samsung Front Load Washer", 20, 2089.99, "Front Load", "Quick Wash", 7));
//		Plist.add(new WashingMachine(15, "LG Top Load Washer", 15, 1599.99, "Top Load", "TurboWash", 8));
//		Plist.add(new WashingMachine(16, "Hitachi Front Load Washer", 30, 2499.99, "Front Load", "Auto Self Clean", 9));
//		Plist.add(new WashingMachine(17, "Midea Top Load Washer", 20, 1299.99, "Top Load", "Quick Rinse", 7));
//		Plist.add(new WashingMachine(18, "Haier Front Load Washer", 28, 2099.99, "Front Load", "Steam Wash", 8));
		
		
		//menu GUI
		HBox userbox = new HBox(10);
		userbox.setPadding(new Insets(10));
		VBox menubox = new VBox(10);
		menubox.setPadding(new Insets(10));
		VBox msgbox = new VBox(10);
		msgbox.setPadding(new Insets(10));
		VBox menulayout = new VBox();
		menulayout.getChildren().addAll(userbox,menubox,msgbox);
		
		
		
		wlc.setFont(Font.font("Segoe UI", FontWeight.BOLD, 30));
		wlc.setTextFill(Color.rgb(33, 80, 122));
		userbox.getChildren().add(wlc);
		userbox.setStyle("-fx-border-color: black; -fx-border-width: 0 0 1 0");
		Label Label1 = createLabel("1. View Products");
		Label1.setFont(Font.font("Segoe UI", FontWeight.BOLD, 25));
		Label1.setTextFill(Color.rgb(33, 80, 122));
        Label Label2 = createLabel("2. Add Stock");
        Label2.setFont(Font.font("Segoe UI", FontWeight.BOLD, 25));
        Label2.setTextFill(Color.rgb(33, 80, 122));
        Label Label3 = createLabel("3. Deduct Stock");
        Label3.setFont(Font.font("Segoe UI", FontWeight.BOLD, 25));
        Label3.setTextFill(Color.rgb(33, 80, 122));
        Label Label4 = createLabel("4. Discontinue Product");
        Label4.setFont(Font.font("Segoe UI", FontWeight.BOLD, 25));
        Label4.setTextFill(Color.rgb(33, 80, 122));
        Label Label5 = createLabel("0. Exit");
        Label5.setFont(Font.font("Segoe UI", FontWeight.BOLD, 25));
        Label5.setTextFill(Color.rgb(33, 80, 122));
        
        HBox labelbox1 = new HBox();
        labelbox1.setPadding(new Insets(10));
        labelbox1.getChildren().add(Label1);
        labelbox1.setAlignment(Pos.CENTER);
        HBox labelbox2 = new HBox();
        labelbox2.setPadding(new Insets(10));
        labelbox2.getChildren().add(Label2);
        labelbox2.setAlignment(Pos.CENTER);
        HBox labelbox3 = new HBox();
        labelbox3.setPadding(new Insets(10));
        labelbox3.getChildren().add(Label3);
        labelbox3.setAlignment(Pos.CENTER);
        HBox labelbox4 = new HBox();
        labelbox4.setPadding(new Insets(10));
        labelbox4.getChildren().add(Label4);
        labelbox4.setAlignment(Pos.CENTER);
        HBox labelbox5 = new HBox();
        labelbox5.setPadding(new Insets(10));
        labelbox5.getChildren().add(Label5);
        labelbox5.setAlignment(Pos.CENTER);
        HBoxHover(labelbox1);
        HBoxHover(labelbox2);
        HBoxHover(labelbox3);
        HBoxHover(labelbox4);
        HBoxHover(labelbox5);
        
        menubox.setPadding(new Insets(10));
        menubox.setAlignment(Pos.CENTER);
        menubox.getChildren().addAll(labelbox1,labelbox2,labelbox3,labelbox4,labelbox5);
        
        Label msg = new Label("Choose an option");
        msg.setFont(Font.font("Roboto", FontWeight.NORMAL, 25));
        msgbox.getChildren().add(msg);
        msgbox.setPadding(new Insets(10));
        msgbox.setStyle("-fx-border-color: black; -fx-border-width: 1 0 0 0;");
        
        Scene loginsc = new Scene(loginpane, 900, 600);
		menusc = new Scene(menulayout, 900, 600);
		menulayout.setStyle("-fx-background-color:#ebf3fc; -fx-padding: 10;");
		
		labelbox1.setOnMouseClicked(e -> viewProduct());
		labelbox2.setOnMouseClicked(e -> addStock());
		labelbox3.setOnMouseClicked(e -> deductStock());
		labelbox4.setOnMouseClicked(e -> discontinueProduct());
		labelbox5.setOnMouseClicked(e -> primaryStage.close());
        
		primaryStage.setScene(loginsc);
		primaryStage.setTitle("Stock Management");
		primaryStage.show();
		
	}
	
	private void maxproduct() {
		VBox maxpane = new VBox(10);
		HBox maxbox = new HBox(10);
		HBox msgbox = new HBox(10);
		maxpane.setPadding(new Insets(20));
		maxbox.setPadding(new Insets(10));
		msgbox.setPadding(new Insets(10));
		Label max = createLabel("Please Enter the Maximum number of product : ");
		max.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
		max.setTextFill(Color.rgb(33, 80, 122));
		
		TextField maxinput = new TextField();
		maxinput.setPrefColumnCount(4);
		maxbox.getChildren().addAll(max,maxinput);
		
		Label msg = createLabel("");
		msg.setTextFill(Color.RED);
		msgbox.getChildren().add(msg);
		msgbox.setAlignment(Pos.CENTER);
		maxbox.setAlignment(Pos.CENTER);
		
		HBox continuebox = new HBox(10);
		continuebox.setPadding(new Insets(10));
		
		Button continuebt = new Button("Continue");
		continuebox.getChildren().add(continuebt);
		continuebox.setAlignment(Pos.CENTER);
		continuebt.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
		ButtonHoverGreen(continuebt);
		maxpane.getChildren().addAll(maxbox,msgbox,continuebox);
		maxpane.setAlignment(Pos.CENTER);
		maxpane.setSpacing(20);
		
		maxinput.setOnAction(e -> continuebt.fire());
		
		Scene maxsc = new Scene(maxpane,900,600);
		primaryStage.setScene(maxsc);
		continuebt.setOnAction(e -> {
			try {
				maxproduct = Integer.parseInt(maxinput.getText());
				if(maxproduct >= 0) {
					primaryStage.setScene(menusc);
				}
				else
					msg.setText("Must be larger or equal to 0");
			} catch (NumberFormatException f){
				msg.setText("Invalid Number Format");
				msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
			}
		});
		//set background color
		maxpane.setStyle("-fx-background-color:#ebf3fc; -fx-padding: 10; -fx-alignment: center;");
	}
	
	private void viewProduct() {
		BorderPane productlayout = new BorderPane();
        
		VBox productbox = new VBox(10);
		productbox.setPadding(new Insets(10));
		productbox.setStyle("-fx-background-color:#add7ff;");
		
        ScrollPane scroll = new ScrollPane();
		scroll.setContent(productbox);
		scroll.setFitToWidth(true);
	    scroll.setStyle("-fx-border-color: black");
	    scroll.setStyle("-fx-background-color:#ebf3fc;");
		productlayout.setLeft(scroll);
		productlayout.setStyle("-fx-background-color:#ebf3fc;");
		

		BorderPane pdisplaybox = new BorderPane();
		pdisplaybox.setPadding(new Insets(10));
        pdisplaybox.setStyle("-fx-border-color: black; -fx-border-width: 0 0 0 1;");
		productlayout.setCenter(pdisplaybox);
		
		HBox backbox = new HBox(10);
		backbox.setPadding(new Insets(10));
		pdisplaybox.setTop(backbox);
		Button backbt = new Button("<< Back");
		backbt.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
		ButtonHoverOrange(backbt);
		backbox.getChildren().add(backbt);
		backbox.setAlignment(Pos.CENTER_LEFT);
		backbt.setOnAction(e -> primaryStage.setScene(menusc));
		backbt.setFocusTraversable(false);
		
		Label txt = createLabel("Product List");
		txt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
		txt.setTextFill(Color.rgb(33, 80, 122));
		productbox.getChildren().add(txt);
		
		//!!!//
		Label displaymsg = createLabel("Click on products to see details.");
		displaymsg.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));
		displaymsg.setTextFill(Color.rgb(33, 80, 122));
		pdisplaybox.setLeft(displaymsg);
		
		for (int i = 1; i <= Plist.size(); i++) {
			Product pro = Plist.get(i - 1);
			Label prolabel = createLabel(Integer.toString(i)+". "+pro.getProductName());
			productbox.getChildren().add(prolabel);
			prolabel.setFont(Font.font("Roboto", FontWeight.NORMAL, 18));
			prolabel.setTextFill(Color.rgb(33, 80, 122));
			
			prolabel.setOnMouseClicked(e -> {
				displaymsg.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));
				displaymsg.setTextFill(Color.rgb(33, 80, 122));
				displaymsg.setText(pro.toString());
				HBox selectbox = new HBox(10);
				selectbox.setPadding(new Insets(10));
				pdisplaybox.setBottom(selectbox);
				Button update = new Button("Update");
				update.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
			    ButtonHoverGreen(update);
				
				update.setOnAction(f -> updateProduct(pro));
				selectbox.getChildren().add(update);
				selectbox.setAlignment(Pos.CENTER);
				});
			LabelHoverBlue(prolabel);
		}
		
		HBox addbox = new HBox(10);
		addbox.setPadding(new Insets(10));
		productbox.getChildren().add(addbox);
		Button addbt = new Button("Add");
		addbt.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(addbt);
	    
		addbt.setOnAction(e -> {
			if(Plist.size() >= maxproduct) {
				displaymsg.setText("Maximum number of products reached");
				displaymsg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				displaymsg.setTextFill(Color.RED);
			}
			else
				addProduct();
		});
		addbox.getChildren().add(addbt);
		addbox.setAlignment(Pos.CENTER);
		
		
		Scene productsc = new Scene(productlayout,900,600);
		primaryStage.setScene(productsc);
	}
	
	private void addProduct() {
		Stage secondaryStage = new Stage();
		BorderPane addPane = new BorderPane();
		addPane.setStyle("-fx-background-color:#a4b7f5;");
		
		HBox buttonBox = new HBox(10);
		buttonBox.setPadding(new Insets(10));
		RadioButton TVbt = new RadioButton("TV");
		RadioButton Refribt = new RadioButton("Refrigerator");
		RadioButton Washbt = new RadioButton("Washing Machine");
		buttonBox.getChildren().addAll(TVbt,Refribt,Washbt);
		TVbt.setFocusTraversable(false);
		Refribt.setFocusTraversable(false);
		Washbt.setFocusTraversable(false);

		TVbt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 15));
		Refribt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 15));
		Washbt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 15));
		
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(20);
		addPane.setTop(buttonBox);
		
		ToggleGroup group = new ToggleGroup();
		TVbt.setToggleGroup(group);
		Refribt.setToggleGroup(group);
		Washbt.setToggleGroup(group);
		
		VBox displaybox = new VBox(10);
		displaybox.setPadding(new Insets(20));
		displaybox.setSpacing(20);
		VBox textfieldbox = new VBox(10);
		textfieldbox.setPadding(new Insets(20));
		
		addPane.setLeft(displaybox);
		addPane.setRight(textfieldbox);
		
		VBox holdbox = new VBox(10);
		holdbox.setPadding(new Insets(10));
		HBox msgbox = new HBox(10);
		msgbox.setPadding(new Insets(10));
		HBox optionbox = new HBox(10);
		optionbox.setPadding(new Insets(10));
		addPane.setBottom(holdbox);
		holdbox.getChildren().addAll(msgbox,optionbox);
		Label msg = createLabel("");
		msgbox.getChildren().add(msg);
		msgbox.setAlignment(Pos.CENTER);
		msg.setTextFill(Color.RED);
		Button save = new Button("Save");
		Button cancel = new Button("Cancel");
		optionbox.getChildren().addAll(save,cancel);
		
		save.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(save);
	    cancel.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
	    ButtonHoverOrange(cancel);
		save.setFocusTraversable(false);
		cancel.setFocusTraversable(false);
		optionbox.setAlignment(Pos.CENTER_RIGHT);
		cancel.setOnAction(e -> secondaryStage.close());
		
		TVbt.setOnAction(e -> {
			if (TVbt.isSelected()) {
				displaybox.getChildren().clear();
				displaybox.getChildren().addAll(
						new Text(String.format("%-21s", "Item number")),
						new Text(String.format("%-21s", "Product name")),
						new Text(String.format("%-21s", "Screen type")),
						new Text(String.format("%-21s", "Resolution")),
						new Text(String.format("%-21s", "Display size")),
						new Text(String.format("%-21s", "Quantity available ")),
						new Text(String.format("%-21s", "Price (RM) ")));
				TextField ID = new TextField();
				TextField name = new TextField();
				TextField screen = new TextField();
				TextField resolution = new TextField();
				TextField display = new TextField();
				TextField quantity = new TextField();
				TextField price = new TextField();
				textfieldbox.getChildren().clear();
				textfieldbox.getChildren().addAll(ID,name,screen,resolution,display,quantity,price);
		
				save.setOnAction(f -> {
					try {
						TV newTV= new TV(
								Integer.parseInt(ID.getText()), 
								name.getText(),
								Integer.parseInt(quantity.getText()),
								Double.parseDouble(price.getText()),
								screen.getText(),
								resolution.getText(),
								Double.parseDouble(display.getText()));
						Plist.add(newTV);
						secondaryStage.close();
						viewProduct();
					} catch (NumberFormatException g) {
						msg.setText("Invalid Data Input");
						msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
					}
				});
			}
		});
		
		Refribt.setOnAction(e -> {
			if (Refribt.isSelected()) {
				displaybox.getChildren().clear();
				displaybox.getChildren().addAll(
						new Text(String.format("%-21s", "Item number")),
						new Text(String.format("%-21s", "Product name")),
						new Text(String.format("%-21s", "Door design")),
						new Text(String.format("%-21s", "Color")),
						new Text(String.format("%-21s", "Capacity (in Litres)")),
						new Text(String.format("%-21s", "Quantity available ")),
						new Text(String.format("%-21s", "Price (RM)")));
				TextField ID = new TextField();
				TextField name = new TextField();
				TextField door = new TextField();
				TextField color = new TextField();
				TextField capacity = new TextField();
				TextField quantity = new TextField();
				TextField price = new TextField();
				textfieldbox.getChildren().clear();
				textfieldbox.getChildren().addAll(ID,name,door,color,capacity,quantity,price);
				save.setOnAction(f -> {
					try{
					Refrigerator newRefri= new Refrigerator(
							Integer.parseInt(ID.getText()), 
							name.getText(),
							Integer.parseInt(quantity.getText()),
							Double.parseDouble(price.getText()),
							door.getText(),
							color.getText(),
							Integer.parseInt(capacity.getText()));
					Plist.add(newRefri);
					secondaryStage.close();
					viewProduct();
					} catch (NumberFormatException g) {
						msg.setText("Invalid Data Input");
						msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
					}
				});
			}
		});
		
		Washbt.setOnAction(e -> {
			if (Washbt.isSelected()) {
				displaybox.getChildren().clear();
				displaybox.getChildren().addAll(
						new Text(String.format("%-21s", "Item number")),
						new Text(String.format("%-21s", "Product name")),
						new Text(String.format("%-21s", "Design")),
						new Text(String.format("%-21s", "Feature")),
						new Text(String.format("%-21s", "Capacity (in kgs)")),
						new Text(String.format("%-21s", "Quantity available ")),
						new Text(String.format("%-21s", "Price (RM)")));
				TextField ID = new TextField();
				TextField name = new TextField();
				TextField door = new TextField();
				TextField feature = new TextField();
				TextField capacity = new TextField();
				TextField quantity = new TextField();
				TextField price = new TextField();
				textfieldbox.getChildren().clear();
				textfieldbox.getChildren().addAll(ID,name,door,feature,capacity,quantity,price);
				
				save.setOnAction(f -> {
					try{
					WashingMachine newWash= new WashingMachine(
							Integer.parseInt(ID.getText()), 
							name.getText(),
							Integer.parseInt(quantity.getText()),
							Double.parseDouble(price.getText()),
							door.getText(),
							feature.getText(),
							Integer.parseInt(capacity.getText()));
					Plist.add(newWash);
					secondaryStage.close();
					viewProduct();
					} catch (NumberFormatException g) {
						msg.setText("Invalid Data Input");
						msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
					}
				});
			}
		});
		secondaryStage.setScene(new Scene(addPane,400,500));
		secondaryStage.setTitle("Add Product");
		secondaryStage.show();
	}
	
	private void updateProduct(Product pro) {
		Stage secondaryStage = new Stage();
		BorderPane updatePane = new BorderPane();
		updatePane.setStyle("-fx-background-color:#a4b7f5;");
		
		VBox displaybox = new VBox(10);
		displaybox.setPadding(new Insets(20));
		displaybox.setSpacing(20);
		VBox textfieldbox = new VBox(10);
		textfieldbox.setPadding(new Insets(20));
		VBox detailbox = new VBox(10);
		detailbox.setPadding(new Insets(20));
		
		Label displaymsg = createLabel("");
		detailbox.getChildren().add(displaymsg);
		displaymsg.setText(pro.toString());
		
		updatePane.setLeft(displaybox);
		updatePane.setCenter(textfieldbox);
		updatePane.setRight(detailbox);
		
		VBox holdbox = new VBox(10);
		holdbox.setPadding(new Insets(10));
		HBox msgbox = new HBox(10);
		msgbox.setPadding(new Insets(10));
		HBox optionbox = new HBox(10);
		optionbox.setPadding(new Insets(10));
		updatePane.setBottom(holdbox);
		holdbox.getChildren().addAll(msgbox,optionbox);
		Label msg = createLabel("");
		msgbox.getChildren().add(msg);
		msgbox.setAlignment(Pos.CENTER);
		msg.setTextFill(Color.RED);
		Button save = new Button("Save");
		Button cancel = new Button("Cancel");
		
		save.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(save);
	    cancel.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
	    ButtonHoverOrange(cancel);
		save.setFocusTraversable(false);
		cancel.setFocusTraversable(false);
		optionbox.getChildren().addAll(save,cancel);
		optionbox.setAlignment(Pos.CENTER_RIGHT);
		cancel.setOnAction(e -> secondaryStage.close());
		
		
		if (pro instanceof TV) {
			displaybox.getChildren().addAll(
					new Text(String.format("%-21s", "Item number")),
					new Text(String.format("%-21s", "Product name")),
					new Text(String.format("%-21s", "Screen type")),
					new Text(String.format("%-21s", "Resolution")),
					new Text(String.format("%-21s", "Display size")),
					new Text(String.format("%-21s", "Quantity available ")),
					new Text(String.format("%-21s", "Price (RM) ")));
			TextField ID = new TextField(Integer.toString(pro.getProductID()));
			TextField name = new TextField(pro.getProductName());
			TextField screen = new TextField(((TV) pro).getScreenType());
			TextField resolution = new TextField(((TV) pro).getResolution());
			TextField display = new TextField(Double.toString(((TV) pro).getDisplaySize()));
			TextField quantity = new TextField(Integer.toString(pro.getStock()));
			TextField price = new TextField(Double.toString(pro.getPrice()));
			textfieldbox.getChildren().addAll(ID,name,screen,resolution,display,quantity,price);
			save.setOnAction(f -> {
				try {
					TV newTV= new TV(
							Integer.parseInt(ID.getText()), 
							name.getText(),
							Integer.parseInt(quantity.getText()),
							Double.parseDouble(price.getText()),
							screen.getText(),
							resolution.getText(),
							Double.parseDouble(display.getText()));
					Plist.set(Plist.indexOf(pro),newTV);
					secondaryStage.close();
					viewProduct();
				} catch (NumberFormatException g) {
					msg.setText("Invalid Data Input");
					msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				}
			});
		}
		else if (pro instanceof Refrigerator) {
			displaybox.getChildren().addAll(
					new Text(String.format("%-21s", "Item number")),
					new Text(String.format("%-21s", "Product name")),
					new Text(String.format("%-21s", "Door design")),
					new Text(String.format("%-21s", "Color")),
					new Text(String.format("%-21s", "Capacity (in Litres)")),
					new Text(String.format("%-21s", "Quantity available ")),
					new Text(String.format("%-21s", "Price (RM)")));
			TextField ID = new TextField(Integer.toString(pro.getProductID()));
			TextField name = new TextField(pro.getProductName());
			TextField door = new TextField(((Refrigerator) pro).getDoorDesign());
			TextField color = new TextField(((Refrigerator) pro).getColor());
			TextField capacity = new TextField(Integer.toString(((Refrigerator) pro).getCapacity()));
			TextField quantity = new TextField(Integer.toString(pro.getStock()));
			TextField price = new TextField(Double.toString(pro.getPrice()));
			textfieldbox.getChildren().addAll(ID,name,door,color,capacity,quantity,price);
			save.setOnAction(f -> {
				try{
				Refrigerator newRefri= new Refrigerator(
						Integer.parseInt(ID.getText()), 
						name.getText(),
						Integer.parseInt(quantity.getText()),
						Double.parseDouble(price.getText()),
						door.getText(),
						color.getText(),
						Integer.parseInt(capacity.getText()));
				Plist.set(Plist.indexOf(pro),newRefri);
				secondaryStage.close();
				viewProduct();
				} catch (NumberFormatException g) {
					msg.setText("Invalid Data Input");
					msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				}
			});
		}
		else if (pro instanceof WashingMachine) {
			displaybox.getChildren().addAll(
					new Text(String.format("%-21s", "Item number")),
					new Text(String.format("%-21s", "Product name")),
					new Text(String.format("%-21s", "Design")),
					new Text(String.format("%-21s", "Feature")),
					new Text(String.format("%-21s", "Capacity (in kgs)")),
					new Text(String.format("%-21s", "Quantity available ")),
					new Text(String.format("%-21s", "Price (RM)")));
			TextField ID = new TextField(Integer.toString(pro.getProductID()));
			TextField name = new TextField(pro.getProductName());
			TextField door = new TextField(((WashingMachine) pro).getDesign());
			TextField feature = new TextField(((WashingMachine) pro).getFeature());
			TextField capacity = new TextField(Integer.toString(((WashingMachine) pro).getCapacity()));
			TextField quantity = new TextField(Integer.toString(pro.getStock()));
			TextField price = new TextField(Double.toString(pro.getPrice()));
			textfieldbox.getChildren().addAll(ID,name,door,feature,capacity,quantity,price);
			save.setOnAction(f -> {
				try{
				WashingMachine newWash= new WashingMachine(
						Integer.parseInt(ID.getText()), 
						name.getText(),
						Integer.parseInt(quantity.getText()),
						Double.parseDouble(price.getText()),
						door.getText(),
						feature.getText(),
						Integer.parseInt(capacity.getText()));
				Plist.set(Plist.indexOf(pro),newWash);
				secondaryStage.close();
				viewProduct();
				} catch (NumberFormatException g) {
					msg.setText("Invalid Data Input");
					msg.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				}
			});
		}
		
		secondaryStage.setScene(new Scene(updatePane,700,500));
		secondaryStage.setTitle("Update Product");
		secondaryStage.show();
	}
	
	private void addStock() {
		BorderPane productlayout = new BorderPane();
	    VBox productbox = new VBox(10);
	    productbox.setPadding(new Insets(10));
	    productbox.setStyle("-fx-background-color:#add7ff;");
	    
	    ScrollPane scroll = new ScrollPane();
	    scroll.setContent(productbox);
	    scroll.setFitToWidth(true);
	    scroll.setStyle("-fx-border-color: black");
	    scroll.setStyle("-fx-background-color:#ebf3fc;");
	    productlayout.setLeft(scroll);
	    productlayout.setStyle("-fx-background-color:#ebf3fc;");
	    Button enterBt = new Button("Enter");
	    enterBt.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(enterBt);
		
	    TextField quantity = new TextField();
	    quantity.setPrefColumnCount(10);
		HBox textbox = new HBox(10);
		textbox.setStyle("-fx-background-color:#ebf3fc;");
		textbox.getChildren().addAll(quantity, enterBt);
		VBox textDisplayBox = new VBox(20);
		textDisplayBox.setPadding(new Insets(10));
		
		
		//addStock prompt
	    Label prompt = new Label("Add stock quantity: ");
	    prompt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
	    prompt.setTextFill(Color.rgb(33, 80, 122));
		
		textDisplayBox.getChildren().addAll(prompt, textbox);
		textDisplayBox.setStyle("-fx-border-style: solid none none none; -fx-border-width: 2; -fx-border-color: black;");
		BorderPane pdisplaybox = new BorderPane();
		pdisplaybox.setPadding(new Insets(10));
        pdisplaybox.setStyle("-fx-border-color: black; -fx-border-width: 0 0 0 1;");
		productlayout.setCenter(pdisplaybox);
		pdisplaybox.setBottom(textDisplayBox);
		
		HBox backbox = new HBox(10);
		backbox.setPadding(new Insets(10));
		pdisplaybox.setTop(backbox);
		Button backbt = new Button("<< Back");
		backbt.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
		ButtonHoverOrange(backbt);
		backbox.getChildren().add(backbt);
		backbox.setAlignment(Pos.CENTER_LEFT);
		backbt.setOnAction(e -> primaryStage.setScene(menusc));
		backbt.setFocusTraversable(false);
		
		Label txt = createLabel("Product List");
		txt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
		txt.setTextFill(Color.rgb(33, 80, 122));
		productbox.getChildren().add(txt);
		
		Label displaymsg = createLabel("Click on products to see details.");
		displaymsg.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));
		displaymsg.setTextFill(Color.rgb(33, 80, 122));
		pdisplaybox.setLeft(displaymsg);
	    

	    for (int i = 1; i <= Plist.size(); i++) {
	    	Product pro = Plist.get(i - 1);
			Label prolabel = createLabel(Integer.toString(i)+". "+pro.getProductName());
			productbox.getChildren().add(prolabel);
			prolabel.setFont(Font.font("Roboto", FontWeight.NORMAL, 18));
			prolabel.setTextFill(Color.rgb(33, 80, 122));
			
			prolabel.setOnMouseClicked(e -> {
				prompt.setText("Add stock quantity: ");
				prompt.setStyle("-fx-text-fill: black;");
				prompt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
			    prompt.setTextFill(Color.rgb(33, 80, 122));
				
	            displaymsg.setText(pro.toString());
	            quantity.setPromptText("Quantity");
	            
	            //handle action event for quantity textfield
	            //when Enter is pressed 
	            quantity.setOnAction(e1 ->{
	            	
	            	String quantityValue = quantity.getText();
	            	
	            	try {
	            		int quantityInt = Integer.parseInt(quantityValue);
	            		
	            		if(quantityInt < 0) {
		            		prompt.setText("Invalid number! Should not be less than zero!");
		            		prompt.setTextFill(Color.RED);
		            	}
		            	else {
		            		if(pro.addStock(quantityInt)) {
			            		prompt.setText("Stock added successfully!");
			            		prompt.setTextFill(Color.GREEN);
		            		}
		            		else {
		            			prompt.setText("This product is discontinued!");
		            			prompt.setTextFill(Color.RED);
		            		}
		            	}
		            	displaymsg.setText(pro.toString());
	            	}catch(NumberFormatException ex) {
	            		prompt.setText("Invalid quantity format! Please enter a valid integer.");
	            		prompt.setTextFill(Color.RED);
	            	}
	            });
	            
	            //click on Enter
	            enterBt.setOnAction(e2 ->{
	            	String quantityValue = quantity.getText();
	            	 
	            	try {
	            		int quantityInt = Integer.parseInt(quantityValue);
	            		
	            		if(quantityInt < 0) {
		            		prompt.setText("Invalid number! Should not be less than zero!");
		            		prompt.setTextFill(Color.RED);
		            	}
	            		else {
		            		if(pro.addStock(quantityInt)) {
			            		prompt.setText("Stock added successfully!");
			            		prompt.setTextFill(Color.GREEN);
		            		}
		            		else {
		            			prompt.setText("This product is discontinued!");
		            			prompt.setTextFill(Color.RED);
		            		}
		            	}
		            	displaymsg.setText(pro.toString());
	            	}catch(NumberFormatException ex) {
	            		prompt.setText("Invalid quantity format! Please enter a valid integer.");
	            		prompt.setTextFill(Color.RED);
	            	}
	            });
	        });
			
	        LabelHoverBlue(prolabel);
		}
	    
		Scene scene = new Scene(productlayout, 900, 600);
        primaryStage.setScene(scene);
	}
	
	private void deductStock() {
		BorderPane productlayout = new BorderPane();
	    VBox productbox = new VBox(10);
	    productbox.setPadding(new Insets(10));
	    productbox.setStyle("-fx-background-color:#add7ff;");
	    
	    ScrollPane scroll = new ScrollPane();
	    scroll.setContent(productbox);
	    scroll.setFitToWidth(true);
	    scroll.setStyle("-fx-border-color: black");
	    scroll.setStyle("-fx-background-color:#ebf3fc;");
	    productlayout.setLeft(scroll);
	    productlayout.setStyle("-fx-background-color:#ebf3fc;");
	    Button enterBt = new Button("Enter");
	    enterBt.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(enterBt);
	    
	    TextField quantity = new TextField();
	    quantity.setPrefColumnCount(10);
		HBox textbox = new HBox(10);
		textbox.setStyle("-fx-background-color:#ebf3fc;");
		textbox.getChildren().addAll(quantity, enterBt);
		VBox textDisplayBox = new VBox(20);
		textDisplayBox.setPadding(new Insets(10));
		
	    
	    Label deductMessage = new Label("Deduct stock quantity: ");
	    deductMessage.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
	    deductMessage.setTextFill(Color.rgb(33, 80, 122));
	    
		textDisplayBox.getChildren().addAll(deductMessage, textbox);
		textDisplayBox.setStyle("-fx-border-style: solid none none none; -fx-border-width: 2; -fx-border-color: black;");
		BorderPane pdisplaybox = new BorderPane();
		pdisplaybox.setPadding(new Insets(10));
        pdisplaybox.setStyle("-fx-border-color: black; -fx-border-width: 0 0 0 1;");
		productlayout.setCenter(pdisplaybox);
		pdisplaybox.setBottom(textDisplayBox);
 
		
		
		Label txt = createLabel("Product List");
		txt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
		txt.setTextFill(Color.rgb(33, 80, 122));
		productbox.getChildren().add(txt);
		
		HBox backbox = new HBox(10);
		backbox.setPadding(new Insets(10));
		pdisplaybox.setTop(backbox);
		Button backbt = new Button("<< Back");
		backbt.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
		ButtonHoverOrange(backbt);
		backbox.getChildren().add(backbt);
		backbox.setAlignment(Pos.CENTER_LEFT);
		backbt.setOnAction(e -> primaryStage.setScene(menusc));
		backbt.setFocusTraversable(false);
		
		Label displaymsg = createLabel("Click on products to see details.");
		displaymsg.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));
		displaymsg.setTextFill(Color.rgb(33, 80, 122));
		pdisplaybox.setLeft(displaymsg);

 
		for (int i = 1; i <= Plist.size(); i++) {
			Product pro = Plist.get(i - 1);
			Label prolabel = createLabel(Integer.toString(i)+". "+pro.getProductName());
			productbox.getChildren().add(prolabel);
			prolabel.setFont(Font.font("Roboto", FontWeight.NORMAL, 18));
			prolabel.setTextFill(Color.rgb(33, 80, 122));
			
			prolabel.setOnMouseClicked(e -> {
				deductMessage.setText("Deduct stock quantity: ");
				deductMessage.setStyle("-fx-text-fill: black;");
				deductMessage.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				deductMessage.setTextFill(Color.rgb(33, 80, 122));
	            displaymsg.setText(pro.toString());
	            quantity.setPromptText("Quantity");
 
	            quantity.setOnAction(e1 ->{
	            	String quantityValue = quantity.getText();
	            	try {
	            		int destockQ = Integer.parseInt(quantityValue);
	            		if(destockQ < 0 || destockQ > pro.getStock()) {
	            			deductMessage.setText("Invalid number! Stock deduct must not be " + "\nless than 0 or more than stock available.");
	            			deductMessage.setTextFill(Color.RED);
		            	}
		            	else {
		            		pro.deductStock(destockQ); //deduct stock values
		            		deductMessage.setText("Stock has been deducted.");
		            		deductMessage.setTextFill(Color.GREEN);
		            	}
		            	displaymsg.setText(pro.toString());
	            	}catch(NumberFormatException ex) {
	            		deductMessage.setText("Invalid quantity format! Please enter a valid integer.");
	            		deductMessage.setTextFill(Color.RED);
	            	}
	            });
	            //click on Enter
	            enterBt.setOnAction(e2 ->{
	            	String quantityValue = quantity.getText();
	            	try {
	            		int destockQ = Integer.parseInt(quantityValue);
	            		if(destockQ < 0|| destockQ > pro.getStock()) {
	            			deductMessage.setText("Invalid number! Stock deduct must not be " + "\nless than 0 or more than stock available.");
	            			deductMessage.setTextFill(Color.RED);
		            	}
		            	else {
		            		pro.deductStock(destockQ); //deduct stock values
		            		deductMessage.setText("Stock has been deducted.");
		            		deductMessage.setTextFill(Color.GREEN);
		            	}
		            	displaymsg.setText(pro.toString());
	            	}catch(NumberFormatException ex) {
	            		deductMessage.setText("Invalid quantity format! Please enter a valid integer.");
	            		deductMessage.setTextFill(Color.RED);
	            	}
	            });
	        });
	        LabelHoverBlue(prolabel);
		}
		Scene scene = new Scene(productlayout, 900, 600);
        primaryStage.setScene(scene);
	}
	
	private void discontinueProduct() {
		BorderPane productlayout = new BorderPane();
		VBox productbox = new VBox(10);
		productbox.setPadding(new Insets(10));
		productbox.setStyle("-fx-background-color:#add7ff;");
		
        ScrollPane scroll = new ScrollPane();
		scroll.setContent(productbox);
		scroll.setFitToWidth(true);
		scroll.setStyle("-fx-border-color: black");
		scroll.setStyle("-fx-background-color:#ebf3fc;");
		productlayout.setLeft(scroll);
		productlayout.setStyle("-fx-background-color:#ebf3fc;");

		Button disconBt = new Button ("Discontinue");
		Button activeBt = new Button ("Activate");
		disconBt.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
	    ButtonHoverOrange(disconBt);
	    activeBt.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;");
	    ButtonHoverGreen(activeBt);
	    
		HBox buttonbox = new HBox(10);
		VBox buttonDisplayBox = new VBox(20);
		buttonDisplayBox.setPadding(new Insets(10));
		Label buttonstatus = new Label("Discontinue Product or Activate Product");
		buttonbox.getChildren().addAll(disconBt, activeBt);
		buttonDisplayBox.getChildren().addAll(buttonstatus, buttonbox);
		buttonstatus.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
		buttonstatus.setTextFill(Color.rgb(33, 80, 122));
		buttonDisplayBox.setStyle("-fx-border-style: solid none none none; -fx-border-width: 2; -fx-border-color: black;");
		BorderPane pdisplaybox = new BorderPane();
		pdisplaybox.setPadding(new Insets(10));
        pdisplaybox.setStyle("-fx-border-color: black; -fx-border-width: 0 0 0 1;");
		productlayout.setCenter(pdisplaybox);
		pdisplaybox.setBottom(buttonDisplayBox);
		
		HBox backbox = new HBox(10);
		backbox.setPadding(new Insets(10));
		pdisplaybox.setTop(backbox);
		Button backbt = new Button("<< Back");
		backbt.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;");
		ButtonHoverOrange(backbt);
		backbox.getChildren().add(backbt);
		backbox.setAlignment(Pos.CENTER_LEFT);
		backbt.setOnAction(e -> primaryStage.setScene(menusc));
		
		Label txt = createLabel("Product List");
		txt.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
		txt.setTextFill(Color.rgb(33, 80, 122));
		productbox.getChildren().add(txt);
		
		Label displaymsg = createLabel("Click on products to see details.");
		displaymsg.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 18));
		displaymsg.setTextFill(Color.rgb(33, 80, 122));
		pdisplaybox.setLeft(displaymsg);
		
		
		for (int i = 1; i <= Plist.size(); i++) {
			Product pro = Plist.get(i - 1);
			Label prolabel = createLabel(Integer.toString(i)+". "+pro.getProductName());
			productbox.getChildren().add(prolabel);
			prolabel.setFont(Font.font("Roboto", FontWeight.NORMAL, 18));
			prolabel.setTextFill(Color.rgb(33, 80, 122));

			prolabel.setOnMouseClicked(e -> {
				buttonstatus.setText("Discontinue Product or Activate Product");
				buttonstatus.setStyle("-fx-text-fill: black;");
				buttonstatus.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
				buttonstatus.setTextFill(Color.rgb(33, 80, 122));
				
				displaymsg.setText(pro.toString());
				disconBt.setOnAction (e1 ->{
					if(!pro.isStatus()) {
						buttonstatus.setText("The product already Discontinued!");
						buttonstatus.setStyle("-fx-text-fill: black;");
					}
					else {
						buttonstatus.setText("The product has been Discontinued!");
						buttonstatus.setStyle("-fx-text-fill: red;");
						pro.setStatus(false);
					}	
					displaymsg.setText(pro.toString());
				});
				
				activeBt.setOnAction (e2 ->{
					if(pro.isStatus()) {
						buttonstatus.setText("The product already Activated!");
						buttonstatus.setStyle("-fx-text-fill: black;");
					}
					else {
						buttonstatus.setText("The product has been Activated!");
						buttonstatus.setStyle("-fx-text-fill: green;");
						pro.setStatus(true);
					}		
					displaymsg.setText(pro.toString());
				});
			});	
			LabelHoverBlue(prolabel);
		}
		Scene scene = new Scene(productlayout, 900, 600);
        primaryStage.setScene(scene);
	}
	
	//hover effects
	private void LabelHoverBlue (Label label) {
        label.setOnMouseEntered(e ->label.setTextFill(Color.BLUE));
        label.setOnMouseExited(e ->label.setFont(Font.font("Roboto", FontWeight.NORMAL, 18)));
        label.setOnMouseExited(e ->label.setTextFill(Color.rgb(33, 80, 122)));
    }
	
	private void HBoxHover (HBox hbox) {
		hbox.setOnMouseEntered(e -> {
			hbox.setStyle("-fx-background-color: #97b5d1");
			hbox.getChildren().forEach(label -> label.setStyle("-fx-text-fill: BLUE;"));
			});
		hbox.setOnMouseExited(e -> {
			hbox.setStyle("-fx-background-color:#ebf3fc");
			hbox.getChildren().forEach(label -> label.setStyle("-fx-text-fill: rgb(33,80,122);"));
			});
	}
	
	private void ButtonHoverGreen(Button button) {
		button.setOnMouseEntered(e ->button.setStyle("-fx-background-color: #45a049;"));
        button.setOnMouseExited(e ->button.setStyle("-fx-background-color: #4CAF50;-fx-text-fill: white;"));
	}
	
	private void ButtonHoverOrange(Button button) {
		button.setOnMouseEntered(e ->button.setStyle("-fx-background-color: #d48b06;"));
        button.setOnMouseExited(e ->button.setStyle("-fx-background-color: #fca608;-fx-text-fill: white;"));
	}
	
	private Label createLabel(String text) {
        Label label = new Label(text);
        label.setPadding(new Insets(5));
        return label;
    }

	public static void main(String[] args) {
		launch(args);
	}
}
