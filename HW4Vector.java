public class HW4Vector{
  private double x, y, z;
  
  public HW4Vector(){
    randomly();
  }
  
  public double length(){
    double length = this.x*this.x+this.y*this.y+this.z*this.z;
    length = Math.sqrt(length);
    return length;
  }
  
  public double scalarProduct(HW4Vector vector){
    return this.x*vector.x+this.y*vector.y+this.z*vector.z;
  }
  
  public HW4Vector vectorProduct(HW4Vector vector){
    HW4Vector test = new HW4Vector();
    test.x = this.y*vector.z-this.z*vector.y;
    test.y = this.z*vector.x-this.x*vector.z;
    test.z = this.x*vector.y-this.y*vector.x;
    return test;
  }
  
  public double cos(HW4Vector vector){
    double a,b;
    a = this.x*vector.x+this.y*vector.y+this.z*vector.z;
    b = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z)*Math.sqrt(vector.x*vector.x+vector.y*vector.y+vector.z*vector.z);
    return a/b; 
  }
  
  public HW4Vector sum(HW4Vector vector){
   HW4Vector test = new HW4Vector();
   test.x = this.x+vector.x;
   test.y = this.y+vector.y;
   test.z = this.z+vector.z;
   return test;
  }
  
  public HW4Vector diff(HW4Vector vector){
   HW4Vector test =  new HW4Vector();
   test.x = this.x-vector.x;
   test.y = this.y-vector.y;
   test.z = this.z-vector.z;
   return test;
  }
    
  public String toString(){
    return "Vector"+this.x+","+this.y+","+this.z;
  }
    
  public void randomly(){
   this.x = Math.random();
   this.y = Math.random();
   this.z = Math.random();
  }
}