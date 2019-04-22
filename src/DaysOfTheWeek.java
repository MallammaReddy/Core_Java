import java.time.Month;
import java.time.Year;

public class DaysOfTheWeek {
	
	
	public static void main(String args[]) {
		System.out.println(Year.of(1985).atMonth(Month.JULY).atDay(2).getDayOfWeek());
		
		
String x="a";
Runnable r =()->System.out.println(x);
x="b";
r.run();
		// Get the name for the Week
		int k= 23;
		String incr=Integer.toString(k);
		String a1=incr.substring(0,1);
		
		int day1=getDsiplayDays("Sat");
		System.out.println(day1);
		
		int day=day1+Integer.valueOf(a1);
		if(day>7)
			day=day/7;
		System.out.println(getDayName(day));
		
	}
	
	final static  int getDsiplayDays(String day) {
		 int dayName = 0;
		try { // Get the name for the Week
		
		
         
         System.out.println();
        
        switch (day) {
            case "Mon": dayName = 1; break;
            case "Tue": dayName = 2; break;
            case "Wed": dayName = 3; break;
            case "Thu": dayName = 4; break;
            case "Fri": dayName = 5; break;
            case "Sat": dayName = 6; break;
            case "Sun": dayName = 7; break;
            default:dayName = 0;
        }
		}catch (NumberFormatException e){
		       System.out.println("not a number"); 
		   } 
		

        return dayName;
    }
	
	final static  String getDayName(int day) {
		 String dayName = "";
		try { // Get the name for the Week
		
		
        
        System.out.println();
       
       switch (day) {
           case 1: dayName = "Mon"; break;
           case 2: dayName = "Tue"; break;
           case 3: dayName = "Wed"; break;
           case 4: dayName = "Thu"; break;
           case 5: dayName = "Fri"; break;
           case 6: dayName = "Sat"; break;
           case 7: dayName = "Sun"; break;
           default:dayName = "Invalid day range";
       }
		}catch (NumberFormatException e){
		       System.out.println("not a number"); 
		   } 
		

       return dayName.toString();
   }

}





class Solution {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }
}