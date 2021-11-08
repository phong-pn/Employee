package logic;

import java.util.*;

public class Util {

    public static Date getDateFrom(int year, int month, int day){
        Calendar date = Calendar.getInstance();
        date.set(year, month, day);
        return date.getTime();
    }
    
}
