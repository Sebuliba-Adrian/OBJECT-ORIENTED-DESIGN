public class Prius extends Car implements Hybrid {

    protected int mpmah = 10;
    protected int batteryLevel = 100;

    public int getMpmah() {
        return mpmah;
    }

    public void setMpmah(int mpmah) {
        this.mpmah = mpmah;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    
    public String getModel() {

        return "Prius";
    }

}