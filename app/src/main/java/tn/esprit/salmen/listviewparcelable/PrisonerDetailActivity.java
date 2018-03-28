package tn.esprit.salmen.listviewparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import tn.esprit.salmen.listviewparcelable.models.Prisoner;

public class PrisonerDetailActivity extends AppCompatActivity {

    ImageView imgPrisoner;
    TextView tvName, tvMat, tvDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisoner_detail);

        imgPrisoner = (ImageView) findViewById(R.id.imgPrisonerBig);
        tvName = (TextView) findViewById(R.id.tv_prisoner_detail_name);
        tvMat = (TextView) findViewById(R.id.tv_prisoner_detail_mat);
        tvDuration = (TextView) findViewById(R.id.tv_prisoner_detail_duration);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            Prisoner prisoner = bundle.getParcelable(MainActivity.KEY_POSITION);
            tvName.setText(prisoner.getName());
            tvMat.setText(prisoner.getMat());
            tvDuration.setText(prisoner.getDuration());
            imgPrisoner.setBackgroundResource(prisoner.getImageRes());
        }
    }
}
