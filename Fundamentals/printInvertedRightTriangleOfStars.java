public class printInvertedRightTriangleOfStars {

  public static void printInvertedRightTriangleOfStars(int rows) {

    for (int i = 0; i < rows; i++) {

      for (int j = 0; j < rows - i; j++)
        System.out.print("* ");
      System.out.println();
    }

  }

  public static void main(String[] args) {

    printInvertedRightTriangleOfStars(5);

  }

}
