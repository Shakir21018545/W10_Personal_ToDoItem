package sg.edu.rp.c346.id21018545.w10personaltodoitem;

import java.io.Serializable;
import java.util.Calendar;

public class ToDoItem implements Serializable {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {

        this.date = date;
    }
    public String toString() {
        String str = title + "\n" + date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {

        // Complete the code here
        if (day == 0){
            return "Sunday";
        }
        if (day == 1) {
            return "Monday";
        }
        if (day == 2) {
            return "Tuesday";
        }
        if (day == 3) {
            return "Wednesday";
        }
        if (day == 4) {
            return "Thursday";
        }
        if (day == 5) {
            return "Friday";
        }
        if (day == 6) {
            return "Saturday";
        }
        return null;
    }
}
