package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista v = new Vista();
        Modelo mod;
        
       v.setShapeType();
       mod = new Modelo(v.getShapeType());
       v.result(mod.Evaluation(mod.getOpType()));
        
        
        

    }
}
