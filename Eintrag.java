

public class Eintrag
{
    private String name;
    private int score;
   
    public Eintrag(String name_ , int score_)
    {
       name = name_;
       score = score_;
    }
    
    public String getName(){
     return name   ;
    }
    
    public int getScore(){
     return score;   
    }
}
