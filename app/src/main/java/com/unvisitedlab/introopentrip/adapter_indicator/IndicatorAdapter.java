package com.unvisitedlab.introopentrip.adapter_indicator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unvisitedlab.introopentrip.R;

import java.util.List;

/**
 * Created by lifeuniverse on 10/09/17.
 */

public class IndicatorAdapter extends RecyclerView.Adapter<IndicatorViewHolder> {

    Context context;
    List<IndicatorModel> indicatorModels;

    public IndicatorAdapter(Context context, List<IndicatorModel> indicatorModels){
        this.context = context;
        this.indicatorModels = indicatorModels;
    }

    @Override
    public IndicatorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_indicator, parent, false);
        return new IndicatorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(IndicatorViewHolder holder, int position) {
        IndicatorModel model = indicatorModels.get(position);
        if(model.isSelected())
            holder.imageIndicator.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_circle_o_filled));
        else
            holder.imageIndicator.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_circle_o));
    }

    @Override
    public int getItemCount() {
        return indicatorModels.size();
    }
}
