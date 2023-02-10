package com.example.my_barapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class piedemo extends AppCompatActivity {


    PieChart pieChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedemo);

       pieChart=findViewById(R.id.piechart);

        ArrayList<PieEntry> records=new ArrayList<>();
        records.add(new PieEntry(32,"quarter1"));
        records.add(new PieEntry(14,"quarter2"));
        records.add(new PieEntry(34,"quarter3"));
        records.add(new PieEntry(38,"quarter4"));

        PieDataSet pieDataSet=new PieDataSet(records,"Pie chat records");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(22f);

        PieData pieData=new PieData(pieDataSet);


        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(true);
        pieChart.setCenterText("Quarterly Revenue");
        pieChart.animate();
    }
}