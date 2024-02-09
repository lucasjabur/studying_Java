public class FstExercise {

  private int hours;
  private int minutes;
  private int seconds;

  public FstExercise(FstExercise time){
    this.hours = validHour(time.getHours());
    this.minutes = validMinSec(time.getMinutes());
    this.seconds = validMinSec(time.getSeconds());
  }

  public FstExercise(int hours, int minutes, int seconds){
    this.hours = validHour(hours);
    this.minutes = validMinSec(minutes);
    this.seconds = validMinSec(seconds);
  }

  public FstExercise(int hours, int minutes){
    this.hours = validHour(hours);
    this.minutes = validMinSec(minutes);
    seconds = 0;
  }

  public FstExercise(int hours){
    this.hours = validHour(hours);
    minutes = 0;
    seconds = 0;
  }

  public void setHours(int hours){
    this.hours = validHour(hours);
  }

  public int getHours(){
    return hours;
  }

  public void setMinutes(int minutes){
    this.minutes = validMinSec(minutes);
  }

  public int getMinutes(){
    return minutes;
  }

  public void setSeconds(int seconds){
    this.seconds = validMinSec(seconds);
  }

  public int getSeconds(){
    return seconds;
  }

  public int validMinSec(int values){
    if (values < 0 || values > 59)
      return 0;
    else return values;
  }

  public int validHour(int values){
    if (values < 0 || values > 23)
      return 0;
    else return values;
  }

}

