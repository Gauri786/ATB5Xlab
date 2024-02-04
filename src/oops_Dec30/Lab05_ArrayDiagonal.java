package src.oops_Dec30;

public class Lab05_ArrayDiagonal {
    public static void main(String[] args){

        int array_2d[][] = new int[3][3];

        array_2d[0][0]= 1;
        array_2d[0][1]=4;
        array_2d[0][2]=7;
        array_2d[1][0]= 1;
        array_2d[1][1]=4;
        array_2d[1][2]=7;
        array_2d[2][0]= 1;
        array_2d[2][1]=4;
        array_2d[2][2]=7;

        for(int i=0; i< array_2d.length; i++){
            System.out.println(array_2d[i][i]);
        }



    }
}
