package com.unvisitedlab.introopentrip.adapter_indicator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.unvisitedlab.introopentrip.R;

/**
 * Created by lifeuniverse on 10/09/17.
 */

public class IndicatorViewHolder extends RecyclerView.ViewHolder {

    ImageView imageIndicator;

    public IndicatorViewHolder(View itemView) {
        super(itemView);
        imageIndicator = (ImageView) itemView.findViewById(R.id.image_indicator);
    }
}
