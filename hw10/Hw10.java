package hw10;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.ListView;


public class Hw10 extends Application {
    
        public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
               Stage window;
               Button Bike, Car, Building, Listbtn;
               Scene scene;
               ListView<String> listView;
               Random number = new Random();
               ArrayList<CarbonFootprint> list = new ArrayList();
                        
		while (list.size() < 15){
			int rng = 1+(number.nextInt(3));
			if (rng == 1){
				Building bl = new Building();
				list.add(bl);
			}
			else if (rng == 2){
				Car coche = new Car();
				list.add(coche);
			}
			else{
				Bicycle bike = new Bicycle();
				list.add(bike);
			}
		}
                window = primaryStage;
                window.setTitle("HomeWork 10");
                Listbtn = new Button("View List");
                Bike = new Button("Add a Bike");
                Car = new Button("Add a Car");
                Building = new Button("Add a Building");
               
                
                GridPane layout = new GridPane();
                
                
                //Adds all the buttons
                layout.add(Bike, 0, 0);
                layout.add(Car, 1, 0);
                layout.add(Building, 2, 0);
                layout.add(Listbtn, 3, 0);
                layout.setHgap(20);
                
                //Button Functions
                Bike.setOnAction(e -> {
                    Bicycle yo = AlertBoxes.BikeAlert();
                    list.add(yo);
                });
                
                Car.setOnAction(e->{
                    Car yo = AlertBoxes.CarAlert();
                    list.add(yo);
                });
                
                Building.setOnAction(e->{
                   Building yo = AlertBoxes.BuildingAlert();
                   list.add(yo);
                });
                
                Listbtn.setOnAction(e->{
                    AlertBoxes.ListbtnAlert(list);
                    
                });
                
                scene = new Scene(layout, 360, 100);
                window.setScene(scene);
                window.show();
        
    }
}
