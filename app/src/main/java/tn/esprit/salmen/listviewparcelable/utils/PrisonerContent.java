package tn.esprit.salmen.listviewparcelable.utils;

import java.util.ArrayList;

import tn.esprit.salmen.listviewparcelable.R;
import tn.esprit.salmen.listviewparcelable.models.Prisoner;

/**
 * Created by Salmen on 26/03/2018.
 */

public class PrisonerContent {

    public static String[] name = {"Pablo Escobar", "Alphonse Gabriel Capone", "Joaquín Guzmán", "Michael Gordon Peterson", "Thomas Edward Silverstein"};
    public static String[] mats = {"911", "912", "913", "914", "915"};
    public static String[] durations = {"50 years - 1980", "45 years - 1970", "40 years - 1960", "35 years - 1950", "30 years - 1940"};
    public static Integer[] pictures = {R.drawable.escobar, R.drawable.elcapone, R.drawable.elchapo, R.drawable.bronson, R.drawable.tommy};

    public static ArrayList<Prisoner> getPrisoners()
    {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            prisoners.add(new Prisoner(name[i], mats[i], durations[i], pictures[i]));
        }
        return prisoners;
    }

}
