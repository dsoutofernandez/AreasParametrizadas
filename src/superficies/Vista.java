/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 * This code makes the iteractions
 * @author dsoutofernandez
 */
public class Vista {
    
    String shapeType;

    /**
     * Default builder
     */
    public Vista() {
    }

    /**
     * Builder with parametres
     * @param shapeType This recieves the shape type; obviously ;P
     */
    public Vista(String shapeType) {
        this.shapeType = shapeType;
    }

    /**
     * This will give us the shape type when we ask for the setter
     * @return our shape type
     */
    public String getShapeType() {
        return shapeType;
    }
    
    /**
     * Setter with special requirements.
     * With this, we ask for the shape type.
     */
    public void setShapeType() {
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        Scanner D = new Scanner(System.in);
        shapeType = D.next();
        System.out.println("You said: " + shapeType);
    }
    
    /**
     * This method returns a console message with the result of the operations.
     * @param area Give us the area.
     */
    public void result(float area){
    
        if(area==0){
            System.out.println("You put a wrong shape!");
        }else{
        System.out.println("Your area is " + area);
        }
    }
    
    
}
