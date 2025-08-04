public class  Circle extends Shape {
    private double radius;

 
    public Circle(double radius) {
        
        this.radius = radius;
    }

   public Circle (String color,double radius){
       super(color);
       this.radius=radius;
   }
   public double getRadius(){
       return radius;
   }
   public void setRadius(double radius){
       this.radius=radius;
   }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2; 
    }
    
      @Override
    public String toString() {
        return "Circle [Radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + "]";
    }


    public void display() {
        System.out.println(this.toString());
                
    }
    @Override
     public String howToDrwa(){
      return "Draw a circle by creating area="+getArea();  
    }
    @Override
    public void  howTopaint(){
        System.out.println("Paint a circle by creating area="+getArea()); 
   }
}

