public class CalculateVolumeOfEarth {

  static double calculateVolume(double radius) {
      double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
      return volume;
  }

  static double calculateKmToMiles(double kilometers) {

      double miles = kilometers / 1.609;
      return miles;
  }

  public static void main(String[] args) {
      int radius = 6378; 
      double radiusInMiles = calculateKmToMiles(radius);
      double volumeInKmCubed = calculateVolume(radius);
      double volumeInMilesCubed = calculateVolume(radiusInMiles);

      System.out.println("The volume of Earth in cubic kilometers is " + volumeInKmCubed + " and in cubic miles is " + volumeInMilesCubed);
  }
}
