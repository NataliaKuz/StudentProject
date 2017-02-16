package com.rsgtrijks.student.patienthelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import static com.rsgtrijks.student.patienthelper.HeartattackActivity.CATAGORY;

/**
 * Created by 310193817 on 16/02/2017.
 */

public class DetailActivity extends AppCompatActivity {

    public static final String HEARTATACK_MEDICIJNEN = "Medicijnen";
    public static final String TIA_MEDICIJNEN = "Medicijnen";
    public static final String TIA_NAZORG = "Nazorg";
    public static final String TIA_RECOGNISE = "Hoe herken je een TIA?";

    public static final String HEARTATACK_NAZORG = "Nazorg";
    public static final String WATISHET = "Wat het is";
    public static final String ICD = "Wat is een ICD";

    public Map<String, String> dictionary = new HashMap<>();
    public Map<String, Integer> imageDictionary = new HashMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        dictionary.put(HEARTATACK_MEDICIJNEN, "This is Medicijnen body text");
        imageDictionary.put(HEARTATACK_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(HEARTATACK_NAZORG, "This is Nazorg body text");
        imageDictionary.put(HEARTATACK_NAZORG, R.drawable.clock_icon);

        dictionary.put(WATISHET, "This is Wat het is body text");
        imageDictionary.put(WATISHET, R.drawable.clock_icon);

        dictionary.put(ICD, "This is ICD body text");
        imageDictionary.put(ICD, R.drawable.clock_icon);

        dictionary.put(TIA_MEDICIJNEN, "This is Medicijnen TIA body text");
        imageDictionary.put(TIA_MEDICIJNEN, R.drawable.clock_icon);

        dictionary.put(TIA_NAZORG, "This is Nazorg TIA body text");
        imageDictionary.put(TIA_NAZORG, R.drawable.clock_icon);

        dictionary.put(TIA_RECOGNISE, "This is Herkennen TIA body text");
        imageDictionary.put(TIA_RECOGNISE, R.drawable.clock_icon);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        String category = getIntent().getExtras().getString(CATAGORY);

        TextView title = (TextView) findViewById(R.id.Title);

        title.setText(category);

        TextView body = (TextView) findViewById(R.id.Body);
        body.setText(dictionary.get(category));

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(imageDictionary.get(category));
    }
}

