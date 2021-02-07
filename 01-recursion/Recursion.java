public class Recursion{
  /*
  *@param s any string
  *@return a string that is the reversed version of s, do NOT use built in methods to do so, use recursion.
  */
  public static String reverse(String s){
    if(s.length() <= 1) return s;
    return reverse(s.substring(1)) + s.charAt(0);
  }

  /*
  *@param length how long the words must be
  *param word the variable to store the partial solution (should start at "")
  *@return the number of words that have no adjacent matching letters using the letters a-z.
  *Repetition allowed except when letters are adjacent.
  */
  public static long countNoDoubleLetterWords(int length,String word){
    //Hint: not a wrapper method, but you must call it starting with "" as your word.
    long count=0;
    if(length==0){
      if(word.length()==0) return 0;
      return 1;
    }
    for(char c='a'; c<='z'; c++){
      if(word.length()==0 || word.charAt(word.length()-1)!=c){
        count+=countNoDoubleLetterWords(length-1,word+c);
      }
    }
    return count;
  }

  /*
  *@param n any non-negative value you want to take the sqrt of
  *@return the approximate sqrt of n within a tolerance of 0.001%
  */
  public static double sqrt(double n){
    return sqrt(n, n/2)
  }

  public static double sqrt(double n, double g){
    return 0;
  }

}
