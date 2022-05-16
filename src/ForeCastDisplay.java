import java.util.Observable;

/**
 * ForeCastDisplay
 */
public class ForeCastDisplay implements DisplayElement{
    public double currentPressure;
    public double lastPressure;
    
    public ForeCastDisplay(Observable constObs) {
    
    }
    public void update(Observable myObs, Object obj){

    }
     @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
    public double getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(double currentPressure) {
        this.currentPressure = currentPressure;
    }

    public double getLastPressure() {
        return lastPressure;
    }

    public void setLastPressure(double lastPressure) {
        this.lastPressure = lastPressure;
    }
   

    
    
}
