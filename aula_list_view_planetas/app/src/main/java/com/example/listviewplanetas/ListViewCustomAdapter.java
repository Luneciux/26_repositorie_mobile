package com.example.listviewplanetas;

import static androidx.recyclerview.widget.RecyclerView.*;
import static com.example.listviewplanetas.R.layout.activity_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ListViewCustomAdapter extends BaseAdapter {

    Context context;
    String[] items;

    ListViewCustomAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
            holder = new ViewHolder();
            holder.iv_item = convertView.findViewById(R.id.imageView2);
            holder.tv_item = convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_item.setText(items[position]);
        holder.iv_item.setBackgroundResource(R.drawable.ic_launcher_background);

        return convertView;
    }

    static class ViewHolder{
        TextView tv_item;
        ImageView iv_item;
    }
}
