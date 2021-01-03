package lacecalc.Scoring;

    /**
 * This class gathers the attribute scores:  
 * 
 * Length
 * Acuity
 * Comorbidity 
 * E visits
 * .
 */
import java.util.ArrayList;

/**
 *
 * @author Joseph Edward
 */
public class theAttributes
{
    //Create a value class that is used for final score calculations
  private final Value val=new Value();
  //FINAL POINT SCORE 
  private final Points numPoints=new Points();

  
   
   //CHANGED FROM CONSTRUCTOR
   public void getTextAttributes(ArrayList attList)
   {
   this.lengthOfStay((String) attList.get(0));
   this.acuteAdmission((String) attList.get(1));
   this.charlsonComorbidityScore((String) attList.get(2));
   this.EDvisitsWithinSixMonths((String) attList.get(3));      
   }
   
  

    private void lengthOfStay(String someText)
    {
           
    int days=Integer.parseInt(someText);
    int tempPoints=val.lengthOfStay(days);//get the points that apply to that value 
    numPoints.incrementCounterWithValue(tempPoints); //Increment final count with number of points
    }
    
    private void acuteAdmission(String someText)
    {
    Boolean   yesNo=Boolean.parseBoolean(someText);  
    int tempPoints=val.acuteAdmission(yesNo);
    numPoints.incrementCounterWithValue(tempPoints);
    }
    
    private void charlsonComorbidityScore(String someText)
    {     
     
    int score=Integer.parseInt(someText);   
    int tempPoints=val.charlsonComorbidityScore(score);
    numPoints.incrementCounterWithValue(tempPoints);
    }
    
    private void EDvisitsWithinSixMonths(String someText)
    {
    int visits=Integer.parseInt(someText);
    int tempPoints=val.edVisitsWithinSixMonths(visits);
    numPoints.incrementCounterWithValue(tempPoints);   
    }

    
    //Accessor method for final point value 
    public int getPoints()
    {
    return this.numPoints.getPoints();
    
    }
            
    public String getRisk()
    {
     if(this.numPoints.isHighRisk()==true)
     {return "High";}
     else if(this.numPoints.isHighRisk()==false)
     {return "Low";}
     else
     {return "Undefined: Program Error in function getRisk";}    
    }
    
    
    
}
