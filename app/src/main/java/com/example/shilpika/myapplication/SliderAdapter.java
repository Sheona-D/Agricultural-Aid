package com.example.shilpika.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] slideImages = {
            R.drawable.icon_camera,
            R.drawable.icon_load,
            R.drawable.icon_solution,
            R.drawable.icon_options
    };

    public String[] slideHeadings ={
            "Take a Picture",
            "Get Results",
            "Choose a Solution",
            "Various Agro Options"
    };

    public String[] slideDescriptions ={
            "Open your camera and capture a clear photo of the affected leaf.",
            "After capturing your desired photo, click on upload to submit the image to get the name of the disease and various other information.",
            "Choose the best solution to combat the disease for your crop from the various solutions provided after image analysis.",
            "Choose other agricultural aid options like fertilizer calculator for your crop or weather predictor to understand weather trends in your region for upto 7 days."
    };


    @Override
    public int getCount() {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (ConstraintLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.iv_image_icon);
        TextView slideHeading = (TextView) view.findViewById(R.id.tv_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.tv_description);

        slideImageView.setImageResource(slideImages[position]);
        slideHeading.setText(slideHeadings[position]);
        slideDescription.setText(slideDescriptions[position]);

        container.addView(view);

        return view;

    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }


}
