public class TimeFormatter 
{
    
    public static String formatDuration(int seconds) 
    {
      int nyears   = seconds / (60*60*24*365);
      int ndays    = seconds / (60*60*24) % 365;
      int nhours   = seconds / 3600 % 24;
      int nminutes = seconds / 60 % 60;
      int nseconds = seconds % 60;
      String str  = "";
      
      System.out.println(nhours + ":" + nminutes  + ":" + nseconds);
      
      if(nyears == 0)
      {
      }
      else if(nyears == 1)
      {
        str += "1 year";
        if(nseconds > 0 || nminutes > 0 || nhours > 0 || ndays > 0)
          str += ", ";
      }
      else
      {
        str += nyears + " years";
        if(nseconds > 0 || nminutes > 0 || nhours > 0 || ndays > 0)
          str += ", ";
      }
      
      //----------------------------
      
      if(ndays == 0)
      {
      }
      else if(ndays == 1)
      {
        str += "1 day";
        if(nseconds > 0 || nminutes > 0 || nhours > 0)
          str += ", ";
      }
      else
      {
        str += ndays + " days";
        if(nseconds > 0 || nminutes > 0 || nhours > 0)
          str += ", ";
      }
      
      //----------------------------
      
      if(nhours == 0)
      {
      }
      else if(nhours == 1)
      {
        str += "1 hour";
        if(nseconds > 0 || nminutes > 0)
          str += ", ";
      }
      else
      {
        str += nhours + " hours";
        if(nseconds > 0 || nminutes > 0)
          str += ", ";
      }
      
      //----------------------------
      
      if(nminutes == 0)
      {
      }
      else if(nminutes == 1)
      {
        str += "1 minute";
        if(nseconds > 0)
          str += ", ";
      }
      else
      {
        str += nminutes + " minutes";
        if(nseconds > 0)
          str += ", ";
      }
      
      //----------------------------
      
      if(nseconds == 0)
      {
      }
      else if(nseconds == 1)
      {
        str += "1 second";
      }
      else
      {
        str += nseconds + " seconds";
      }
      
      if(seconds == 0)
        str = "now";
      
      str = str.replaceAll("(?s)"+","+"(?!.*?"+","+")", " and");
        
      System.out.println(str + ", for " + seconds + " seconds");
      
  
      return str;
      
    }
}