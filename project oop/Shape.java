import java.util.Date;
public abstract class Shape implements Drawable {
 


    
    private Date dateCreated;
    private String color;

    
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    
    public Date getDateCreated() {
        return dateCreated;
    }

    
    public abstract double getArea();
   
    public double getPerimeter() {
        return 0; 
    }
    
}

