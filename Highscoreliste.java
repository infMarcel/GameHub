 import java.util.ArrayList;
public class Highscoreliste
{
    private ArrayList<Eintrag> Spieler = new ArrayList<Eintrag>();
    public Highscoreliste()
    {       Listeladen();
    }

    public void Listespeichern(){
        
        
    }
    
    public void Listeladen(){
        
    }
    
    public void Spielerhinzufügen(Eintrag EinNew){   
        boolean inserted = false;
        for(int a = 0 ; a<=9;a++){
            if(inserted == false){
                   if(EinNew.getScore() >= Spieler.get(a).getScore()){
                       Spieler.add(a,EinNew);
                       inserted = true;
                    }
            }
        }
        if(Spieler.size() > 10){
            Spieler.remove(10);
        }
        
    //https://stackoverflow.com/questions/16111496/java-how-can-i-write-my-arraylist-to-a-file-and-read-load-that-file-to-the?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
}
}
