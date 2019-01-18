package com.androidabcd.ashokslsk.letsventurescreening;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.androidabcd.ashokslsk.letsventurescreening.model.Startup;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> implements Filterable {
    private ArrayList<Startup> mArrayList;
    private ArrayList<Startup> mFilteredList;

    public RecyclerviewAdapter(ArrayList<Startup> arrayList) {
        mArrayList = arrayList;
        mFilteredList = arrayList;
    }

    @Override
    public RecyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.each_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(mFilteredList.get(i).getName());
        viewHolder.tv_summary.setText(mFilteredList.get(i).getName());
        viewHolder.tv_api_level.setText(mFilteredList.get(i).getMarket());
    }

    @Override
    public int getItemCount() {
        return mFilteredList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    mFilteredList = mArrayList;
                } else {
                    ArrayList<Startup> filteredList = new ArrayList<>();
                    for (Startup startup : mArrayList) {
                        if (startup.getName().toLowerCase().contains(charString) || startup.getSummary().toLowerCase().contains(charString) || startup.getLocation().toLowerCase().contains(charString)) {
                            filteredList.add(startup);
                        }
                    }
                    mFilteredList = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredList = (ArrayList<Startup>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_summary, tv_api_level;
        public ViewHolder(View view) {
            super(view);
            tv_name = (TextView) view.findViewById(R.id.startupName);
            tv_summary = (TextView) view.findViewById(R.id.product_summary);
            tv_api_level = (TextView) view.findViewById(R.id.location);
        }
    }
}