public class LeapYear {
    public static boolean isLeapYear(int Year){
        if (!(Year>=1 && Year<=9999)){
            return false;
        }
        if(Year % 4 == 0){
            if(Year % 100 == 0){
                if(Year % 400 == 0){
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else{
               return true;
            }
        }
        else{
            return false;
        }
    }
}
