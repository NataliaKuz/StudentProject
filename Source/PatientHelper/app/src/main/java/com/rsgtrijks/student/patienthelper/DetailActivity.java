package com.rsgtrijks.student.patienthelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
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
    public static final String HEARTATACK_REVALIDATION= "Hier leest u hoe de revalidatie na een hartaanval in zijn werk gaat";
    public static final String HEARTATACK_WATISHET = "Hier leest u wat een hartaanval precies is";
    public static final String HEARTATACK_ICD = "Hier kunt u alle informatie over de ICD lezen";
    public static final String HEARTATACK_COMPENSATIONE = "Hier leest u wat er wordt vergoed bij een hartaanval";

    public Map<String, CharSequence> dictionary = new HashMap<>();
    public Map<String, Integer> imageDictionary = new HashMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        // dictionary.put(HEARTATACK_MEDICIJNEN, getText(R.string.HAMedicines));
        dictionary.put(HEARTATACK_MEDICIJNEN, getText(R.string.HAMedicines));
        imageDictionary.put(HEARTATACK_MEDICIJNEN, R.drawable.bed_icon);

        dictionary.put(HEARTATACK_REVALIDATION, "Hartrevalidatie is bedoeld om er lichamelijk en psychisch weer bovenop te komen. Je verkleint de kans op een volgende hartaanval door de levensstijl aan te passen: niet roken, weinig stress, gezonde voeding, een gezond gewicht en dagelijks 30 minuten matig/intensief bewegen.\n" +
                "Hartrevalidatie is voor iedereen die recent behandeld is voor het hart en het helpt bij het herstel.\n" +
                "Hartrevalidatie start na behandeling in het ziekenhuis. Het vindt plaats in het ziekenhuis of in het revalidatiecentrum. Het hele traject duurt 6 weken tot 3 maanden.\n" +
                "Voor deelname aan hartrevalidatie is een verwijzing nodig van de cardioloog.\n" +
                "\n" +
                "Inhoud programma\n" +
                "Het totale programma is heel breed en bestaat uit informatie, oefeningen en leren omgaan met de aandoening. Samen met een cardioloog, verpleegkundige, fysiotherapeut, diëtist, psycholoog en/of maatschappelijk werkende wordt gewerkt aan het herstel.\n" +
                "Deelnemers volgen alleen onderdelen die voor hen zinvol zijn. In een intakegesprek komen de persoonlijke doelen aan bod.\n" +
                "\n" +
                "Gezonde levensstijl\n" +
                "Door gezond te leven kunt u de kans op klachten of op een nieuwe hartaanval verkleinen. Bovendien voelt u zich waarschijnlijk prettiger wanneer u gezond leeft.\n" +
                "•\tStop met roken. Roken is de grootste veroorzaker van hart- en vaatziekten. Hoe eerder u stopt hoe beter. Als u stopt heeft u al direct minder kans om opnieuw een hartaanval te krijgen.\n" +
                "•\tBlijf zorgen voor voldoende lichaamsbeweging, zonder te forceren. Bouw de activiteiten geleidelijk op en houd rekening met uw lichamelijke mogelijkheden. Tijdens de inspanning moet u nog in staat zijn te praten. \n" +
                "•\tAls u te zwaar bent, probeer dan af te vallen. Overgewicht vormt een extra belasting voor uw hart.\n" +
                "•\tEet gezond. Eet veel verse groenten en fruit. Gebruik weinig vet.\n" +
                "•\tBeperk het gebruik van alcohol tot één glas per dag en drink liefst niet elke dag alcohol.\n" +
                "•\tProbeer oorzaken van stress aan te pakken. Meer stress zorgt voor meer belasting op het hart, dus minder stress is minder belastend voor het hart.\n");
        imageDictionary.put(HEARTATACK_REVALIDATION, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_WATISHET, "Een hartaanval is een verstopping in een kransslagader van het hart. De kransslagader zorgt ervoor dat het hart voldoende zuurstof en voedingsstoffen krijgt, waardoor het zijn werk kan blijven doen. Deze kransslagader ligt om het hart als een soort krans, vandaar de naam. Wanneer de kransslagader verstopt raakt dan krijgt het hart dus te weinig zuurstof en voedingsstoffen. Een deel van het spier van het hart wordt hierdoor beschadigd en sterft af. \n" +
                "Dit geeft in het begin nog geen grote klachten. Het zal vooral te merken zijn tijdens inspanning of bij hevige emoties. In dit soort momenten heeft het namelijk extra zuurstof nodig en door de verstopping krijgt het hart dit dus niet. Dit leidt tot pijn op de borst. Wanneer de kransslagader helemaal wordt geblokkeerd is er sprake van een hartaanval. \n" +
                "\n" +
                "Risicofactoren hartaanval\n" +
                "Een aantal factoren verhoogt de kans op een hartaanval:\n" +
                "•\troken\n" +
                "•\thoge bloeddruk\n" +
                "•\tverhoogd cholesterolgehalte\n" +
                "•\tdiabetes\n" +
                "•\tovergewicht\n" +
                "•\tlangdurige stress\n" +
                "•\terfelijkheid: hart- en vaatziekten bij vader, moeder, broer of zus voor het 65e levensjaar\n" +
                "Ook leeftijd en geslacht spelen een rol. Op jongere leeftijd is de risico op een hartaanval lager dan op hogere leeftijd en vrouwen hebben voor de overgang minder kans op een hartaanval dan mannen.\n" +
                "\n" +
                "Slagaderverkalking\n" +
                "Een hartaanval lijkt zich vaak plotseling voor te doen. Toch gaat hier een jarenlang proces aan vooraf,  dat leidt tot verstoppingen in de kransslagaders van het hart. Dit proces heet slagaderverkalking.\n" +
                "Bij slagaderverkalking hopen vet en lichaamscellen zich op in de bloedvaten: er ontstaan verstoppingen in de kransslagaders. \n" +
                "\n" +
                "Signalen hartaanval\n" +
                "De meest voorkomende klacht bij een hartaanval is een beklemmende of drukkende pijn midden op de borst die:\n" +
                "•\tin rust naar bovenarmen, hals, kaak, rug en maagstreek kan gaan\n" +
                "•\took in rust langer dan 5 minuten duurt                  \n" +
                "•\tkan samengaan met zweten, misselijkheid of braken\n" +
                "\n" +
                "Daarnaast hebben vrouwen - vaker dan mannen - een of meer van de volgende klachten:\n" +
                "•\tpijn in de bovenbuik, kaak, nek of rug\n" +
                "•\tpijn tussen de schouderbladen\n" +
                "•\tkortademigheid\n" +
                "•\textreme moeheid\n" +
                "•\tduizeligheid\n" +
                "•\tonrustig gevoel, angst en snelle ademhaling\n" +
                "•\tmisselijkheid of braken\n" +
                "\n" +
                "De klachten verschillen per persoon. De klachten kunnen plotseling of heel geleidelijk ontstaan. Bel direct 112 als hartklachten ook in rust langer duren dan 5 minuten.\n\n" +
        imageDictionary.put(HEARTATACK_WATISHET, R.drawable.clock_icon));

        dictionary.put(HEARTATACK_ICD, "Een ICD is een kastje in het lichaam voor mensen met een gevaarlijke en onvoorspelbare stoornis aan het hart. De ICD geeft een schok om het normale ritme van het hart te herstellen. De schok komt af van een elektrode dat in of op het hart wordt geplaatst. Zo voorkomt het een hartstilstand. \n" +
                "De afkorting ICD staat voor Implanteerbare Cardioverter Defibrillator.\n" +
                "•\tImplanteerbaar - wordt onder de huid aangebracht\n" +
                "•\tCardioverter - het omzetten van een niet normaal ritme in het hart naar een normaal ritme\n" +
                "•\tDefibrillator - het afgeven van een schok om het normale ritme van het hart te herstellen\n" +
                "Een ICD bestaat uit twee delen: het kastje en de elektrode(n) die voor de signalen van en naar het hart zorgen.\n" +
                "\n" +
                "Werking van de ICD\n" +
                "Wanneer het hart niet meer klopt zoals het hoort dan begint de ICD te werken. De ICD geeft binnen 15 seconden van het merken van een verkeerde hart klopping een schok aan het hart. Deze schok kan indien nodig worden herhaald. Meestal klopt het hart weer normaal door na 1 of 2 schokken.\n" +
                "\n" +
                "De ingreep\n" +
                "De implantatie van een ICD gebeurt grotendeels onder plaatselijke verdoving. Een ICD heeft  1 tot 3 draden. Dit is afhankelijk van de hartziekte. Er wordt altijd een draad in de rechter onderkant van het hart geplaatst. Soms zijn er ook draden in de rechterbovenkant of linker onderkant van het hart nodig.            \n" +
                "De ICD komt meestal onder het linker sleutelbeen. Bij mensen die de linkerarm veel gebruiken is dit soms het rechtersleutelbeen. Een enkele keer plaatst de arts de ICD in de buik.\n" +
                "De cardioloog maakt een kleine holte onder de huid, waarin de ICD wordt geplaatst. Meestal wordt de ICD meteen bij de operatie aangezet en ingesteld. De arts voert een test uit om te kijken of de draden op de goede plek zitten en of de ICD de ritmestoornis herkent.   Hiervoor wekt hij een kunstmatige hartritmestoornis op. Dit gebeurt onder lichte narcose.\n" +
                "De ingreep duurt meestal anderhalf tot twee uur. De implantatie van een biventriculaire ICD kost meer tijd, omdat er een extra draad geplaatst moet worden.\n" +
                "\n" +
                "Na de implantatie\n" +
                "Na de implantatie blijft u meestal 1 of 2 dagen in het ziekenhuis. Voor het herstel na de operatie moet u 6 tot 8 weken rekenen. In deze weken moeten de draden de kans krijgen om vast te groeien in het hart.\n" +
                "Houd daarom de volgende regels aan:\n" +
                "•\tVermijd rekken, strekken en ronddraaiende bewegingen van de arm boven schouderhoogte (ook niet zwemmen)\n" +
                "•\tTil geen zware dingen en verricht geen zwaar werk met de armen (de onderarmen mogen wel bewegen)\n" +
                "•\tProbeer de arm niet achter het te lichaam brengen, pas bijvoorbeeld op met het aantrekken van de jas\n" +
                "•\tVermijd knellende kleding in verband met irritatie van de wond\n" +
                "•\tProbeer de arm wel te bewegen, anders ontstaan er mogelijk pijnklachten aan de schouder\n" +
                "\n" +
                "Controle van de ICD\n" +
                "Een ICD moet regelmatig gecontroleerd worden. Hiervoor heeft de ICD-drager contact met de cardioloog en de ICD-technicus. De patiënt moet meestal 2 keer per jaar naar het ziekenhuis. De ICD-technicus controleert dan of de ICD goed werkt en of de instellingen juist zijn. Ook wordt de batterij van de ICD gecontroleerd. De cardioloog controleert het hart en hoe het hart klopt en leest de gegevens uit de ICD uit om te kijken of deze goed heeft gewerkt.\n" +
                "Vervangen van de ICD\n" +
                "Als de batterij van een ICD leeg is, dan moet de hele ICD vervangen worden. De levensduur van de ICD's is 5 tot 10 jaar. De levensduur is afhankelijk van de instellingen van de ICD en hoe vaak de ICD een schok moet geven. \n" +
                "Bij elke controle in het ziekenhuis wordt het energieniveau van de batterij gecontroleerd. Als het energieniveau beneden een bepaalde waarde komt, dan wordt de ICD op korte termijn vervangen. Dit gebeurt ruim op tijd, voordat de batterij leeg is.\n" +
                "Als na controle blijkt dat de draden nog goed werken, dan worden deze weer aangesloten op de nieuwe ICD. Af en toe komt het voor dat de draden toch vervangen moeten worden.\n" +
                "\n" +
                "\n" +
                "Veel gestelde vragen over de ICD\n" +
                "\n" +
                "Wanneer moet ik de cardioloog bellen?\n" +
                "Bel altijd de cardioloog als:\n" +
                "•\tDe ICD een schok heeft afgegeven\n" +
                "•\tDe patiënt merkt dat hij of zij een ernstig probleem heeft met het kloppen van het hart\n" +
                "•\tAls de patiënt (even) buiten bewustzijn is geraakt\n" +
                "•\tDe ICD piept om aan te geven dat de batterijen opraken\n" +
                "•\tEr ontstekingsverschijnselen zijn in de borst of buik (rode en opgezwollen huid)\n" +
                "\n" +
                "Mag ik alle sporten doen met een ICD?\n" +
                "Bij contactsporten (bal- of vechtsporten) kan een trap of klap op de plek van de ICD pijnlijk zijn. Meestal gaat de ICD hier niet van kapot. Er kan wel een draadje beschadigd raken. Bespreek daarom met de cardioloog welke vormen van sport mogelijk zijn.\n" +
                "Sommige activiteiten, zoals zwemmen of bergbeklimmen, zijn beter om te vermijden of om samen met anderen te doen. Bij deze activiteiten is het gevaarlijk om bewusteloos te raken.\n" +
                "\n" +
                "Mag ik autorijden met een ICD?\n" +
                "Autorijden na implantatie van een ICD is onder bepaalde voorwaarden toegestaan. In ieder geval is de patiënt  gedurende een observatieperiode van twee maanden na de implantatie of na een schok niet rijgeschikt.\n" +
                "Als na die twee maanden bij de controle blijkt dat de ICD geen schok heeft afgegeven, ontvangt de patiënt van de cardioloog een geschiktheidsverklaring. Daarmee kan hij bij het CBR een rijbewijs aanvragen voor privégebruik (code 100) of beperkt beroepsmatig gebruik (code 101).\n" +
                "Geeft de ICD na de observatieperiode opnieuw een of meer schokken, dan is de patiënt weer twee maanden niet rijgeschikt.\n" +
                "Een ICD-drager mag alleen nog gebruik maken van de rijbewijzen van Groep 1 (A, B, B+E). Voor de rijbewijzen van Groep 2, dus ook voor het zogenaamde Groot Rijbewijs, komt de ICD-drager niet in aanmerking.\n" +
                "\n" +
                "Waar moet ik op letten als ik op vakantie ga?\n" +
                "Met een ICD mag u gewoon op vakantie. Ook met het vliegtuig. In geval van een schok of problemen met de ICD, kunt u ook in het buitenland terecht in een ziekenhuis.\n" +
                "\n" +
                "Weer aan het werk met een ICD\n" +
                "Het oppakken van het dagelijks leven als ICD-drager levert meestal geen problemen op. In verband met de wondgenezing wordt meestal geadviseerd tot aan de eerste controle in het ziekenhuis niet te werken. De eerste weken is zwaar lichamelijk werk niet toegestaan.\n");
        imageDictionary.put(HEARTATACK_ICD, R.drawable.clock_icon);

        dictionary.put(HEARTATACK_COMPENSATIONE, "Hartrevalidatie in een ziekenhuis of revalidatiecentrum, met verwijzing van de cardioloog, wordt vergoed vanuit de basisverzekering.\n" +
                "Er zijn ook fysiotherapeuten die hartrevalidatie aanbieden. Dit valt niet onder de basisverzekering, omdat het iets anders is dan de aanpak in een ziekenhuis. Hiervoor kunt u het beste contact opnemen met uw cardioloog of anders uw huisarts.\n" +
                "\n" +
                "Sommige patiënten sluiten zich na hartrevalidatie aan bij beweeggroepen voor hartpatiënten en sporten dan onder deskundige begeleiding. Dit wordt meestal niet vergoed.\n");
        imageDictionary.put(HEARTATACK_COMPENSATIONE, R.drawable.bed_icon);

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

        CharSequence TiaMedicines = getText(R.string.TiaMedicines);
        dictionary.put(TIA_MEDICIJNEN, TiaMedicines);

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

