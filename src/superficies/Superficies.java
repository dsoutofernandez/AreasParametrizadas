package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 * This Main() is like a Controller
 * @author damian
 */
public class Superficies {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Object type Vista() created and initialized
         */
        Vista v = new Vista();
        /**
         * Object type Modelo() created
         */
        Modelo mod;
        
        /**
         * Setting the shape type requirement
         */
       v.setShapeType();
       /**
        * Initializing mod with the parametres builder
        */
       mod = new Modelo(v.getShapeType());
       /**
        * Setting the result. Evaluating the shape type given and doing operations. ALL IN ONE :D
        */
       v.result(mod.Evaluation(mod.getOpType()));
        
        
        

    }
}
