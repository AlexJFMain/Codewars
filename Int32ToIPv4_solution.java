public class Kata {
  public static String longToIP(long ip) {
    
    System.out.println("--------------------------------");
    System.out.println("ip: " + ip);
    
    int[] binaryArray = new int[32];
    long start  = 2147483648L;
    int instart = 31;
    long ipcopy = ip;
    
    String  first, second, third, fourth = "";
    int nfirst = 0, nsecond = 0, nthird = 0, nfourth =  0;
    
    for(int i = 0; i < 32; i++)
    {
      
      if(ipcopy/start != 0)
      {
        ipcopy -= start;
        binaryArray[31 - i] = 1;
      }
      
      System.out.println("Index " + i + ", " + binaryArray[31 - i] + ", Power: " + instart);
      
      start = start/2;
      instart--;
    }
    
    start = 128;
    
    for(int j = 7; j >= 0; j--)
    {
      if(binaryArray[j] == 1)
        nfirst += start;
      
      if(binaryArray[j+8] == 1)
        nsecond += start;
      
      if(binaryArray[j+16] == 1)
        nthird += start;
      
      if(binaryArray[j+24] == 1)
        nfourth += start;
      
      System.out.println(start);
      start = start/2;
    }

    System.out.println(nfirst + " " + nsecond + " " + nthird + " " + nfourth);
    System.out.println("--------------------------------");

    return nfourth + "." + nthird + "." + nsecond + "." + nfirst;
  }
}