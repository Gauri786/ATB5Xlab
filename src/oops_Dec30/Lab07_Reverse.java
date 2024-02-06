package src.oops_Dec30;

public class Lab07_Reverse {
    public static void main( String[] args){

        String name = "Gaurav";
        String y ="";

        for ( int i= name.length()-1; i>=0 ; i--){

            y=y+name.charAt(i);
        }
        System.out.println(y);



    }
}
