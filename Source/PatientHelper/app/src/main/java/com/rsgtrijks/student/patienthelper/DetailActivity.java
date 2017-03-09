package com.rsgtrijks.student.patienthelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import static com.rsgtrijks.student.patienthelper.HeartattackActivity.CATAGORY;

/**
 * Created by 310193817 on 16/02/2017.
 */

public class DetailActivity extends AppCompatActivity {

    public static final String TIA_MEDICIJNEN = "Hier vindt u informatie over de meest voorkomende TIA medicijnen";
    public static final String TIA_ONTSTAAN = "Hier leest u hoe een TIA ontstaat";
    public static final String TIA_RECOGNISE = "Hier leest u hoe u een TIA herkent";
    public static final String TIA_REVALIDATIE = "Hier leest u hoe de revalidatie na een TIA in zijn werk gaat";
    public static final String TIA_COMPENSATION = "Hier leest u wat er wordt vergoed bij een TIA";

    public static final String HEARTATACK_MEDICIJNEN = "Hier vindt u informatie over de meest voorkomende hart medicijnen";
    public static final String HEARTATACK_REVALIDATION = "Hier leest u hoe de revalidatie na een hartaanval in zijn werk gaat";
    public static final String HEARTATACK_WATISHET = "Hier leest u wat een hartaanval precies is";
    public static final String HEARTATACK_ICD = "Hier kunt u alle informatie over de ICD lezen";
    public static final String HEARTATACK_COMPENSATIONE = "Hier leest u wat er wordt vergoed bij een hartaanval";

    public Map<String, String> dictionary = new HashMap<>();
    public Map<String, Integer> imageDictionary = new HashMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        dictionary.put(HEARTATACK_MEDICIJNEN, getString(R.string.HaMedicines));
        imageDictionary.put(HEARTATACK_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(HEARTATACK_REVALIDATION, getString(R.string.HaRevalidation));
        imageDictionary.put(HEARTATACK_REVALIDATION, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_WATISHET, getString(R.string.HaDescription));
        imageDictionary.put(HEARTATACK_WATISHET, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_ICD, getString(R.string.HaIcd));
        imageDictionary.put(HEARTATACK_ICD, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_COMPENSATIONE, getString(R.string.HaCompensation));
        imageDictionary.put(HEARTATACK_COMPENSATIONE, R.drawable.bed_icon);

        dictionary.put(TIA_MEDICIJNEN, getString(R.string.TiaMedicines));
        imageDictionary.put(TIA_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(TIA_RECOGNISE, getString(R.string.TiaRecognize));
        imageDictionary.put(TIA_RECOGNISE, R.drawable.clock_icon);

        dictionary.put(TIA_ONTSTAAN, getString(R.string.TiaCauses));
        imageDictionary.put(TIA_ONTSTAAN, R.drawable.bed_icon);

        dictionary.put(TIA_REVALIDATIE, getString(R.string.TiaRevalidation));
        imageDictionary.put(TIA_REVALIDATIE, R.drawable.bed_icon);

        dictionary.put(TIA_COMPENSATION, getString(R.string.TiaCompensation));
        imageDictionary.put(TIA_COMPENSATION, R.drawable.bed_icon);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        String category = getIntent().getExtras().getString(CATAGORY);

        TextView title = (TextView) findViewById(R.id.Title);
        title.setText(category);

        WebView body = (WebView) findViewById(R.id.Body);
        String htmlString = dictionary.get(category);
        body.loadDataWithBaseURL(null, htmlString, "text/html", "UTF-8", null);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(imageDictionary.get(category));
    }
}






