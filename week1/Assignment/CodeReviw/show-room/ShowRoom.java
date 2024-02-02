abstract class ShowRoom implements Vehicle {
    private String brand ;
    // constructer
    public ShowRoom (String brand) {
        this.brand = brand ;
    }
    public void displayinfo () {
        System.out.println(" Brand :"+brand) ;
    }
    // Getter and Setters
    public String getbrand (){
        return this.brand ;
    }
   
} 
