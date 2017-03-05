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
    public static final String TIA_ONTSTAAN = "Hier leest u hoe een TIA ontstaat";
    public static final String TIA_RECOGNISE = "Hier leest u hoe u een TIA herkent";
    public static final String TIA_REVALIDATIE = "Hier leest u hoe de revalidatie na een TIA in zijn werk gaat";
    public static final String TIA_COMPENSATION = "Hier leest u wat er wordt vergoed";

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

        dictionary.put(HEARTATACK_WATISHET, "Er zijn twee soorten TIA’s.\n" +
        imageDictionary.put(HEARTATACK_WATISHET, R.drawable.clock_icon));

        dictionary.put(HEARTATACK_ICD, "This is ICD body text");
        imageDictionary.put(HEARTATACK_ICD, R.drawable.clock_icon);

        dictionary.put(TIA_MEDICIJNEN, "Na een TIA worden er verschillende soorten medicijnen voorgeschreven. Een paar medicijnen staan hier onder en hoe vaak je ze moet innemen. \n" +
                "De hoeveelheid een het aantal keer innemen per dag verschilt per persoon en hangt af van je BMI, nierfunctie en lichamelijke-inactiviteit.  \n" +
                "\n" +
                "Acetylsalicylzuur\n" +
                "Dit medicijn zorgt ervoor dat het bloed minder samenklontert. Hierdoor heeft u minder kans op een trombose (TIA). U kunt sneller inwendige bloedingen (bloedingen in uw lichaam, u ziet dus geen bloed op uw huid) en blauwe plekken krijgen. Krijgt u last van bloed in uw plas, neem dan gelijk contact op met de arts.\n" +
                "\n" +
                "Dipridamol\n" +
                "Dit medicijn zorgt ervoor dat het bloed minder samenklontert. Hierdoor heeft u minder kans op een trombose (TIA). In het begin kunt u last krijgen van misselijkheid, kotsen, diarree, hoofdpijn en duizeligheid. Als dit niet na enkele dagen weg is moet u contact opnemen met uw arts.\n" +
               "\n" +
                "Simvastatine\n" +
                "Dit medicijn verlaagt het aantal bloedvetten zoals cholesterol en vermindert aderverkalking. In het begin kunt u lat hebben van maagdarmklachten, hoofdpijn, duizeligheid, vermoeidheid of slapeloosheid. Als dit niet na enkele dagen weg is moet u contact opnemen met uw arts.\n" +
                "Drink geen grapefruitsap als u dit medicijn gebruikt. Hierdoor worden de bijwerkingen erger. Dit middel mag u niet gebruiken als u zwanger bent.\n" +
                "\n" +
                "Fenprocoumon\n" +
                "Dit medicijn zorgt ervoor dat het bloed minder samenklontert. Hierdoor heeft u minder kans op een trombose (TIA). De trombosedienst controleert uw bloedstolling. Op basis van de uitkomsten van de test krijgt u soms wijzingen in de dosering. Als u dit medicijn aan het eind van de middag of begin van de avond slikt kunt u de eventuele wijzigingen van de dosering dezelfde dag nog opvolgen. U kunt sneller inwendige bloedingen (bloedingen in uw lichaam, u ziet dus geen bloed op uw huid) en blauwe plekken krijgen. Krijgt u last van bloed in uw plas, neem dan gelijk contact op met de arts. Laat uw apotheker controleren of u dit medicijn veilig kunt gebruiken met uw andere medicijnen. Ook de medicijnen die u zonder recept heeft gekocht. Dit medicijn kunt u niet altijd innemen in combinatie met veel andere medicijnen.\n" +
                "\n" +
                "Digoxine\n" +
                "Dit medicijn verbetert de pompkracht van het hart en zorgt voor een regelmatige en rustige hartslag\n" +
                "Als u bijwerkingen heeft bij een medicijn, bijvoorbeeld hoofdpijn, moeilijk plassen of haaruitval, dan moet u gelijk contact opnemen met uw arts.\n" +
                "Na een TIA kunt u beter geen medicijnen met het hormoon oestrogeen gebruiken bijvoorbeeld de anticonceptiepil of medicijnen voor de overgang. Dit moet u altijd in overleg doen met uw arts.\n");
        imageDictionary.put(TIA_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(TIA_RECOGNISE, "Een TIA kan je herkennen aan:\n" +
                "1.\tEen scheve mond; één van de mondhoeken hangt naar beneden. \n" +
                "2.\tVerwarde spraak;  Iemand praat verward door woorden niet in de goede volgorde uit te spreken of kan de woorden zelf moeilijk uitspreken. Diegene kan soms ook niet begrijpen wat er tegen hem gezegd wordt. \n" +
                "3.\tLamme arm of been; Iemand heeft geen kracht meer in zijn arm of been of zijn arm of been raakt verlamd. Hierdoor kan diegene zijn arm of been niet of bijna niet gebruiken en hangt het slap langs het lichaam.\n" +
                "4.\tBlindheid aan één of beide ogen of dubbel zien; Iemand kan niet of niet goed meer zien.\n" +
                "\n" +
                "Niet alle kenmerken hoeven op te treden maar is afhankelijk van de plaats waar de bloeddoorstroming tijdelijk geblokkeerd wordt. \n" +
                "\n" +
                "Nadat u deze symptomen bij u zijn verschenen moet u altijd contact opnemen met uw huisarts. Deze gaat onderzoeken of er sprake is geweest van een TIA. Er is een grote kans dat u later nog een TIA krijgt.\n" +
                "U word onderzocht op een TIA-polikliniek of TIA-service in het ziekenhuis. Binnen 1 dag zal hier het belangrijkste aanvullende onderzoek plaats vinden\n" +
                "door een neuroloog. Na dit onderzoek kan de neuroloog u vertellen of u een TIA heeft gehad. Vaak zal u bij de neuroloog ook een bloedonderzoek moeten\n" +
                "doen en soms ook een hersenscan. Tijdens deze hersenscan worden de slagaders bekeken en de wordt oorzaak van uw TIA vastgesteld. \n");
        imageDictionary.put(TIA_RECOGNISE, R.drawable.clock_icon);

        dictionary.put(TIA_ONTSTAAN, "Er zijn twee soorten TIA’s.\n" +
                "\n" +
                "1.Embolie\n" +
                "De hersenen krijgen zuurstof via twee slagaders. De binnenwand van de slagader kan beschadigd zijn; bloedplaatjes en cholesterol zorgen voor klonten in het bloed, dit heet plaque. Dit blijft aan de wand van de slagader zitten.\n" +
                "Als een deel van dit plaque loslaat en met het bloed mee stroomt komt het uiteindelijk in de hersenen terecht en blokkeert de klont de bloedvaten in de hersenen. Het gebied waar het bloedvat naar toe stroomt krijgt geen bloed en dus ook geen zuurstof meer. Doordat er geen zuurstof meer komt kan dat deel van de hersenen niet meer goed werken. \n" +
                "\n" +
                "2.Trombose\n" +
                "De hersenen krijgen zuurstof via twee slagaders. De binnenwand van de slagader kan beschadigd zijn; bloedplaatjes en cholesterol zorgen voor klonten in het bloed, dit heet plaque. Dit blijft aan de wand van de slagader zitten.\n" +
                "Als een ader dicht komt te zitten door dit plaque kan er geen bloed meer door de ader. Er komt geen bloed en dus geen zuurstof meer in de hersenen. Doordat er geen zuurstof meer komt kan dat deel van de hersenen niet goed meer werken.\n");
        imageDictionary.put(TIA_ONTSTAAN, R.drawable.clock_icon);

        dictionary.put(TIA_REVALIDATIE, "Uw behandeling bestaat vaak uit medicijnen en controles. Maar u moet ook zelf een aantal dingen in uw levensstijl veranderen. Soms is er ook een operatie nodig. \n" +
                "\n" +
                "Medicijnen\n" +
                "Vaak worden na een TIA medicijnen die het samenklonteren van het bloed tegengaan voorgeschreven. Ook worden er vaak medicijnen voorgeschreven die de bloeddruk en het cholesterolgehalte verlagen. Onder het kopje ‘medicijnen’ kunt u meer informatie vinden over medicijnen.\n" +
                "\n" +
                "Operatie\n" +
                "Er is vaak geen sprake van een operatie. Een operatie wordt alleen uitgevoerd als het bloedvat bijna helemaal is afgesloten waardoor er bijna geen bloed meer doorheen kan stromen. Tijdens de operatie wordt de beschadigde plek schoongekrabd of vervangen door een kunststof buisje zodat het bloed weer goed door de ader kan stromen.\n" +
                "\n" +
                "Zelf zijn er een aantal dingen waar u op kunt letten om de kans op een nieuwe TIA te voorkomen. \n" +
                "1.\tStop met roken \n" +
                "2.\tBeweeg voldoende\n" +
                "3.\tVerminder uw alcoholconsumptie (maximaal 1 glas per dag)\n" +
                "4.\tEet gezond en gevarieerd (veel verse groenten en fruit)\n" +
                "5.\tNeem dagelijks uw medicijnen in\n" +
                "6.\tProbeer bij overgewicht af te vallen\n" +
                "7.\tLeer met stress omgaan\n" +
                "\n" +
                "De gemiddelde revalidatietijd is een half jaar. Deze revalidatie start in het ziekenhuis. Hierna zijn er drie plekken waar u kunt revalideren:\n" +
                "1.\tThuis\n" +
                "2.\tIn het verpleeghuis\n" +
                "3.\tIn het revalidatiecentrum\n" +
                "\n" +
                "De meeste mensen gaan na de ziekenhuisopname thuis revalideren. Vanuit hier is het mogelijk dat u naar de dagopvang in het revalidatiecentrum gaat of thuis verpleegd wordt. Toch zal de grootste zorg vaak door een naaste op zich worden genomen. \n" +
                "Er zijn verschillende professionals die helpen bij de revalidatie. Hieronde staan de drie meest voorkomende.\n" +
                "1.\tDe fysiotherapeut en ergotherapeut : Zij helpen u met de revalidatie van bewegingsfuncties en alledaagse handelingen\n" +
                "2.\tDe logopedist: Hij helpt u bij spraak-, taal-, en slikproblemen\n" +
                "3.\tDe psycholoog: Hij helpt u bij geheugen-, aandachts-, en gedragsstoornissen\n" +
                "\n" +
                "Hoe gaat de revalidatie bij uw arts in zijn werk?\n" +
                "1.\tU bespreekt samen met uw arts wat u kunt doen om uw risico op een nieuwe TIA te verminderen en u maakt een plan\n" +
                "2.\tU krijgt medicijnen\n" +
                "3.\tU heeft controles waar u bespreekt en hoe het met u gaat. Uw arts controleert of de medicijnen goed werken en naar eventuele bijwerkingen\n" +
                "\n" +
                "Er zijn verschillende centra die hulp bieden bij het revalideren. Deze zijn bijna altijd geheel kosteloos. Het beste kunt u een centrum opzoeken bij u in de buurt.\n" +
                "\n" +
                "Mag ik autorijden na een TIA?\n" +
                "De eerste twee weken na uw TIA mag u niet autorijden. Na deze 2 weken kijkt een neuroloog of een revalidatie-arts of u schade heeft opgelopen waardoor u niet meer zou mogen rijden. Als dit niet zo is mag u weer autorijden, maar alleen als u de behandeling van de neuroloog blijft volgen om een volgende TIA te voorkomen.\n");
        imageDictionary.put(TIA_REVALIDATIE, R.drawable.bed_icon);

        dictionary.put(TIA_COMPENSATION, "De medicijnen die u voorgeschreven krijgt worden meestal vergoed door de basisverzekering. Deze medicijnen kunt u vinden op de lijst van ‘geneesmiddelen vergoedingssysteem’. Wel moet u een eigen bijdrage betalen.\n" +
                "Ook moet er vaak een bloedonderzoek gedaan worden, deze wordt niet door de basisverzekering gedekt. Hiervoor is er een aanvullende verzekering nodig. Met een aanvullende verzekering hoeft u geen eigen bijdrage meer te betalen.\n");
        imageDictionary.put(TIA_COMPENSATION, R.drawable.bed_icon);



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

