package com.example.rbender.l16platformreference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rbender on 8/31/2016.
 */
public class AircraftSpinnerAdapter extends BaseAdapter {

    private List<AircraftCapability> aircraftCapes;

    public AircraftSpinnerAdapter(List<AircraftCapability> aircraftCapes) {
        this.aircraftCapes = aircraftCapes;
    }

    @Override
    public int getCount() {
        return aircraftCapes.size();
    }

    @Override
    public Object getItem(int i) {
        return aircraftCapes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.aircraft_capability_spinner_item,viewGroup, false);
        TextView nameTextView = (TextView)v.findViewById(R.id.aircraftCapabilityNameTextView);
        nameTextView.setText(aircraftCapes.get(i).getAircraftName());

        return v;
    }
}
