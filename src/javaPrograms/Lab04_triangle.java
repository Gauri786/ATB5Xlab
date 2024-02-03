package src.javaPrograms;

public class Lab04_triangle {
    public static void main (String[] args){

      /*int n=10;
      for(int i=1; i<=n; i++){
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }*/

        /*int n= 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        package src.javaPrograms;

public class Lab04_triangle {
    public static void main(String[] args) {

        int totalRowNo = 5;

        for (int row = 1; row <= totalRowNo; row++) {
            // Print spaces before the stars
            for (int space = 1; space <= totalRowNo - row; space++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            // Move to the next line after printing stars for the current row
            System.out.println();
        }}} */
        int totalRowNo=5;
        for (int row =1; row<=totalRowNo; row++){
            for (int Space = 1; Space <=totalRowNo-row; Space++){
                System.out.print(" ");

            }
            for (int star = 1; star <= 2* row -1; star++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
