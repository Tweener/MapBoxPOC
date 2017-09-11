package com.tweener.mapbox;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

/**
 * @author Vivien Mahe
 */

public class MapBoxApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Mapbox.getInstance(this, "pk.eyJ1IjoidHdlZW5lciIsImEiOiJjajdnZzJycTYxMzRwMzZvMndicG9uMjQxIn0.UN-2ctrynBaRWSF7hASZRQ");
    }
}
