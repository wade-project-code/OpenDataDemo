package com.example.opendatademo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Wade on 2020/2/12.
 */
public class DataBean implements Parcelable {
    private int animal_id;
    private String animal_subid;
    private int animal_area_pkid;
    private int animal_shelter_pkid;
    private String animal_place;
    private String animal_kind;
    private String animal_sex;
    private String animal_bodytype;
    private String animal_colour;
    private String animal_age;
    private String animal_sterilization;
    private String animal_bacterin;
    private String animal_foundplace;
    private String animal_title;
    private String animal_status;
    private String animal_remark;
    private String animal_caption;
    private String animal_opendate;
    private String animal_closeddate;
    private String animal_update;
    private String animal_createtime;
    private String shelter_name;
    private String album_file;
    private String album_update;
    private String cDate;
    private String shelter_address;
    private String shelter_tel;

    protected DataBean(Parcel in) {
        animal_id = in.readInt();
        animal_subid = in.readString();
        animal_area_pkid = in.readInt();
        animal_shelter_pkid = in.readInt();
        animal_place = in.readString();
        animal_kind = in.readString();
        animal_sex = in.readString();
        animal_bodytype = in.readString();
        animal_colour = in.readString();
        animal_age = in.readString();
        animal_sterilization = in.readString();
        animal_bacterin = in.readString();
        animal_foundplace = in.readString();
        animal_title = in.readString();
        animal_status = in.readString();
        animal_remark = in.readString();
        animal_caption = in.readString();
        animal_opendate = in.readString();
        animal_closeddate = in.readString();
        animal_update = in.readString();
        animal_createtime = in.readString();
        shelter_name = in.readString();
        album_file = in.readString();
        album_update = in.readString();
        cDate = in.readString();
        shelter_address = in.readString();
        shelter_tel = in.readString();
    }

    public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
        @Override
        public DataBean createFromParcel(Parcel in) {
            return new DataBean(in);
        }

