package com.example.my_barapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.DropBoxManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Map;

import kotlin.jvm.internal.markers.KMutableMap;

public class linedemo extends AppCompatActivity {



    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linedemo);



        lineChart=findViewById(R.id.linechart);

        ArrayList<Entry> information=new ArrayList<>();

        information.add(new Entry(10,80));
        information.add(new Entry(50,90));
        information.add(new Entry(100,100));
        information.add(new Entry(150,80));
        information.add(new Entry(200,120));


        LineDataSet lineDataSet=new LineDataSet(information,"Information");
        lineDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setValueTextSize(22f);

        LineData lineData=new LineData(lineDataSet);

        lineChart.setData(lineData);
        lineChart.animateY(2000);
    }
}