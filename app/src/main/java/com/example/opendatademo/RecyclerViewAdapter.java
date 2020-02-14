package com.example.opendatademo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Wade on 2020/2/12.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<DataBean> list = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, List<DataBean> list){
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        String Pkid = UtilFactory.getArea_Pkid(list.get(position).getAnimal_area_pkid());
        Glide.with(mContext)
                .load(list.get(position).getAlbum_file())
                .error(R.mipmap.ic_launcher)
                .into(holder.mImgView);
        holder.mTextViewId.setText("流水編號 " + list.get(position).getAnimal_id());
        holder.mTextViewPkid.setText("所屬縣市 " + Pkid);
        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataBean bean = list.get(position);
                Intent intent = new Intent(mContext,ActDetail.class);
                intent.putExtra("DataBean",bean);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void updateData(List<DataBean> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout mRelativeLayout;
        CircleImageView mImgView;
        TextView mTextViewId;
        TextView mTextViewPkid;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mRelativeLayout = itemView.findViewById(R.id.mRelativeLayout);
            mImgView = itemView.findViewById(R.id.mImgView);
            mTextViewId = itemView.findViewById(R.id.mTextViewId);
            mTextViewPkid = itemView.findViewById(R.id.mTextViewPkid);
        }
    }
}
