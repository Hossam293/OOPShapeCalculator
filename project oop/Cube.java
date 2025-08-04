
public class Cube extends ThreeDShape {
    private double side;

    
    public Cube(double side) {
       
        this.side = side;
    }
public Cube (String color,double side){
       super(color);
       this.side=side;
   }
   public double getSide(){
       return side;
   }
   public void setSide(double side){
       this.side=side;
   }
 @Override
     public String howToDrwa(){
      return "Draw a cube by creating aarea="+getArea();  
    }
    @Override
    public void howTopaint(){
        System.out.println("Paint a cube by creating volume="+getVolume());
    }
     

   
  
    public double getArea() {
        return 6 * side * side;
    }

    
  
    public double getVolume() {
        return side * side * side;
    }

   
    @Override
    public String toString() {
        return "Cube [Side: " + side + ", Surface Area: " + getArea() + ", Volume: " + getVolume() + "]";
    }

    
    public void display() {
        System.out.println(this.toString());
    }
    
       
}

