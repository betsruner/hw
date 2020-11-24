package hw10;

import java.util.ArrayList;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class AlertBoxes {
    static int calBurn;
    static double mpg;
    static double milesDriven;
    static double nGasUsed;
    static double kwUsed;
    
    public static Bicycle BikeAlert(){
        Stage window = new Stage();
        GridPane layout = new GridPane();
        
        //Setting up Window stuff
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Bike");
        window.setMinWidth(400);
        window.setMinHeight(50);
        
        //Creates the label, writes text, and places it on the window
        Label label = new Label();
        label.setText("Enter Calories burned from Bike ride: ");
        layout.add(label, 0,0);
        
        //Creates the text field and puts it on the window
        TextField calBurned = new TextField();
        layout.add(calBurned,1,0);
        
        //Button to make a bike out of the Text in the text field
        Button createBike = new Button("Add Bike");
        createBike.setOnAction(e-> {
            calBurn = Integer.parseInt(calBurned.getText());
            window.close();
        });
        
        //createBike.setOnAction(e->System.out.println(calBurned.getText()));
        layout.add(createBike, 2, 0);
        
        //Sets window Scene and makes it an AlertBox
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        Bicycle bike = new Bicycle(calBurn);
        
        return bike;
    }
    
    public static Car CarAlert(){
        Stage window = new Stage();
        GridPane layout = new GridPane();
        
        //Setting up Window stuff
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Car");
        window.setMinWidth(400);
        window.setMinHeight(100);
        
        //Creates the label, writes text, and places it on the window
        Label label = new Label();
        label.setText("Enter your gas mileage(MPG)");
        layout.add(label, 0,0);
        
        Label label2 = new Label();
        label2.setText("Enter your miles driven: ");
        layout.add(label2, 0,1);
        
        //Creates the text field and puts it on the window
        TextField MPG = new TextField();
        layout.add(MPG,1,0);
        
        TextField milesdriven = new TextField();
        layout.add(milesdriven,1,1);
        
        //Button to make a Car out of the Text in the text field
        Button createCar = new Button("Add Car");
        createCar.setOnAction(e-> {
            mpg = Double.parseDouble(MPG.getText());
            milesDriven = Double.parseDouble(milesdriven.getText());
            window.close();
        });
        
        layout.add(createCar, 2, 1);
        
        //Sets window Scene and makes it an AlertBox
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        Car car = new Car(mpg,milesDriven);
        
        return car;
    }
        
    public static Building BuildingAlert(){
        Stage window = new Stage();
        GridPane layout = new GridPane();
        
        //Setting up Window stuff
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Building");
        window.setMinWidth(400);
        window.setMinHeight(100);
        
        //Creates the label, writes text, and places it on the window
        Label label = new Label();
        label.setText("Enter your natural gas used: ");
        layout.add(label, 0,0);
        
        Label label2 = new Label();
        label2.setText("Enter your kilowatts used: ");
        layout.add(label2, 0,1);
        
        //Creates the text field and puts it on the window
        TextField naturalgasused = new TextField();
        layout.add(naturalgasused,1,0);
        
        TextField kilowattused = new TextField();
        layout.add(kilowattused,1,1);
        
        //Button to make a Building out of the Text in the text field
        Button createBuilding = new Button("Add Building");
        createBuilding.setOnAction(e-> {
            nGasUsed = Double.parseDouble(naturalgasused.getText());
            kwUsed = Double.parseDouble(kilowattused.getText());
            window.close();
        });
        
        layout.add(createBuilding, 2, 1);
        
        //Sets window Scene and makes it an AlertBox
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        Building building = new Building(nGasUsed,kwUsed);
        
        return building;
    }
            
    public static void ListbtnAlert(ArrayList<CarbonFootprint> list){
        ListView<String> listView;
        Stage window = new Stage();
        GridPane layout = new GridPane();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Viewing List");
        window.setMinWidth(400);
        window.setMinHeight(50);
        
        listView = new ListView<>();        
        listView.setMinWidth(500);
        for (int i = 0; i < list.size(); i++){
                listView.getItems().add(list.get(i).getCarbonFootprint());
        }
        layout.add(listView,0,0);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
}
