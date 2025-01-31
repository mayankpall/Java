public class DistributePens {
  static void dividePens(int pens, int students) {
    int penPerStudent = pens / students;
    int leftOutPens = pens % students;

    System.out.println("The Pen Per Student is " + penPerStudent +
        " and the remaining pen not distributed is " + leftOutPens);

  }

  public static void main(String[] args) {
    int pens = 14;
    int students = 3;

    dividePens(pens, students);

  }
}
