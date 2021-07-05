import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemovedNumbers {
  
  public static List<long[]> removNb(long n) {

    long sum = n*(n+1)/2;
    
    List<long[]> myList = new ArrayList<>();
    
    double j = 0;
    for(int i = 1; i < n; i++)
    { 
      j = (sum - i)/(i + 1);
      
      if((sum - i - (long) j) == i*j && (long) j < n)
      {
        myList.add(new long[] {i, (long)j});
      }
    }
    
    return myList;
  }
}