public class Cavalier extends Car {
   
    protected boolean convertible;


    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getModel() {

        return "Cavalier";
    }
}