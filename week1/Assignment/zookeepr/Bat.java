public class Bat extends Mamal {
    public Bat (int energy){
        this.energy = 300 ;
    }
    public void Fly(){
        this.energy -=50 ;
        System.out.println("Bat is airborn");
    }
    public void eatHumans(){
        this.energy += 25;
        System.out.println("Bat stisfied");
    }
    public void attackTown(){
        this.energy -=100;
        System.out.println("the Bat attack the town");
    }
    
}
