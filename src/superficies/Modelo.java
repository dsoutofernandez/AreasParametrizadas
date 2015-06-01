/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 *This code do the operations
 * @author dsoutofernandez
 */
public class Modelo {
    
           float squareArea;
            //float sideLength;
            //float sideHeight;
            float rectangleArea;
            // float baseLength;
           // float height;
            float triangleArea;
            //float radius;
            float circleArea;
    float op1;
    float op2;
    
    String OpType;

    /**
     * Default builder
     */
    public Modelo() {
    }

    public Modelo(float op1, float op2, String OpType) {
        this.op1 = op1;
        this.op2 = op2;
        this.OpType = OpType;
    }

    public Modelo(float op1, String OpType) {
        this.op1 = op1;
        this.OpType = OpType;
    }
    
    

    /**
     * Parameters builder
     * @param OpType 
     */
    public Modelo(String OpType) {
        this.OpType = OpType;
    }

    /**
     * This retunrs Operation/Shape type
     * @return 
     */
    public String getOpType() {
        return OpType;
    }

    /**
     * This set Operation type to OpType
     * @param OpType 
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }
    
    /**
     * This, basically, does everything.
     * @param OpType
     * @return 
     */
    public float Evaluation(String OpType){
    

        
            
        if (OpType.equals("square")) {
            //add area calculations for square
            

            //System.out.println("what is the side length?");
            //Scanner sL = new Scanner(System.in);
            //sideLength = sL.nextFloat();
            squareArea = op1 * op2;
            //System.out.println("The area for your square: " + squareArea);
            
            return squareArea;
        }else if (OpType.equals("rectangle")) {
            //add area calculations for rectangle here
            

            //System.out.println("what is the rectangles width?");
            //Scanner sL = new Scanner(System.in);
            //sideLength = sL.nextFloat();
            //System.out.println("What is the rectangles height?");
            //Scanner sH = new Scanner(System.in);
            //sideHeight = sH.nextFloat();
            rectangleArea = op1 * op2;
            //System.out.println("The area for your rectangle is: " + rectangleArea);

            return rectangleArea;
        }else if (OpType.equals("triangle")) {
            //add area calculations for triangle here
           

            //System.out.println("What is the base length of the triangle?");
            //Scanner bL = new Scanner(System.in);
            //baseLength = bL.nextFloat();
            //System.out.println("What is the height of the triangle?");
            //Scanner H = new Scanner(System.in);
           // height = H.nextFloat();
            triangleArea = (float) (0.5 * op1 * op2);
            //System.out.println("Your triangles area is: " + triangleArea);
            
            return triangleArea;
        }else if (OpType.equals("circle")) {
            //add area calculations for a circle here
            

            //System.out.println("What is the radius of the circle?");
            //Scanner R = new Scanner(System.in);
            //radius = R.nextFloat();
            circleArea = op1 * op1;
            circleArea = (float) (3.14159265 * circleArea);
            //System.out.println("Your Circles area is " + circleArea);

            return circleArea;
            
        }else
            
        { return 0;} 
        
    }

    
    
    
}
