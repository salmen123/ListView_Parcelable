package tn.esprit.salmen.listviewparcelable.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Salmen on 26/03/2018.
 */

public class Prisoner  implements Parcelable {

    private String name;
    private String mat;
    private String duration;
    private int imageRes;

    public Prisoner(String name, String mat, String duration, int imageRes) {
        this.name = name;
        this.mat = mat;
        this.duration = duration;
        this.imageRes = imageRes;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "duration='" + duration + '\'' +
                ", name='" + name + '\'' +
                ", mat='" + mat + '\'' +
                ", imageRes=" + imageRes +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(mat);
        dest.writeString(duration);
        dest.writeInt(imageRes);
    }

    private Prisoner(Parcel in)
    {
        name = in.readString();
        mat = in.readString();
        duration = in.readString();
        imageRes = in.readInt();
    }

    public static final Parcelable.Creator<Prisoner> CREATOR = new Prisoner.Creator<Prisoner>()
    {

        @Override
        public Prisoner createFromParcel(Parcel source) {
            return new Prisoner(source);
        }

        @Override
        public Prisoner[] newArray(int size) {
            return new Prisoner[size];
        }
    };
}