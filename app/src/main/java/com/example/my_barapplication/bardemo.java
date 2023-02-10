package com.example.my_barapplication;

import static com.github.mikephil.charting.utils.ColorTemplate.MATERIAL_COLORS;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Collections;

public class bardemo extends AppCompatActivity {

    BarChart bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bardemo);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        bar=(BarChart) findViewById(R.id.bar_chart);


        ArrayList<BarEntry> information=new ArrayList<>();
        information.add(new BarEntry(2010,1000));
        information.add(new BarEntry(2011,1200));
        information.add(new BarEntry(2012,1400));
        information.add(new BarEntry(2013,1600));
        information.add(new BarEntry(2014,1100));
        information.add(new BarEntry(2015,1300));
        information.add(new BarEntry(2016,2100));
        information.add(new BarEntry(2017,1500));

        BarDataSet barDataSet=new BarDataSet(information,"Report");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(20f);


        BarData barData=new BarData(barDataSet);


        bar.setFitBars(true);
        bar.setData(barData);
        bar.getDescription().setText("Bar Report Demo");
        bar.animateY(2000);
    }
}