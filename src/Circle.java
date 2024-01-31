import java.lang.Math;

public class Circle {
  private String name;
  private Dot center = new Dot();
  private double raio;

  public boolean setName(String name){
    if (name == null)
      return false;
    else{
      this.name = name;
      return true;
    }
  }

  public String getName(){
    return name;
  }

  public void setCenter(double x, double y){
    center.initDots(x, y);
  }

  public Dot getCenter(){
    return center;
  }

  public boolean setRadius(double raio){
    if (raio <= 0.0)
      return false;
    else{
      this.raio = raio;
      return true;
    }
  }

  public double getRadius(){
    return raio;
  }

  public double calcDiameter(){
    return 2*raio;
  }

  public double calcArea(){
    return Math.PI*(raio*raio);

  }

  public double calcCircunference(){
    return 2*Math.PI*raio;
  }

  public void showData(){
    System.out.println("Radius: "+raio);
    System.out.printf("Diameter: %.2f%n",calcDiameter());
    System.out.println("Name: "+name);
    System.out.printf("Area: %.4f%n",calcArea());
    System.out.printf("Circunference: %.4f%n",calcCircunference());
  }

}
