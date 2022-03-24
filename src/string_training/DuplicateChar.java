package string_training;

public class DuplicateChar {
    public static void main (String args[]){
        String str= "Maharashtra";
        int count=0;
        char ch[]=str.toCharArray();
        System.out.println("Duplicate characters are :");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <  str.length(); j++) {
                if (ch[i]==ch[j]);
                System.out.println(ch[j]);
                count++;
                break;
            }
        }
    }
}
