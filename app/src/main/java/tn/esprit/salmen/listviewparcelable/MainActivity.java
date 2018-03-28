package tn.esprit.salmen.listviewparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import tn.esprit.salmen.listviewparcelable.adaters.PrisonerAdapter;
import tn.esprit.salmen.listviewparcelable.utils.PrisonerContent;

public class MainActivity extends AppCompatActivity {

    ListView lvPrisoners;
    public static final String KEY_POSITION = "keyPosition";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPrisoners = (ListView) findViewById(R.id.lv_prisoners);
        PrisonerAdapter adapter = new PrisonerAdapter(this, R.layout.item_prisoner, PrisonerContent.getPrisoners());
        lvPrisoners.setAdapter(adapter);

        lvPrisoners.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, PrisonerDetailActivity.class);
                intent.putExtra(KEY_POSITION, PrisonerContent.getPrisoners().get(position));
                startActivity(intent);
            }
        });
    }
}
