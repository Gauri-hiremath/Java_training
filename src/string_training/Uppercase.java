package string_training;

public class Uppercase {
    public static void main (String args[]){
        String str="GAURIHiremath@26";
        int upper=0,lower=0,special=0,number=0;
        for (int i = 0; i < str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch >='A'&& ch <='Z')
                upper++;
            else if (ch >='a'&& ch <='z')
                lower++;
            else if (ch >='0'&& ch <='9')
                number++;
            else
                special++;
        }
        System.out.println("Upperacse : "+upper);
        System.out.println("Lowercase :"+lower);
        System.out.println("Number :"+number);
        System.out.println("Special : "+special);
    }
}
