package src.oops_5Jan;

public class LAB_5_01 {
    public static void main (String[] args){


       String str1 = "Gaurav";
       String str3 ="Gaurav Pathak";
       String str2 = str1.concat(" Pathak");

       System.out.println(str1);
       System.out.println(str2);

       System.out.println(str1.charAt(0));
       System.out.println(str1.contains("pathak"));
       System.out.println(str1.equals("GAURAV"));
       System.out.println(str1.equalsIgnoreCase("GAURAV"));
       System.out.println(str1.replace('v','i'));
       System.out.println(str3.split("Gaurav Pathak"));

       System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());





    }

}
