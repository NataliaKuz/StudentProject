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

    public static final String TIA_MEDICIJNEN = "Hier vindt u informatie over de meest voorkomende medicijnen";
    public static final String TIA_ONTSTAAN = "Hoe ontstaat een TIA?";
    public static final String TIA_RECOGNISE = "Hoe herken je een TIA?";
    public static final String TIA_REVALIDATIE = "Hier leest u hoe de revalidatie na een TIA in zijn werk gaat";
    public static final String TIA_COMPENSATION = "Wat wordt er vergoed?";

    public static final String HEARTATACK_MEDICIJNEN = "Medicijnen";
    public static final String HEARTATACK_NAZORG = "Nazorg";
    public static final String HEARTATACK_WATISHET = "Wat het is";
    public static final String HEARTATACK_ICD = "Wat is een ICD";

    public Map<String, String> dictionary = new HashMap<>();
    public Map<String, Integer> imageDictionary = new HashMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        dictionary.put(HEARTATACK_MEDICIJNEN, "This is Medicijnen body text");
        imageDictionary.put(HEARTATACK_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(HEARTATACK_NAZORG, "This is Nazorg body text");
        imageDictionary.put(HEARTATACK_NAZORG, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_WATISHET, "This is Wat het is body text");
        imageDictionary.put(HEARTATACK_WATISHET, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_ICD, "This is ICD body text");
        imageDictionary.put(HEARTATACK_ICD, R.drawable.clock_icon);

        dictionary.put(TIA_MEDICIJNEN, "This is Medicijnen TIA body text");
        imageDictionary.put(TIA_MEDICIJNEN, R.drawable.clock_icon);

        dictionary.put(TIA_RECOGNISE, "Een TIA kan je herkennen aan:\n" +
                "1.\tEen scheve mond; één van de mondhoeken hangt naar beneden. \n" +
                "2.\tVerwarde spraak;  Iemand praat verward door woorden niet in de goede volgorde uit te spreken of kan de woorden zelf moeilijk uitspreken. Diegene kan soms ook niet begrijpen wat er tegen hem gezegd wordt. \n" +
                "3.\tLamme arm of been; Iemand heeft geen kracht meer in zijn arm of been of zijn arm of been raakt verlamd. Hierdoor kan diegene zijn arm of been niet of bijna niet gebruiken en hangt het slap langs het lichaam.\n" +
                "4.\tBlindheid aan één of beide ogen of dubbel zien; Iemand kan niet of niet goed meer zien.\n" +
                "Niet alle kenmerken hoeven op te treden maar is afhankelijk van de plaats waar de bloeddoorstroming tijdelijk geblokkeerd wordt. \n" +
                "Nadat u deze symptomen bij u zijn verschenen moet u altijd contact opnemen met uw huisarts. Deze gaat onderzoeken of er sprake is geweest van een TIA. Er is een grote kans dat u later nog een TIA krijgt.\n" +
                "U word onderzocht op een TIA-polikliniek of TIA-service in het ziekenhuis. Binnen 1 dag zal hier het belangrijkste aanvullende onderzoek plaats vinden door een neuroloog. Na dit onderzoek kan de neuroloog u vertellen of u een TIA heeft gehad. Vaak zal u bij de neuroloog ook een bloedonderzoek moeten doen en soms ook een hersenscan. Tijdens deze hersenscan worden de slagaders bekeken en de wordt oorzaak van uw TIA vastgesteld. \n");
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

