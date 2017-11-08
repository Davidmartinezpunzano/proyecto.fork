/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelCotxe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ModelCotxe {

    public ModelCotxe() {
    }

    public void EscribirFichero(String[] generar) {
        
       final JFileChooser fc = new JFileChooser();
       int returnValue = fc.showSaveDialog( null ) ;
    if( returnValue == JFileChooser.SAVE_DIALOG) {
        File file = fc.getSelectedFile();
    }

       
        try {
     
         BufferedWriter datos = new BufferedWriter(new FileWriter(fc.getSelectedFile()));
            int i;
         for(i=0;i<6;i++){
            datos.write(generar[i]+"\n;");
         }
         datos.newLine();
         datos.close();
         JOptionPane.showMessageDialog(null,"La informació s'ha guardat correctament" ); 
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Hi ha hagut un error mentre es guardava la informació" ); 
        }
        finally{}
        
    }
}
