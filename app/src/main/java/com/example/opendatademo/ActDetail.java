package com.example.opendatademo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Wade on 2020/2/12.
 */
public class ActDetail extends AppCompatActivity {
    private CircleImageView mImgView;
    private TextView mTextViewPlace;
    private TextView mTextViewKind;
    private TextView mTextViewSex;
    private TextView mTextViewBody;
    private TextView mTextViewColour;
    private TextView mTextViewAge;
    private DataBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        init();
        initView();
    }

    private void init(){
        mImgView = findViewById(R.id.mImgView);
        mTextViewPlace = findViewById(R.id.mTextViewPlace);
        mTextViewKind = findViewById(R.id.mTextViewKind);
        mTextViewSex = findViewById(R.id.mTextViewSex);
        mTextViewBody = findViewById(R.id.mTextViewBody);
        mTextViewColour = findViewById(R.id.mTextViewColour);
        mTextViewAge = findViewById(R.id.mTextViewAge);

        mImgView.setOnClickListener(mImgView_click);

        Intent intent = getIntent();
        bean = intent.getParcelableExtra("DataBean");
    }

    private void initView(){
        Glide.with(this)
                .load(bean.getAlbum_file())
                .error(R.mipmap.ic_launcher)
                .into(mImgView);
        mTextViewPlace.setText("動物的實際所在地 : " + bean.getAnimal_place());
        mTextViewKind.setText("動物的類型 : " + bean.getAnimal_kind());
        mTextViewSex.setText("動物性別 : " + bean.getAnimal_sex());
        mTextViewBody.setText("動物體型 : " + bean.getAnimal_bodytype());
        mTextViewColour.setText("動物毛色 : " + bean.getAnimal_colour());
        mTextViewAge.setText("動物年紀 : " + bean.getAnimal_age());
    }

    private View.OnClickListener mImgView_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showDialog(bean);
        }
    };

    private void showDialog(DataBean bean){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_img);

        ImageView mImgView = dialog.findViewById(R.id.mImgView);

        Glide.with(this)
                .load(bean.getAlbum_file())
                .error(R.mipmap.ic_launcher)
                .into(mImgView);

        dialog.show();
    }
}
