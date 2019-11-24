
public abstract class Car {
    // instance variables - replace the example below with your own
    protected int odometer;
    protected double gallonsOfGas;
    protected int milesPerGallon;

    /**
     * Move the car the specified distance
     * 
     * @param distance how far you want the car to move
     */
    public void go(int distance) {
        odometer = odometer + distance;
        // compute the gallon of gas used
        double gasUsed = distance / milesPerGallon;
        gallonsOfGas -= gasUsed;

    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
        return "Car [gallonsOfGas=" + gallonsOfGas + ", milesPerGallon=" + milesPerGallon + ", odometer=" + odometer
                + "]" + getModel(); // getModel() is a a method from subclass can now be accessed in parent class since it is abstract
                //this is now able to reach down into the child classes and gettignthe behaviour out of the child classes
                //This gives us the ability to call a method without knowing exactly what a method is doing
                //Gives you the ability to creste a method signiture. Leave that implementation up to a subclass
                //Reason for thst os we might not hsve created the subclasses of the car yet
                //We are able to reach out to the current subclasses and future subclasses
    }

    public abstract String getModel(); // ever abstract method must belong to an abstact class
}
