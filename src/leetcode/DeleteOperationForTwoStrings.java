package leetcode;

public class DeleteOperationForTwoStrings {
    public static void main(String[] args) {
        String word1="sea";
        String word2="eat";
        System.out.println(minDistance(word1,word2));

    }

    public static int minDistance(String word1, String word2) {
        StringBuilder sb1=new StringBuilder();
        sb1.append(word1);
        StringBuilder sb2=new StringBuilder();
        sb2.append(word2);
        int result=0;
        for (int i = 0; i < word1.length(); i++) {
            if(!word2.contains(word1.substring(i,i+1))) {
                sb1.append(word1.substring(i, i + 1));
                result++;
            }

        }
        for (int i = 0; i < word2.length(); i++) {
            if(word1.contains(word2.substring(i,i+1))) {
                sb2.append(word2.substring(i, i + 1));
                result++;
            }

        }

        return  result/2;
    }
}
