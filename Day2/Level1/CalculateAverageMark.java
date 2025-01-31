public class CalculateAverageMark {

  static double CalculateAverage(int mathsMarks, int chemistryMarks, int physicsMarks){
    double average = (double)(mathsMarks + chemistryMarks + physicsMarks) / 3.0 ;
    return average;
  }

  public static void main(String[] args){
    int mathsMarks = 94;
    int physicsMarks = 95;
    int chemistryMarks = 96;

    System.out.println("Sam's mark in Maths is "+ mathsMarks + ", Physics is " + physicsMarks + " and Chemistry is "+ chemistryMarks +" out of 100");

    double averageMarks = CalculateAverage(mathsMarks, chemistryMarks, physicsMarks);

    System.out.println("Sam’s average mark in PCM is " + averageMarks);

  }
}
