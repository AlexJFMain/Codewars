public class Snail 
{

    public static int[] snail(int[][] array) 
    {  
    
      int[] snail = new int[array.length * array.length];
      int count = 0;
      int bound = 1;
      int i = 0, j = 0;
      
      if(array[0].length == 0)
      {
        return new int[0];
      }
      else
      {
        while(count < snail.length)
        {
          while(j <= array.length - bound && count < snail.length)
          {
            snail[count]+= array[i][j];
            j++;
            count++;
          }
          
          i++;
          j--;
          while(i <= array.length - bound && count < snail.length)
          {
            snail[count]+= array[i][j];
            i++;
            count++;
          }
          
          i--;
          j--;
          while(j >= bound - 1 && count < snail.length)
          {
            snail[count]+= array[i][j];
            j--;
            count++;
          }
          
          j++;
          i--;
          while(i >= bound && count < snail.length)
          {
            snail[count]+= array[i][j];
            i--;
            count++;
          }
          
          i++;
          j++;
          
          bound++;
        }
      }
      
      return snail;
    } 
}