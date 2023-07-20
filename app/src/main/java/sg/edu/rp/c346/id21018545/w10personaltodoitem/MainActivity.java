package sg.edu.rp.c346.id21018545.w10personaltodoitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<ToDoItem> alAndroidVersions;
    ArrayAdapter<ToDoItem> aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.lv);
        alAndroidVersions = new ArrayList<>();

        Calendar c1 = Calendar.getInstance();
        c1.set(2022, 2 , 15);

        Calendar c2 = Calendar.getInstance();
        c2.set(2022, 2 , 13);

        Calendar c3 = Calendar.getInstance();
        c3.set(2022, 2 , 11);


        ToDoItem item1 = new ToDoItem("Go to school", c1);
        ToDoItem item2 = new ToDoItem("Go to home", c2);
        ToDoItem item3 = new ToDoItem("Go to movie", c3);

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);

        aaAndroidVersions = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, alAndroidVersions);

        lvAndroidVersions.setAdapter(aaAndroidVersions);
    }
}
