package lacecalc.Scoring;

/**
 * This class is for determining the patient's LACE Score
     * Creates methods for creating final score 
 * A score over 10 points classifies the patient as high-risk.  
 */

/**
 *
 * @author Joseph Edward 
 */
public class Points {
    
    private int counter=0;
    

    
    public void incrementCounterWithValue(int value)
    {
    counter+=value;
    }
    
    public int getPoints()
    {
    return counter; 
    }
    
    public boolean isHighRisk()
    {
        return counter>=10; 
    }
    
    
}
