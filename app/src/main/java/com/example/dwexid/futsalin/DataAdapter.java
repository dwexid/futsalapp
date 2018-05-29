package com.example.dwexid.futsalin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {


        private ArrayList<Data> dataList;

        public DataAdapter(ArrayList<Data> dataList) {
            this.dataList = dataList;
        }

        @Override
        public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.layout_item, parent, false);
            return new DataViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataViewHolder holder, int position) {
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtUmur.setText(dataList.get(position).getUmur());
        }

        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class DataViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama, txtUmur;

            public DataViewHolder(View itemView) {
                super(itemView);
                txtNama = (TextView) itemView.findViewById(R.id.person_name);
                txtUmur = (TextView) itemView.findViewById(R.id.person_age);
            }
        }
}
