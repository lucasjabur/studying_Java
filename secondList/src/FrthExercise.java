public class FrthExercise {

  private double firstSide, secondSide, thirdSide;

  public FrthExercise(double firstSide, double secondSide, double thirdSide){
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.thirdSide = thirdSide;
  }

  public void setFirstSide(double firstSide){
    if (firstSide <= 0)
      firstSide = 1;
    else
      this.firstSide = firstSide;
  }

  public double getFirstSide(){
    return firstSide;
  }

  public void setSecondSide(double secondSide){
    if (secondSide <= 0)
      secondSide = 1;
    else
      this.secondSide = secondSide;
  }

  public double getSecondSide(){
    return secondSide;
  }

  public void setThirdSide(double thirdSide){
    if (thirdSide <= 0)
      thirdSide = 1;
    else
      this.thirdSide = thirdSide;
  }

  public double getThirdSide(){
    return thirdSide;
  }
  
  public boolean existTriangle(){
    if (firstSide < secondSide+thirdSide && secondSide < firstSide+thirdSide && thirdSide < firstSide+secondSide)
      return true;
    return false;
  }

  public double perTriangle(){
    double perimeter = firstSide + secondSide + thirdSide;
    return perimeter;
  }

  public void triangleType(){
    if (firstSide == secondSide && secondSide == thirdSide)
      System.out.println("\nThe triangle is EQUILATERAL.");
    else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide)
      System.out.println("\nThe triangle is ISOCELES.");
    else
      System.out.println("\nThe triangle is SCALENE.");
  }

}
