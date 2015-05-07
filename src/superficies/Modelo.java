/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 *
 * @author dsoutofernandez
 */
public class Modelo {
    
    String OpType;

    public Modelo() {
    }

    public Modelo(String OpType) {
        this.OpType = OpType;
    }

    public String getOpType() {
        return OpType;
    }

    public void setOpType(String OpType) {
        this.OpType = OpType;
    }
    
    public float Evaluation(String OpType){
    
        if (OpType.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            System.out.println("what is the side length?");
            Scanner sL = new Scanner(System.in);
            sideLength = Float.parseFloat(sL.toString());
            squareArea = sideLength * sideLength;
            //System.out.println("The area for your square: " + squareArea);
            
            return squareArea;
        }else if (OpType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            System.out.println("what is the rectangles width?");
            Scanner sL = new Scanner(System.in);
            sideLength = Float.parseFloat(sL.toString());
            System.out.println("What is the rectangles height?");
            Scanner sH = new Scanner(System.in);
            sideHeight = Float.parseFloat(sH.toString());
            rectangleArea = sideLength * sideHeight;
            //System.out.println("The area for your rectangle is: " + rectangleArea);

            return rectangleArea;
        }else if (OpType.equals("triangle")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;

            System.out.println("What is the base length of the triangle?");
            Scanner bL = new Scanner(System.in);
            baseLength = Float.parseFloat(bL.toString());
            System.out.println("What is the height of the triangle?");
            Scanner H = new Scanner(System.in);
            height = Float.parseFloat(H.toString());
            triangleArea = (float) (0.5 * baseLength * height);
            //System.out.println("Your triangles area is: " + triangleArea);
            
            return triangleArea;
        }else if (OpType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            System.out.println("What is the radius of the circle?");
            Scanner R = new Scanner(System.in);
            radius = Float.parseFloat(R.toString());
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            //System.out.println("Your Circles area is " + circleArea);

            return circleArea;
        }else
            
        { return 0;} 
        
    }
    
    
}
