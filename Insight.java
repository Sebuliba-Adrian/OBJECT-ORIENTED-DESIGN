/**
 * Insight
 */
public class Insight extends Car implements Hybrid {
 private int mpmah;
 private int batteryevel;

    public int getMpmah() {
        return mpmah;
    }

    public void setMpmah(int mpmah) {
        this.mpmah = mpmah;
    }

    public int getBatteryevel() {
        return batteryevel;
    }

    public void setBatteryevel(int batteryevel) {
        this.batteryevel = batteryevel;
    }
    
}