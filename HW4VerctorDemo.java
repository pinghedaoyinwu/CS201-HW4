public class HW4VerctorDemo{
  public static void main(String[] args){
    HW4Vector vector1 = new HW4Vector();
    HW4Vector vector2 = new HW4Vector();
    
    System.out.println("All the number in vector1 and vector2 will be randomly between 0 to 1");
    
    System.out.println("the vector1 length is " + vector1.length());
    System.out.println("the vector2 length is " + vector2.length());
    
    System.out.println("the scalar product between vector1 to vector2 is " + vector1.scalarProduct(vector2));
    
    System.out.println("the vector product between vector1 to vector2 is " + vector1.vectorProduct(vector2).toString());
    
    System.out.println("the cos between is " + vector1.cos(vector2));
    
    System.out.println("the sum of vector 1 and 2 is " + vector1.sum(vector2).toString());
    
    System.out.println("the difference of vector 1 and 2 is " + vector1.diff(vector2).toString());
  }
}