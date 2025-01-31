public class ConvertKmToMiles {

  static double calculateKmToMiles(double kilometers){
    double miles = kilometers / 1.6;
    return miles;
  }
  public static void main(String[] args){
    double kilometers = 10.8;
    double miles = calculateKmToMiles(kilometers);
    System.out.println("The distance "+ kilometers + " km in miles is "+ miles +" miles");
  }
}
