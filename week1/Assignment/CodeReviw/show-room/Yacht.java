public class Yacht extends ShowRoom {
    private int numDoors;
    public Yacht (String brand , int numDoors) {
        super(brand);
        this.numDoors = numDoors ;
    }
    public void start(){
        System.out.println("Yacht is start");

    }
    public void stop (){
        System.out.println("Yacht is stop");
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.println( "Type : car");
        System.out.println("number of doors "+numDoors);
        
    }

}
