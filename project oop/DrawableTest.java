import java.util.*;

public class DrawableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of objects (minimum 2): ");
        int numObjects = scanner.nextInt();

       
        while (numObjects < 2) {
            System.out.println("You must enter at least 2 objects. Try again: ");
            numObjects = scanner.nextInt();
        }

        Drawable[] drawableObjects = new Drawable[numObjects];

        
        for (int i = 0; i < numObjects; i++) {
        
            String choice = scanner.next();

            if ("Circle".equals(choice)) {
                
                double radius = scanner.nextDouble();
                if(radius>0){
                    drawableObjects[i] = new Circle(radius);
                }
                else{
                    System.out.println("radius Should be more than 0");
                }
                drawableObjects[i] = new Circle(radius);

            }  
            else if ("Cube".equals(choice)) {
                
                double side = scanner.nextDouble();
                if(side>0){
                    drawableObjects[i] = new Circle(side);
                }
                else{
                    System.out.println("side Should be more than 0");
                }
                drawableObjects[i] = new Cube(side);
            } else {
                System.out.println("Error: Invalid object type. Please enter 'Circle' or 'Cube'.");
        i--;
        
            }
        }

        double totalArea = 0;

        for (Drawable currentDrawable : drawableObjects) {
             
            if (currentDrawable instanceof Circle) {
                totalArea += ((Circle) currentDrawable).getArea();
            } else if (currentDrawable instanceof Cube) {
                totalArea += ((Cube) currentDrawable).getArea();
            }
        }

        System.out.println("Total Area of all objects: " + totalArea);

        scanner.close(); 
    }
}
        

    

