
import java.util.HashSet;

public class AnagramCheck {

    public static void main(String[] args) {
        System.out.println(isAnagram("dusty", "study"));
        System.out.println(isAnagram("state", "taste"));
        System.out.println(isAnagram("enjoyalgorithms", "enjoymathematics"));
    }

    public static boolean isAnagram(String str1,String str2) {
        if(str1==null || str2==null || str1.length()!=str2.length()) {
            return false;
        }

        HashSet<Integer> read=new HashSet<>();

        for(int i=0;i<str1.length();i++) {
            for(int j=0;j<str2.length();j++) {
                if(read.contains(j)) {
                    continue;
                }
                if(str2.charAt(j)==str1.charAt(i)) {
                    read.add(j);
                }
            }
        }

        return read.size() == str1.length();
    }
}

