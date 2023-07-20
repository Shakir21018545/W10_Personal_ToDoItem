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
        String str = title + "\n" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH)
                + "/" + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }
    private String getDay(int day) {

        // Complete the code here
        if (date.get(Calendar.DAY_OF_WEEK)==1){
            return "Sunday";
        }if (date.get(Calendar.DAY_OF_WEEK)==2){
            return "Monday";
        }if (date.get(Calendar.DAY_OF_WEEK)==3){
            return "Tuesday";
        }if (date.get(Calendar.DAY_OF_WEEK)==4){
            return "Wednesday";
        }if (date.get(Calendar.DAY_OF_WEEK)==5){
            return "Thursday";
        }if (date.get(Calendar.DAY_OF_WEEK)==6){
            return "Friday";
        }if (date.get(Calendar.DAY_OF_WEEK)==7) {
            return "Saturday";
        }
        return null;
    }


}