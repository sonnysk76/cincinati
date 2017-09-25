public class Vehicles {
    // Declare attributes
    private int odometer;
    private int milesPerGallon;
    private double gallonsOfGas;

    /**
     * Move this car the specified distance
     * @param distance  the distance we wish to travel.
     */
    public void go(int distance){

    }

    public int getOdometer(){
        return odometer;
    }

    public void setOdometer(int inOdometer){
        this.odometer = inOdometer;
    }


    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }
}
