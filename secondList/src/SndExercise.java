import java.lang.Math;

public class SndExercise {
  private double coord1, coord2;


  public SndExercise(double coord1, double coord2){
    this.coord1 = coord1;
    this.coord2 = coord2;
  }

  public SndExercise(){
    this.coord1 = 0;
    this.coord2 = 0;
  }

  public boolean initDots(double coord1, double coord2){
    if (coord1 < 0 || coord2 < 0){
      return false;
    }
    else{
      this.coord1 = coord1;
      this.coord2 = coord2;
      return true;
    }
  }

  public double getFstCoord(){
    return coord1;
  }

  public double getSndCoord(){
    return coord2;
  }

  public double calcDistance(SndExercise outroPonto){
    double deltaX = outroPonto.coord1 - this.coord1;
    double deltaY = outroPonto.coord2 - this.coord2;
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }

}
