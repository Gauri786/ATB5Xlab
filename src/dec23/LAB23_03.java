package src.dec23;

public class LAB23_03 {

    public static void main(String[] args){

        System.out.println("Print the value i,but i want to break when i=5");

        for (int i=1 ; i<10 ; i++)
        {
            System.out.println("value of "+ i);
            if(i==5){
                break;
            }

        } System.out.println("End");
    }
}
