package com.kashawn.splash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

 public    int [] images={

            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3
    };
 public String [] headings={

        "My Uncle",
         "Me",
         "My Brother"

 };

    public String [] myText={

            "My Uncle Name Is Abdul Ghafoor",
            "My Name Is Mohammad Waris Khan",
            "My Brother Name Is Mohammad Aamir Khan"

    };
 @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView sliderImgView=(ImageView)view.findViewById(R.id.img);
        TextView head=(TextView)view.findViewById(R.id.heading);
        TextView text=(TextView)view.findViewById(R.id.text);

        sliderImgView.setImageResource(images[position]);
        head.setText(headings[position]);
        text.setText(myText[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);

    }
}
