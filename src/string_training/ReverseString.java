package string_training;

public class ReverseString {
    public  static void main (String  args[]){
        String str="Gauri Hiremath";
        String revstr= " ";
        for (int i = str.length()-1 ;i>=0; i--) {
            revstr=revstr+str.charAt(i);
        }
        System.out.println("Original string :"+str);
        System.out.println("Reverse String :" +revstr);

    }
}
