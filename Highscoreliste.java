 import java.util.ArrayList;
 import java.io.*;

 
 public class Highscoreliste implements Serializable
{
    private ArrayList<Eintrag> Spieler;
    private String savefile;
    public Highscoreliste(String save)
    
    { 
        System.out.println("Liste wird geladen");
        savefile = save;
        Spieler = new ArrayList<Eintrag>();
        for(int a = 0 ; a<= 9 ; a++){
            Spieler.add(a,new Eintrag("",0));
        }
        Listeladen();
        ListeAusgeben();
    }

    public void Listespeichern(){
        try{
            FileOutputStream fs = new FileOutputStream(savefile);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Spieler);
            os.close();
        
        }
        catch(Exception ex){
            System.out.println("Fehler beim Speichern");
        }
    }
    
    public void Listeladen(){
        try{
            FileInputStream fis = new FileInputStream(savefile);
            ObjectInputStream is = new ObjectInputStream(fis);
            Spieler = (ArrayList<Eintrag>) is.readObject();
            is.close();
            
            
        }
        catch(Exception ex){
                System.out.println("Fehler beim Laden");
        }
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
       public void ListeAusgeben(){
        System.out.println("Die Liste!");
        for (Eintrag e : Spieler)
        {
            System.out.println(e.getName());
        }
    }
    public String getName(int a){
            return Spieler.get(a).getName();            
        }
    public int getScore(int a){
        return Spieler.get(a).getScore();
    }
}
