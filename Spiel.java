

public class Spiel
{  
    protected String name ;
    protected String beschreibung;
    protected Highscoreliste hisclist;
    protected String savename;
    public Spiel()
    {
        
    }
        
    public String getName(){
     return name;   
    }
    public String getBESCH(){
     return beschreibung;   
    }
    public void start(){}
    public void HighscoreAdden(String name , int score){
        hisclist.Spielerhinzufügen(new Eintrag(name,score));        
    }
    public int getScore(int a){
        return hisclist.getScore(a);
    }
    public String getName(int a){
        return hisclist.getName(a);
    }
    public void addtoHighscorelist(int score , String name){
        hisclist.Spielerhinzufügen(new Eintrag(name,score));
    }
}
