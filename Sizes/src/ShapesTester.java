
public class ShapesTester 
{  
  public static void main(String[] args)
  {
    Sizeable s1 = new Sphere(10);
    Sizeable c1 = new Cylinder(5,3);
    Sizeable p1 = new RectangularPrism(3,4,5);
 
   System.out.println(p1);
   System.out.println(s1);
   System.out.println(c1);
  }
}

