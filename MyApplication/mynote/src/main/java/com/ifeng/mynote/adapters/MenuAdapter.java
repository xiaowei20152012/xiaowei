package com.ifeng.mynote.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.freedom.xiaowei.recyclerview.YfListAdapter;
import com.freedom.xiaowei.recyclerview.YfSimpleViewHolder;
import com.ifeng.mynote.R;

import java.util.ArrayList;

/**
 * Created by liwei5 on 2015/12/16.
 */
public class MenuAdapter extends YfListAdapter<String> {
    public MenuAdapter(ArrayList<String> data) {
        super(data);
    }

    @Override
    public RecyclerView.ViewHolder onCreateDataViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public RecyclerView.ViewHolder onCreateEmptyViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_empty_material, parent, false);
        return new YfSimpleViewHolder(view);
    }

    @Override
    public void onBindDataViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).mText.setText(mData.get(position));
        holder.itemView.setTag(mData.get(position));
    }

    private static final class ViewHolder extends RecyclerView.ViewHolder {

        TextView mText;

        public ViewHolder(final View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.btn);
        }
    }
}
