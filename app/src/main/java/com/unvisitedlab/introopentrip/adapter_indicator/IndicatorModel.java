package com.unvisitedlab.introopentrip.adapter_indicator;

/**
 * Created by lifeuniverse on 10/09/17.
 */

public class IndicatorModel {
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    boolean selected;

    public IndicatorModel() {
        this.selected = false;
    }

    public IndicatorModel(boolean selected) {
        this.selected = selected;
    }
}
