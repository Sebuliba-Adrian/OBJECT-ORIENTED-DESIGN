
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Driver {
    // instance variables - replace the example below with your own
    public static ArrayList<Car> allCars = new ArrayList<Car>();

    /**
     * Constructor for objects of class Driver
     */
    public Driver() {

    }

    public static void main(final String[] args) {
        promptUser();
        printCars();
    }

    private static void promptUser() {

        do {

            final Car myCar = new Car();
            final String strOdometer = JOptionPane.showInputDialog("What is the odometer reading?");
            final int intOdometer = Integer.parseInt(strOdometer);
            myCar.setOdometer(intOdometer);

            final String strGallonsOfGas = JOptionPane.showInputDialog("How many gallons of Gas?");
            final double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);
            myCar.setGallonsOfGas(dblGallonsOfGas);

            final String strMilesPerGallon = JOptionPane.showInputDialog("How many miles per gallon ?");
            final int dblMilesPerGallon = Integer.parseInt(strMilesPerGallon);
            myCar.setMilesPerGallon(dblMilesPerGallon);

            allCars.add(myCar);

        } while (JOptionPane.showConfirmDialog(null, "What is the odometer reading?", "more cars?",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
            }
            
 public static void printCars() {
        for (Car car : allCars) {

            System.out.println("Car before running " + car.toString());
            //car.go(100);
            System.out.println("Car before running " + car.toString());

        }
    }
    
    /**
     * A factory method to return cars
     * @param carType
     * @return
     */
    public Car createCar(String carType) {
        Car returnCar = null;
     if(carType.equalsIgnoreCase("Cavalier")) {     
        returnCar = new Cavalier();
     } else if(carType.equalsIgnoreCase("Neon")) {
        returnCar = new Neon();
     } else if(carType.equalsIgnoreCase("Prius")) {
        returnCar = new Prius();
     }
     return returnCar;

    }
}
