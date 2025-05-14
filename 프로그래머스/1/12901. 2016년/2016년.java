import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek day = date.getDayOfWeek();
        String answer = getResult(day);
        return answer;
    }
    
    public String getResult(DayOfWeek day){
        switch (day) {
            case MONDAY: return "MON";
            case TUESDAY: return "TUE";
            case WEDNESDAY: return "WED";
            case THURSDAY: return "THU";
            case FRIDAY: return "FRI";
            case SATURDAY: return "SAT";
            case SUNDAY: return "SUN";
            default: return "";
        }
    }
}