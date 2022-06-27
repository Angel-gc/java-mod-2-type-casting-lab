public class Bronco extends Car {
    private boolean offRoading = true;

    public void driveThroughMud(){
        if (offRoading){
            System.out.println("I am driving through mud because I am offroading!");
        }
    }
    public void useHitch(){
        System.out.println("I am using my hitch to rescue a stuck car.");
    }
}
