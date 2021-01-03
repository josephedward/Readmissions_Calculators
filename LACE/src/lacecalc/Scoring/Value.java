package lacecalc.Scoring;

/**
 * This class converts the attribute score 
 * into a point value for the final LACE score.
 */

/**
 *
 * @author Joseph Edward 
 */
public class Value {
    
    
    public int lengthOfStay(int Days){
 
        int Points=0;
        
        if(Days<0){Points=0;}
        else
        if(Days==1){Points=1;}
        else
        if(Days==2){Points=2;}
        else
        if(Days==3){Points=3;}
        else
        if(Days>=4&&Days<=6){Points=4;}
        else
        if(Days>6&&Days<=13){Points=5;}
        else
        if(Days>=14){Points=7;}
        else{System.out.println("Invalid Length of Stay");}
        
       return Points;
    }
    
    
    public int acuteAdmission(boolean yesNo)
    {
    int Points=0;
        if (yesNo==true) {Points=3;}
    return Points;    
    }
    
    
    
    public int charlsonComorbidityScore(int Score)
    {
    int Points=0;
    
    
    if (Score<=0){Points=0;}
    else
    if (Score==1){Points=1;}
    else
    if(Score==2){Points=2;}
    else 
    if(Score==3){Points=3;}
    else
    if(Score>=4){Points=5;}
    else 
    {System.out.println("Invalid Comorbidity Score");}
        return Points;
    
    }

    public int edVisitsWithinSixMonths(int Visits)
    {
    int Points=0;
    
    if (Visits<=0){Points=0;}
    else
    if (Visits==1){Points=1;}
    else
    if(Visits==2){Points=2;}
    else 
    if(Visits==3){Points=3;}
    else
    if(Visits>=4){Points=4;}
    else 
    {System.out.println("Invalid Visit Count");}
    
    return Points;
    }
    
    
    
    
}
           

