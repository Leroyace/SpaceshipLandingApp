package com.example.leroytse.spaceshiplandingapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by LeroyTse on 16/09/16.
 */
public class LandingView extends View{


    //canvas
    private Canvas landCanvas;
    //canvas bitmap
    private Bitmap canvasBitmap;

    public LandingView(Context context) {
        super(context);
    }

    public LandingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        landCanvas = new Canvas(canvasBitmap);
    }
}