        @Override
        public DataBean[] newArray(int size) {
            return new DataBean[size];
        }
    };

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimal_subid() {
        return animal_subid;
    }

    public void setAnimal_subid(String animal_subid) {
        this.animal_subid = animal_subid;
    }

    public int getAnimal_area_pkid() {
        return animal_area_pkid;
    }

    public void setAnimal_area_pkid(int animal_area_pkid) {
        this.animal_area_pkid = animal_area_pkid;
    }

    public int getAnimal_shelter_pkid() {
        return animal_shelter_pkid;
    }

    public void setAnimal_shelter_pkid(int animal_shelter_pkid) {
        this.animal_shelter_pkid = animal_shelter_pkid;
    }

    public String getAnimal_place() {
        return animal_place;
    }

    public void setAnimal_place(String animal_place) {
        this.animal_place = animal_place;
    }

    public String getAnimal_kind() {
        return animal_kind;
    }

    public void setAnimal_kind(String animal_kind) {
        this.animal_kind = animal_kind;
    }

    public String getAnimal_sex() {
        return animal_sex;
    }

    public void setAnimal_sex(String animal_sex) {
        this.animal_sex = animal_sex;
    }

    public String getAnimal_bodytype() {
        return animal_bodytype;
    }

    public void setAnimal_bodytype(String animal_bodytype) {
        this.animal_bodytype = animal_bodytype;
    }

    public String getAnimal_colour() {
        return animal_colour;
    }

    public void setAnimal_colour(String animal_colour) {
        this.animal_colour = animal_colour;
    }

    public String getAnimal_age() {
        return animal_age;
    }

    public void setAnimal_age(String animal_age) {
        this.animal_age = animal_age;
    }

    public String getAnimal_sterilization() {
        return animal_sterilization;
    }

    public void setAnimal_sterilization(String animal_sterilization) {
        this.animal_sterilization = animal_sterilization;
    }

    public String getAnimal_bacterin() {
        return animal_bacterin;
    }

    public void setAnimal_bacterin(String animal_bacterin) {
        this.animal_bacterin = animal_bacterin;
    }

    public String getAnimal_foundplace() {
        return animal_foundplace;
    }

    public void setAnimal_foundplace(String animal_foundplace) {
        this.animal_foundplace = animal_foundplace;
    }

    public String getAnimal_title() {
        return animal_title;
    }

    public void setAnimal_title(String animal_title) {
        this.animal_title = animal_title;
    }

    public String getAnimal_status() {
        return animal_status;
    }

    public void setAnimal_status(String animal_status) {
        this.animal_status = animal_status;
    }

    public String getAnimal_remark() {
        return animal_remark;
    }

    public void setAnimal_remark(String animal_remark) {
        this.animal_remark = animal_remark;
    }

    public String getAnimal_caption() {
        return animal_caption;
    }

    public void setAnimal_caption(String animal_caption) {
        this.animal_caption = animal_caption;
    }

    public String getAnimal_opendate() {
        return animal_opendate;
    }

    public void setAnimal_opendate(String animal_opendate) {
        this.animal_opendate = animal_opendate;
    }

    public String getAnimal_closeddate() {
        return animal_closeddate;
    }

    public void setAnimal_closeddate(String animal_closeddate) {
        this.animal_closeddate = animal_closeddate;
    }

    public String getAnimal_update() {
        return animal_update;
    }

    public void setAnimal_update(String animal_update) {
        this.animal_update = animal_update;
    }

    public String getAnimal_createtime() {
        return animal_createtime;
    }

    public void setAnimal_createtime(String animal_createtime) {
        this.animal_createtime = animal_createtime;
    }

    public String getShelter_name() {
        return shelter_name;
    }

    public void setShelter_name(String shelter_name) {
        this.shelter_name = shelter_name;
    }

    public String getAlbum_file() {
        return album_file;
    }

    public void setAlbum_file(String album_file) {
        this.album_file = album_file;
    }

    public String getAlbum_update() {
        return album_update;
    }

    public void setAlbum_update(String album_update) {
        this.album_update = album_update;
    }

    public String getCDate() {
        return cDate;
    }

    public void setCDate(String cDate) {
        this.cDate = cDate;
    }

    public String getShelter_address() {
        return shelter_address;
    }

    public void setShelter_address(String shelter_address) {
        this.shelter_address = shelter_address;
    }

    public String getShelter_tel() {
        return shelter_tel;
    }

    public void setShelter_tel(String shelter_tel) {
        this.shelter_tel = shelter_tel;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(animal_id);
        parcel.writeString(animal_subid);
        parcel.writeInt(animal_area_pkid);
        parcel.writeInt(animal_shelter_pkid);
        parcel.writeString(animal_place);
        parcel.writeString(animal_kind);
        parcel.writeString(animal_sex);
        parcel.writeString(animal_bodytype);
        parcel.writeString(animal_colour);
        parcel.writeString(animal_age);
        parcel.writeString(animal_sterilization);
        parcel.writeString(animal_bacterin);
        parcel.writeString(animal_foundplace);
        parcel.writeString(animal_title);
        parcel.writeString(animal_status);
        parcel.writeString(animal_remark);
        parcel.writeString(animal_caption);
        parcel.writeString(animal_opendate);
        parcel.writeString(animal_closeddate);
        parcel.writeString(animal_update);
        parcel.writeString(animal_createtime);
        parcel.writeString(shelter_name);
        parcel.writeString(album_file);
        parcel.writeString(album_update);
        parcel.writeString(cDate);
        parcel.writeString(shelter_address);
        parcel.writeString(shelter_tel);
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "animal_id=" + animal_id +
                ", animal_subid='" + animal_subid + '\'' +
                ", animal_area_pkid=" + animal_area_pkid +
                ", animal_shelter_pkid=" + animal_shelter_pkid +
                ", animal_place='" + animal_place + '\'' +
                ", animal_kind='" + animal_kind + '\'' +
                ", animal_sex='" + animal_sex + '\'' +
                ", animal_bodytype='" + animal_bodytype + '\'' +
                ", animal_colour='" + animal_colour + '\'' +
                ", animal_age='" + animal_age + '\'' +
                ", animal_sterilization='" + animal_sterilization + '\'' +
                ", animal_bacterin='" + animal_bacterin + '\'' +
                ", animal_foundplace='" + animal_foundplace + '\'' +
                ", animal_title='" + animal_title + '\'' +
                ", animal_status='" + animal_status + '\'' +
                ", animal_remark='" + animal_remark + '\'' +
                ", animal_caption='" + animal_caption + '\'' +
                ", animal_opendate='" + animal_opendate + '\'' +
                ", animal_closeddate='" + animal_closeddate + '\'' +
                ", animal_update='" + animal_update + '\'' +
                ", animal_createtime='" + animal_createtime + '\'' +
                ", shelter_name='" + shelter_name + '\'' +
                ", album_file='" + album_file + '\'' +
                ", album_update='" + album_update + '\'' +
                ", cDate='" + cDate + '\'' +
                ", shelter_address='" + shelter_address + '\'' +
                ", shelter_tel='" + shelter_tel + '\'' +
                '}';
    }
}
