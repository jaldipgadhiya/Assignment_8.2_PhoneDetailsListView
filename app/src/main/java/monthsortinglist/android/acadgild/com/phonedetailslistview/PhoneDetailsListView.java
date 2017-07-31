package monthsortinglist.android.acadgild.com.phonedetailslistview;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import adapter.CustomAdapter;
import bean.CustomHandler;

public class PhoneDetailsListView extends AppCompatActivity implements AdapterView.OnItemClickListener  {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println("Click");
    }

    ListView list;
    ArrayList<CustomHandler> model= new ArrayList<>();
    HashMap<String,String> hmap = new HashMap<String,String>();
    /*ContentResolver cr;
    String phoneNo;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details_list_view);
        list= (ListView)findViewById(R.id.phoneList);

        hmap.put("9434343434","ABC");
        hmap.put("8434344366","DEF");
        hmap.put("7845668977","GHI");
        hmap.put("9898456776","JKL");
        hmap.put("8855674356","MNO");
        hmap.put("8007343245","PQR");
        hmap.put("9898532678","STU");
        hmap.put("9543434546","VWX");
        hmap.put("9766947651","YZA");
        hmap.put("9428421976","BCD");
        hmap.put("9725936431","EFG");
        hmap.put("9428230421","HIJ");
        System.out.println("1");

        for(Map.Entry m:hmap.entrySet()){
            CustomHandler handler= new CustomHandler();
            handler.setName(m.getValue().toString());
            handler.setPhoneNo(m.getKey().toString());
            model.add(handler);
        }


        CustomAdapter adapter= new CustomAdapter(this, model);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }





}
