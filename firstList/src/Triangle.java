public class Triangle {
    
  private double lado1, lado2, lado3, perimeter;

  public void setLado1(double lado1){
    if (lado1 <= 0)
      lado1 = 1;
    else
      this.lado1 = lado1;
  }

  public double getLado1(){
    return lado1;
  }

  public void setLado2(double lado2){
    if (lado2 <= 0)
      lado2 = 1;
    else
      this.lado2 = lado2;
  }

  public double getLado2(){
    return lado2;
  }

  public void setLado3(double lado3){
    if (lado3 <= 0)
      lado3 = 1;
    else
      this.lado3 = lado3;
  }

  public double getLado3(){
    return lado3;
  }
  
  public boolean existTriangle(){
    if (lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2)
      return true;
    return false;
  }

  public double perTriangle(){
    perimeter = lado1 + lado2 + lado3;
    return perimeter;
  }

  public void triangleType(){
    if (lado1 == lado2 && lado2 == lado3)
      System.out.println("\nThe triangle is EQUILATERAL.");
    else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
      System.out.println("\nThe triangle is ISOCELES.");
    else
      System.out.println("\nThe triangle is SCALENE.");
  }

}
