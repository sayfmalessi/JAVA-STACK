public class VehicleShowRoom {
    public static void main(String[] args) {
        // creating instance of car and yacht
        Car car=new Car("BMW", 4);
        Yacht yacht=new Yacht("yamaha", 25);
    
    // display info about vehicles 
        System.out.println("car info");
        car.displayinfo();
        car.start();
        car.stop();
        System.out.println("yacht info");
        yacht.displayinfo();
        yacht.start();
        yacht.stop();
    
}
}
