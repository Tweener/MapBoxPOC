package com.tweener.mapbox.pulse;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.tweener.mapbox.R;

/**
 * @author Vivien Mahe
 */

public class PulseMarkerViewAdapter extends MapboxMap.MarkerViewAdapter<PulseMarkerView> {

    private LayoutInflater inflater;

    PulseMarkerViewAdapter(@NonNull Context context) {
        super(context);
        this.inflater = LayoutInflater.from(context);
    }

    @Nullable
    @Override
    public View getView(@NonNull PulseMarkerView marker, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.view_pulse_marker, parent, false);
            viewHolder.foregroundImageView = (ImageView) convertView.findViewById(R.id.foreground_imageView);
            viewHolder.backgroundImageView = (ImageView) convertView.findViewById(R.id.background_imageview);
            convertView.setTag(viewHolder);
        }
        return convertView;
    }

    private static class ViewHolder {
        ImageView foregroundImageView;
        ImageView backgroundImageView;
    }
}
