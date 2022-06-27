public class CarRunner {
    public static void main(String[] args) {
        // your code here
        Car baseCar = new Car();
        baseCar.accelerate();
        baseCar.breakPads();
        //Upcasting
        Car myBronco = new Bronco();
        System.out.println(myBronco.getClass().toString());
        // myBronco.driveThroughMud();
        // myBronco.useHitch();
        // Ferrari myFerrari = new Ferrari();
        // myFerrari.accelerate();
        // myFerrari.race();
        // myFerrari.goSuperFast();
    }
}
