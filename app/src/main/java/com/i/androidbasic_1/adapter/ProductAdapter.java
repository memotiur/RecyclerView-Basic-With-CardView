package com.i.androidbasic_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i.androidbasic_1.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<String> nameList;

    public ProductAdapter(Context mContext, ArrayList<String> nameList) {
        this.mContext = mContext;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.name_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNameItem.setText(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameItem = itemView.findViewById(R.id.tvNameItem);
        }
    }
}
