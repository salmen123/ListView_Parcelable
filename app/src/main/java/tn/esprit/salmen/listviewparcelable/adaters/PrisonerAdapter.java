package tn.esprit.salmen.listviewparcelable.adaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tn.esprit.salmen.listviewparcelable.R;
import tn.esprit.salmen.listviewparcelable.models.Prisoner;

/**
 * Created by Salmen on 26/03/2018.
 */

public class PrisonerAdapter extends ArrayAdapter<Prisoner> {

    Context context;
    int resource;

    public PrisonerAdapter(Context context, int resource, List<Prisoner> prisoners) {
        super(context, resource, prisoners);
        this.context=context;
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        PrisonerHolder holder = new PrisonerHolder();

        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resource, parent, false);

            holder.tvName = (TextView) view.findViewById(R.id.tv_prisoner_name);
            holder.tvMat = (TextView) view.findViewById(R.id.tv_prisoner_mat);
            holder.tvDuration = (TextView) view.findViewById(R.id.tv_prisoner_duration);
            holder.imgPrisoner = (ImageView) view.findViewById(R.id.img_prisoner);
            view.setTag(holder);
        }
        else
        {
            holder = (PrisonerHolder) view.getTag();
        }
        holder.tvName.setText(getItem(position).getName());
        holder.tvMat.setText(getItem(position).getMat());
        holder.tvDuration.setText(getItem(position).getDuration());
        holder.imgPrisoner.setBackgroundResource(getItem(position).getImageRes());

        return view;
    }

    class PrisonerHolder
    {
        TextView tvName;
        TextView tvMat;
        TextView tvDuration;
        ImageView imgPrisoner;
    }

}