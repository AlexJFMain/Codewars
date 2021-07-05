public class Scramblies 
{
    
    public static boolean scramble(String str1, String str2) 
    {
      
      int[] str1content = new int[26];
      int[] str2content = new int[26];
      
      boolean isSub = true;
      
      for(int i = 0; i < str1.length(); i++)
        str1content[(int) str1.charAt(i) - 97] += 1;
      
      for(int j = 0; j < str2.length(); j++)
        str2content[(int) str2.charAt(j) - 97] += 1;
      
      for(int k = 0; k < 26; k++)
      {
        if(str1.length() > str2.length())
        {
          if(str2content[k] > str1content[k])
            isSub = false;
        }
        if(str1.length() < str2.length())
        {
          if(str2content[k] < str1content[k])
            isSub = false;
        }
        if(str1.length() == str2.length())
        {
          if(str2content[k] != str1content[k])
            isSub = false;
        }
      }
      
      return isSub;
    }
}