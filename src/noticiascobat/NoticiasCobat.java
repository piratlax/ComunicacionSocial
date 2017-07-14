
package noticiascobat;
import gui.Acceso;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
public class NoticiasCobat {


    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable(){
        public void run(){
            
            try{
                // Se llama a la libreria de aspecto Substance
                JFrame.setDefaultLookAndFeelDecorated(true);
                
                
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
                
            }              
            catch(Exception e){
            } 
            
            Acceso frm = new Acceso();
            frm.setVisible(true);
            
            
        }
        });          
    }
    
}
