package chapter4;


public class GasMileage {
//        calculate and display the miles driven per gallon
//        initialize variables
//        initialize the miles driven
//        initialize the gallons used
//        obtain miles driven and gallons used until the driver wishes to stop
//        calculate thr miles per gallon for each trip
//        print the miles per gallon obtained from each trip up to the recent trip
    private int milesDriven;
    private int gallonUsed;
    private int milesPerGallon;

//        public int milesDriven(int milesDriven) {
//            this.milesDriven = milesDriven;
//            return milesDriven;
//        }
//
//    public int gallonUsed(int gallonUsed) {
//        this.gallonUsed = gallonUsed;
//        return gallonUsed;
//
//    }
    public double milesPerGallon(int milesDriven, int gallonUsed) {
        double milesPerGallon = (float) (milesDriven / gallonUsed);
        return milesPerGallon;
    }
    public double checkMilesPerGallon(){
            return milesPerGallon;
    }







}

