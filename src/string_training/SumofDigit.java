package string_training;

public class SumofDigit {
    public static void main(String args[]){
        String str="12Gauri34";
        int sum=0;
        for (int i = 0; i <  str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum=sum+Character.getNumericValue(str.charAt(i));
        }
        System.out.println("Sum : "+sum);
    }
}

