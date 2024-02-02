
import java.util.ArrayList ;
public class CafeUtil {
    public int getStreakGoal(){
        int sum=0;
        for (int i =0 ; i<11;i++){
            sum=sum+i;
        }
        return sum ;
    }
    public double getOrderTotal(double[] prices) {
        double sum=0;
        for (int i =0; i<prices.length; i++){
            sum=sum+prices[i];
        }
    return sum ;   
    }
    
}