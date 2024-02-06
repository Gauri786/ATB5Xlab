package src.oops_Dec30;

public class Lab06_Reverse {
    public static void main( String[] args){

        String name = "Gaura";
        char charArray[] = name.toCharArray();
        System.out.println(charArray.length);


        int left = 0;
        int right = charArray.length-1;

        while (left<right){
            char temp =charArray[left];
            charArray [left] =charArray [right];
            charArray[right]= temp;

            left++;
            right--;
        }

        String revname= new String(charArray);
        System.out.println(revname);

    }
}
