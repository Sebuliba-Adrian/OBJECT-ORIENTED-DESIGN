/**
 * Insight
 */
public class Insight extends Car implements Hybrid {
 private int mpmah;
 private int batteryLevel;

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

        return "Toyota Insight";
    }
    
}