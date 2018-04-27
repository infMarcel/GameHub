import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.application.Platform;

public class SpaceInvadR extends Spiel
{
    Spielsteuerung spielSteuerung;
    
    
    public SpaceInvadR(){
     name = "SpaceInvadR";
     beschreibung = "Space Invaders ist ein Shoot-’em-up-Computerspiel, entworfen und programmiert von Toshihiro Nishikado und vertrieben von Taito. Erschienen ist es im Jahre 1978. Neben Pac-Man war Space Invaders eines der Spiele, die die frühe Entwicklung der Videospiele geprägt haben.";
    
    }
    
    public void starten()
    {
        Stage stage = new Stage(); 
        spielSteuerung = new Spielsteuerung();
       Scene scene = new Scene(spielSteuerung.getFlaeche());
        steuerungEinrichten(scene);
        stage.setTitle("Space Invaders");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void steuerungEinrichten(Scene scene){
        scene.setOnKeyPressed((KeyEvent ke) -> {
                spielSteuerung.gedrueckt(ke);
            });

        scene.setOnKeyReleased((KeyEvent ke) -> {
                spielSteuerung.losgelassen(ke);
            });

    }
    
}