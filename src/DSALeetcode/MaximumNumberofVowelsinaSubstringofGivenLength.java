package DSALeetcode;


public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public  static int maxVowels(String s, int k){
      int l =0 ; int count = 0 ; int ans = 0;

      for(int i =0;i<s.length();i++){
          if(currVowel(s.charAt(i))){
              count++;
          }

          if( i - l +1 > k){
              if(currVowel(s.charAt(l))) count--;
              l++;
          }

          ans = Math.max(count,ans);
          if(ans == k) return  ans ;
      }

      return  ans;
    }

    public  static  boolean currVowel(char c){
        return  c == 'a' || c == 'e' || c =='i' || c =='o' || c == 'u';
    }

    public static void main(String[] args) {
        String s ="abiiidef"; int k = 3;
        System.out.println(maxVowels(s,k));
    }
}
