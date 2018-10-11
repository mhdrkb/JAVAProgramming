/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentTime;

/**
 *
 * @author Java
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("total millisecond from midnight jan 1, 1970 is "+ totalMilliseconds);
        
        
        long totalSeconds = totalMilliseconds/1000;
        System.out.println("total second from midnight jan 1, 1970 is "+ totalSeconds);
        
        
        long totalminute = totalSeconds/60;
        System.out.println("Total minute from midnight jan 1, 1970 is "+ totalminute);
        long restSeconds = totalSeconds % 60;
        System.out.println("Rest seconds after minute from midnight jan 1, 1970 is "+ restSeconds);
        
        
        long totalHour = totalminute/60;
        System.out.println("Total Hour from midnight jan 1, 1970 is "+ totalHour);
        long remainingMinute = totalminute % 60;
        System.out.println("Rest minute after hour from midnight jan 1, 1970 is "+ remainingMinute);
        
        
        long totalDay =  totalHour/24;
        System.out.println("Total day from midnight jan 1, 1970 is "+ totalDay);
        long remainingHour = totalHour % 24;
        System.out.println("Rest hour after day from midnight jan 1, 1970 is "+ remainingHour);
        
        
        long totalMonth =  totalDay/30;
        System.out.println("Total Month from midnight jan 1, 1970 is "+ totalMonth);
        long remainingDay = totalDay % 30;
        System.out.println("Rest day after month from midnight jan 1, 1970 is "+ remainingDay);
        
        
        long totalYear =  totalMonth/12;
        System.out.println("Total Year from midnight jan 1, 1970 is "+ totalYear);
        long remainingMonth = totalMonth % 12;
        System.out.println("Rest day after year from midnight jan 1, 1970 is "+ remainingMonth);
    }
    
}
