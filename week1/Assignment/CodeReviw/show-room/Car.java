public class Car extends ShowRoom {
    private int numDoors ;
    // constructor 
    public Car (String brand , int numDoors) {
        super(brand);
        this.numDoors = numDoors ;
    }
    public void start(){
        System.out.println("car is start");

    }
    public void stop (){
        System.out.println("car is stop");
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.println( "Type : car");
        System.out.println("number of doors "+numDoors);
    
}
}
