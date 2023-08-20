package StrategyDP.before;

public class GoogleMaps {
    public void findPath(String from, String to, Mode mode){
//        Mode mode;
        if(mode.equals(Mode.CAR)){
            System.out.println("Finding PPath for Car");
            //
            //
            //
            //
        } else if (mode.equals(Mode.BIKE)) {

            System.out.println("Finding PPath for Bike");
        } else if (mode.equals(Mode.WALK)) {
            System.out.println("Finding PPath for Walk");
        } else if (mode.equals(Mode.PUBLIC)) {
            System.out.println("Finding PPath for Public");

        }
    }
}
