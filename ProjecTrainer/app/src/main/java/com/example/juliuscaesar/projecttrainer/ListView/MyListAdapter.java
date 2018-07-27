package com.example.juliuscaesar.projecttrainer.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.juliuscaesar.projecttrainer.R;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tv_time,tv_content,tv_title;
}
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null){
            view = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.lst_iv_1);
            holder.tv_title = view.findViewById(R.id.lst_tv_title);
            holder.tv_time = view.findViewById(R.id.lst_tv_time);
            holder.tv_content = view.findViewById(R.id.lst_tv_content);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv_title.setText("这是标题");
        holder.tv_content.setText("这是内容");
        holder.tv_time.setText("2018-7-26");
        Glide.with(mContext).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(holder.imageView);
        return view;
    }
}
