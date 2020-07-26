package com.example.shilpika.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SolutionActivity extends AppCompatActivity {
    TextView textView, textView2, textView3, textView4;
    Button soln, cause, comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        textView=findViewById(R.id.textviewsoln);
        textView2=findViewById(R.id.textviewdetails);
        textView3=findViewById(R.id.textviewcause);
        textView4=findViewById(R.id.textviewcomments);

        soln=findViewById(R.id.buttondet);
        cause=findViewById(R.id.buttoncause);
        comment=findViewById(R.id.buttoncomments);

        Intent intent=getIntent();
        String message=intent.getStringExtra("Response");
        textView.setText(message);

        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);

        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language= prefs.getString("My_Lang", "");

        if (language.equals("eng"))
        {
            if(message.equals("Corn_(maize)___Cercospora_leaf_spot Gray_leaf_spot"))
            {
                textView2.setText("Symptoms:\n" +
                        "Small necrotic spots with chlorotic halos, as the lesions mature they turn tan in color and finally gray");
                textView3.setText("Cause:\n" + "Fungus");
                textView4.setText("Comments:\n" + "Occurs in areas where a corn crop is followed by more corn with no rotation\n" + "Management\n" +
                        "•\tPlant corn hybrids with resistance to the disease\n" +
                        "•\tCrop rotation and ploughing debris into soil \n" +
                        "•\tFoliar fungicides may be economically viable for some high yielding susceptible hybrids\n");
            }

            else if(message.equals("Corn_(maize)___Common_rust_"))
            {
                textView2.setText("Symptoms:\n" +
                        "Oval or elongated cinnamon brown pustules on upper and lower surfaces of leaves");
                textView3.setText("Cause:\n" + "Fungus");
                textView4.setText("Comments:\n" +
                        "Disease is spread by wind-borne spores. \n" +
                        "Management:\n" +
                        "•\tPlant resistant hybrids\n" +
                        "•\tApplication of appropriate fungicides");
            }

            else if(message.equals("Corn_(maize)___Northern_Leaf_Blight"))
            {
                textView2.setText("Symptoms:\n" +
                        "Elliptical gray-green lesions on leaves");
                textView3.setText("Cause:\n" + "Fungus");
                textView4.setText("Comments:\n" +
                        "The disease mainly spread through rain splash and wind.\n"+
                        "Management:\n" +
                        "•\tFollow proper tillage to reduce fungus inoculum from crop debris. \n" +
                        "•\tFollow crop rotation with non-host crop. \n" +
                        "•\tGrow available resistant varieties.");
            }

            else if(message.equals("Corn_(maize)___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Cotton___Magnesium_deficiency"))
            {
                textView2.setText("Symptoms:\n" +
                        "Green leaves turns purple in colour. The middle and the older leaves turn red in colour.");
                textView3.setText("Causes:\n"+"Magnesium (Mg) deficiency is a detrimental plant disorder that occurs most often in strongly acidic, light and sandy soils where magnesium gets easily leached away.");
                textView4.setText("Management:\n" +
                        "•\tUse organic manure and compost manure.\n" +
                        "•\tApply homemade compost as mulch to prevent leaching during excessive rainfall\n" +
                        "•\tSpray 100g magnesium sulphate with 20g lime in 10 litres of water\n" +
                        "•\tSpray 20g magnesium sulphate with 10g urea per litre of water with an interval of 15 days");
            }

            else if (message.equals("Cotton___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Orange___Haunglongbing_(Citrus_greening)"))
            {
                textView2.setText("Symptoms:\n" +"Yellowing of one limb or one area of canopy, yellowing of leaf veins.");
                textView3.setText("Cause:\n" +
                        "Bacteria");
                textView4.setText("Comments:\n" +
                        "The disease in not transmitted at high rates through grafting as not all buds on infected trees contain the bacterium.\n" +
                        "Management\n" +
                        "•\tStrict quarantining to prevent the introduction of citrus psyllids to areas which are currently free of the pest. \n" +
                        "•\tInfected trees should be removed as quickly as possible from plantations and destroyed. \n" +
                        "•\tApplication of chemical sprays\n" +
                        "•\tControl strategies which have been implemented by the program include scouting, mapping and large-scale spraying to control citrus psyllids.\n");
            }

            else if(message.equals("Potato___Early_blight"))
            {
                textView2.setText("Symptoms:\n" +
                        "Dark lesions with yellow border");
                textView3.setText("Cause:\n" +
                        "Fungus");
                textView4.setText("Comments:\n" +
                        "Disease is favoured by cycles of wet and dry conditions with periods of high humidity and leaf wetness.\n" +
                        "Management:\n" +
                        "•\tApplication of appropriate protective fungicide\n" +
                        "•\tReduce stress to plants by fertilizing and watering adequately\n" +
                        "•\tPlant late varieties which are less susceptible to disease\n" +
                        "•\tStore tubers in cool environment");
            }

            else if(message.equals("Potato___Late_blight"))
            {
                textView2.setText("Symptoms:\n" +
                        "Irregular brown lesions on leaves with distinctive white fluffy sporulation at lesion margins");
                textView3.setText("Cause:\n" +
                        "Oomycete");
                textView4.setText("Comments:\n" +
                        "Disease favoured by moist, cool conditions, major cause of disease spread is infected tubers\n" +
                        "Management:\n" +
                        "•\tDestroy infected tubers \n" +
                        "•\tDestroy any volunteer plants\n" +
                        "•\tApplication of appropriate fungicide to potato hills at emergence\n" +
                        "•\tWater early to allow plant to dry off during the day\n" +
                        "•\tPlant resistant varieties");
            }

            else if(message.equals("Potato___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Tomato___Early_blight"))
            {
                textView2.setText("Symptoms\n" +
                        "Oval shaped lesions with a yellow chlorotic region across the lesion");
                textView3.setText("Cause:\n" +
                        "Fungus");
                textView4.setText("Comments:\n" +
                        "Disease can spread rapidly after plants have set fruit, movement of air-borne spores and contact with infested soil are causes for the spread of the disease.\n" +
                        "Management:\n" +"•\tApply appropriate fungicide at first sign of disease\n" +
                        "•\tDestroy any volunteer solanaceous plants (tomato, potato, nightshade etc)\n" +
                                "•\tpractice crop rotation");
            }

            else if(message.equals("Tomato___Early__Blight"))
            {
                textView2.setText("Symptoms:\n" +
                        "Oval shaped lesions with a yellow chlorotic region across the lesion");
                textView3.setText("Cause:\n" +
                        "Fungus");
                textView4.setText("Comments:\n" +
                        "Disease can spread rapidly after plants have set fruit, movement of air-borne spores and contact with infested soil are causes for the spread of the disease.\n" +
                        "Management:\n" +"•\tApply appropriate fungicide at first sign of disease\n" +
                        "•\tDestroy any volunteer solanaceous plants (tomato, potato, nightshade etc)\n" +
                        "•\tpractice crop rotation");
            }

            else if(message.equals("Tomato___Late_blight")){
                textView2.setText("Symptoms:\n" +
                        "Water-soaked green to black areas on leaves which rapidly change to brown lesions.");
                textView3.setText("Cause:\n" +
                        "Oomycete");
                textView4.setText("Comments:\n" +
                        "Can devastate tomato plantings.\n" +
                        "Management:\n" +
                        "•\tPlant resistant varieties\n" +
                        "•\tIf signs of disease are present or if rainy conditions are likely or if using overhead irrigation appropriate fungicides should be applied.");
            }

            else if(message.equals("Tomato___Leaf_Mold")){
                textView2.setText("Symptoms:\n" +
                        "Pale greenish to yellow spots on upper surface and green to brown velvety fungal growth on lower surface.");
                textView3.setText("Cause:\n" +
                        "Fungus");
                textView4.setText("Comments\n" +
                        "The disease is favored by high relative humidity. \n" +
                        "Management\n" +
                        "•\tGrow available resistant varieties. \n" +
                        "•\tAvoid leaf wetting and overhead application of water. \n" +
                        "•\tFollow proper spacing to provide good air circulation around the plants. \n" +
                        "•\tRemove the infected plant debris and burn them. \n" +
                        "•\tIf the disease is severe, use suitable fungicide.\n");
            }

            else if(message.equals("Tomato___Septoria_leaf_spot")){
                textView2.setText("Symptoms:\n" +
                        "Small, water-soaked spots or circular greyish-white spots on the underside of older leaves");
                textView3.setText("Cause:\n" +
                        "Fungus");
                textView4.setText("Comments:\n" +
                        "Spread by water splash; fungus overwinters in plant debris.\n" +
                        "Management:\n" +
                        "•\tEnsure all tomato crop debris is removed and destroyed in Fall or ploughed deep into soil\n" +
                        "•\tavoid overhead irrigation\n" +
                        "•\tstake plants to increase air circulation through the foliage\n" +
                        "•\tapply appropriate fungicide if necessary.");
            }

            else if(message.equals("Tomato___healthy")){
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("background")){
                textView2.setText("Please retry with a leaf image");
            }
        }

        else if (language.equals("hi"))
        {
            if(message.equals("Corn_(maize)___Cercospora_leaf_spot Gray_leaf_spot"))
            {
                textView2.setText("लक्षण: क्लोरोटिक के साथ छोटे नेक्रोटिक धब्बे, घाव के रूप में परिपक्व वे रंग में तन और अंत में ग्रे बारी \n" +
                        "\n" +
                        "कारण:\n" +
                        "कुकुरमुत्ता \n" +
                        "\n" +
                        "टिप्पणियाँ:\n" +
                        "उन क्षेत्रों में होता है जहां मकई की फसल का अधिक मक्का होता है जिसमें कोई घुमाव नहीं होता है \n" +
                        "\n" +
                        "प्रबंध:\n" +
                        "• रोग के प्रतिरोध के साथ मकई संकर पौधे \n" +
                        "• फसल का सड़ना और मलबे को मिट्टी में मिलाना \n" +
                        "• कुछ उच्च उपज वाले अतिसंवेदनशील संकरों के लिए पर्ण कवक आर्थिक रूप से व्यवहार्य हो सकता है \n");
            }

            else if(message.equals("Corn_(maize)___Common_rust_"))
            {
                textView2.setText("लक्षण \n" +
                        "पत्तियों की ऊपरी और निचली सतहों पर अंडाकार या लम्बी दालचीनी भूरे रंग के गुच्छे \n" +
                        "\n" +
                        "कारण\n" +
                        " कुकुरमुत्ता \n" +
                        "\n" +
                        "टिप्पणियाँ \n" +
                        "रोग वायु जनित बीजाणुओं द्वारा फैलता है। \n" +
                        "प्रबंध \n" +
                        "• संयंत्र प्रतिरोधी संकर \n" +
                        "• उपयुक्त कवकनाशी का अनुप्रयोग \n");
            }

            else if(message.equals("Corn_(maize)___Northern_Leaf_Blight")){
                textView2.setText("लक्षण \n" +
                        "पत्तियों पर अण्डाकार धूसर-हरे घाव \n" +
                        "\n" +
                        "कारण \n" +
                        "कुकुरमुत्ता \n" +
                        "\n" +
                        "टिप्पणियाँ \n" +
                        "यह बीमारी मुख्य रूप से बारिश के छींटे और हवा से फैलती है। \n" +
                        "\n" +
                        "प्रबंध\n" +
                        " • फसल के मलबे से फंगस इनोकुलम कम करने के लिए उचित जुताई का पालन करें। \n" +
                        "• गैर-मेजबान फसल के साथ फसल रोटेशन का पालन करें। \n" +
                        "• उपलब्ध प्रतिरोधी किस्में उगाएं। \n" +
                        "• बीमारी के गंभीर मामलों में उपयुक्त फफूंद नाशक लागू होते हैं\n");
            }

            else if(message.equals("Corn_(maize)___healthy"))
            {
                textView2.setText("स्वस्थ");
            }

            else if(message.equals("Cotton___Magnesium_deficiency")) {
                textView2.setText("लक्षण \n" +
                        "हरी पत्तियां बैंगनी रंग में बदल जाती हैं। बीच और पुराने पत्ते लाल रंग में बदल जाते हैं। पृष्ठभूमि मैग्नीशियम (Mg) की कमी एक हानिकारक पौधे का विकार है जो सबसे अधिक बार अम्लीय, हल्की और रेतीली मिट्टी में होता है जहां मैग्नीशियम आसानी से दूर हो जाता है।\n" +
                        "\n" +
                        " प्रबंध \n" +
                        "• जैविक खाद और कम्पोस्ट खाद का प्रयोग करें। \n" +
                        "• अत्यधिक वर्षा के दौरान लीचिंग को रोकने के लिए गीली घास के रूप में घर का बना खाद लागू करें \n" +
                        "• 10 ग्राम पानी में 20 ग्राम चूने के साथ 100 ग्राम मैग्नीशियम सल्फेट का छिड़काव करें \n" +
                        "• 20 ग्राम मैग्नीशियम सल्फेट को 10 ग्राम यूरिया प्रति लीटर पानी के साथ 15 दिनों के अंतराल पर स्प्रे करें \n");
            }

            else if (message.equals("Cotton___healthy"))
            {
                textView2.setText("स्वस्थ");
            }

            else if(message.equals("Orange___Haunglongbing_(Citrus_greening)"))
            {
                textView2.setText("एक अंग का पीला पड़ना या चंदवा का एक क्षेत्र, पत्ती की नसों का पीला पड़ना। \n" +
                        "\n" +
                        "कारण \n" +
                        "जीवाणु \n" +
                        "\n" +
                        "टिप्पणियाँ\n" +
                        "ग्राफ्टिंग के माध्यम से उच्च दरों पर संक्रमण नहीं होने के कारण संक्रमित पेड़ों पर सभी कलियों में जीवाणु नहीं होते हैं। \n" +
                        "\n" +
                        "प्रबंध \n" +
                        "\n" +
                        "• उन क्षेत्रों में साइट्रस साइलिड्स की शुरूआत को रोकने के लिए सख्त संगरोध जो वर्तमान में कीट से मुक्त हैं। \n" +
                        "• रोपे गए वृक्षों से संक्रमित पेड़ों को जल्द से जल्द हटाया जाना चाहिए और नष्ट कर दिया जाना चाहिए। \n" +
                        "• रासायनिक स्प्रे का अनुप्रयोग \n" +
                        "• कार्यक्रम द्वारा कार्यान्वित की जाने वाली नियंत्रण रणनीतियों में साइट्रस साइलिड्स को नियंत्रित करने के लिए स्काउटिंग, मैपिंग और बड़े पैमाने पर छिड़काव शामिल हैं।\n");

            }

            else if(message.equals("Potato___Early_blight"))
            {
                textView2.setText("लक्षण \n" +
                        "पीली सीमा के साथ गहरे घाव \n" +
                        "\n" +
                        "कारण \n" +
                        "कुकुरमुत्ता \n" +
                        "\n" +
                        "टिप्पणियाँ \n" +
                        "रोग उच्च आर्द्रता और पत्ती के गीलेपन के साथ गीला और शुष्क परिस्थितियों के चक्रों का पक्षधर है। \n" +
                        "\n" +
                        "प्रबंध \n" +
                        "• उपयुक्त सुरक्षात्मक कवकनाशी का अनुप्रयोग \n" +
                        "• पौधों को निषेचन और पर्याप्त रूप से पानी देकर तनाव को कम करें \n" +
                        "• देर से पकने वाली ऐसी किस्में लगाएं जिनमें बीमारी की आशंका कम हो \n" +
                        "• ठंडे वातावरण में स्टोर कंद\n");
            }
            else if(message.equals("Potato___Late_blight"))
            {
                textView2.setText("लक्षण \n" +
                        "घाव के मार्जिन पर विशिष्ट सफेद शराबी स्पोरुलेशन के साथ पत्तियों पर अनियमित भूरे रंग के घाव \n" +
                        "\n" +
                        "कारण \n" +
                        "Oomycete \n" +
                        "\n" +
                        "टिप्पणियाँ \n" +
                        "नम, ठंडी स्थितियों के अनुकूल रोग, रोग फैलने का प्रमुख कारण संक्रमित कंद है \n" +
                        "\n" +
                        "प्रबंध \n" +
                        "• संक्रमित कंद नष्ट करें \n" +
                        "• किसी भी स्वयंसेवक पौधों को नष्ट करें \n" +
                        "• उभरने पर आलू पहाड़ियों के लिए उपयुक्त कवकनाशी का आवेदन \n" +
                        "• दिन के दौरान पौधे को सूखने देने के लिए जल्दी पानी\n");
            }

            else if(message.equals("Potato___healthy"))
            {
                textView2.setText("स्वस्थ");
            }

            else if(message.equals("Tomato___Early_blight"))
            {
                textView2.setText("लक्षण\n" +
                        "घाव के पार पीले क्लोरोटिक क्षेत्र के साथ अंडाकार आकार के घाव\n" +
                        "कारण\n" +
                        "कुकुरमुत्ता\n" +
                        "टिप्पणियाँ\n" +
                        "पौधों में फल लगने के बाद रोग तेजी से फैल सकता है, वायु जनित बीजाणुओं की आवाजाही और संक्रमित मिट्टी के साथ संपर्क रोग के फैलने का कारण है\n" +
                        "प्रबंध\n" +
                        "• बीमारी के पहले संकेत पर उचित कवकनाशी लागू करें\n" +
                        "• किसी भी स्वयंसेवक विलायक पौधों (टमाटर, आलू, नाइटशेड आदि) को नष्ट करें\n" +
                        "• फसल चक्रण का अभ्यास करें\n");
            }

            else if(message.equals("Tomato___Early__Blight"))
            {
                textView2.setText("लक्षण\n" +
                        "घाव के पार पीले क्लोरोटिक क्षेत्र के साथ अंडाकार आकार के घाव\n" +
                        "कारण\n" +
                        "कुकुरमुत्ता\n" +
                        "टिप्पणियाँ\n" +
                        "पौधों में फल लगने के बाद रोग तेजी से फैल सकता है, वायु जनित बीजाणुओं की आवाजाही और संक्रमित मिट्टी के साथ संपर्क रोग के फैलने का कारण है\n" +
                        "प्रबंध\n" +
                        "• बीमारी के पहले संकेत पर उचित कवकनाशी लागू करें\n" +
                        "• किसी भी स्वयंसेवक विलायक पौधों (टमाटर, आलू, नाइटशेड आदि) को नष्ट करें\n" +
                        "• फसल चक्रण का अभ्यास करें\n");
            }

            else if(message.equals("Tomato___Late_blight"))
            {
                textView2.setText("लक्षण\n" +
                        "पत्तियों पर पानी से लथपथ हरे रंग के क्षेत्रों में तेजी से भूरे रंग के घावों में बदल जाते हैं।\n" +
                        "कारण\n" +
                        "Oomycete\n" +
                        "टिप्पणियाँ\n" +
                        "टमाटर के पौधों को नष्ट कर सकते हैं।\n" +
                        "प्रबंध\n" +
                        "• पौधों की प्रतिरोधी किस्में\n" +
                        "• यदि बीमारी के संकेत मौजूद हैं या यदि बारिश की स्थिति होने की संभावना है या यदि ओवरहेड सिंचाई का उपयोग किया जाता है तो उचित कवकनाशी लागू किया जाना चाहिए।\n");
            }

            else if(message.equals("Tomato___Leaf_Mold")){
                textView2.setText("लक्षण\n" +
                        "ऊपरी सतह पर पीले धब्बे और निचली सतह पर भूरे रंग के मखमली कवक के विकास के लिए हरे-पीले।\n" +
                        "कारण\n" +
                        "कुकुरमुत्ता\n" +
                        "टिप्पणियाँ\n" +
                        "रोग उच्च सापेक्ष आर्द्रता द्वारा इष्ट है।\n" +
                        "प्रबंध\n" +
                        "• उपलब्ध प्रतिरोधी किस्में उगाएं।\n" +
                        "• पत्ती गीली और पानी के ओवरहेड अनुप्रयोग से बचें।\n" +
                        "• पौधों के आसपास अच्छा वायु संचार प्रदान करने के लिए उचित रिक्ति का पालन करें।\n" +
                        "• संक्रमित पौधे के मलबे को हटा दें और उन्हें जला दें।\n" +
                        "• यदि बीमारी गंभीर है, तो उपयुक्त कवकनाशी का उपयोग करें।\n");
            }

            else if(message.equals("Tomato___Septoria_leaf_spot")){
                textView2.setText("लक्षण\n" +
                        "छोटे, पानी से लथपथ धब्बे या वृद्ध पत्तियों के नीचे की तरफ गोलाकार सफेद धब्बे\n" +
                        "कारण\n" +
                        "कुकुरमुत्ता\n" +
                        "टिप्पणियाँ\n" +
                        "पानी के छींटे से फैलता है; पौधे के मलबे में कवक ओवरविंटर्स।\n" +
                        "प्रबंध\n" +
                        "• सुनिश्चित करें कि सभी टमाटर की फसल का मलबा फॉल में नष्ट हो गया है या मिट्टी में गहराई से गिर गया है\n" +
                        "• ओवरहेड सिंचाई से बचें\n" +
                        "• पर्णसमूह के माध्यम से वायु संचलन को बढ़ाने के लिए स्टेक प्लांट\n" +
                        "• यदि आवश्यक हो तो उचित कवकनाशी लागू करें\n");
            }

            else if(message.equals("Tomato___healthy")){
                textView2.setVisibility(View.INVISIBLE);
            }

            else if(message.equals("background")){
                textView2.setText("Please retry with a leaf image");
            }
        }

        else if (language=="mr")
        {
            if(message.equals("Corn_(maize)___Cercospora_leaf_spot Gray_leaf_spot"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Corn_(maize)___Common_rust_"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Corn_(maize)___Northern_Leaf_Blight"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Corn_(maize)___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Cotton___Magnesium_deficiency"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if (message.equals("Cotton___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Orange___Haunglongbing_(Citrus_greening)"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Potato___Early_blight"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Potato___Late_blight"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Potato___healthy"))
            {
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("Tomato___Early_blight"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Tomato___Early__Blight"))
            {
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Tomato___Late_blight")){
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Tomato___Leaf_Mold")){
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Tomato___Septoria_leaf_spot")){
                textView2.setText("लक्षणे:\n" +
                        "पिवळ्या सीमेसह गडद जखम");
                textView3.setText("कारण:\n" +
                        "बुरशीचे");
                textView4.setText("टिप्पण्या:\n" +
                        "जास्त आर्द्रता आणि पाने ओलाव्याच्या कालावधीसह ओल्या आणि कोरड्या परिस्थितीच्या चक्रांमुळे रोगाचा फायदा होतो. \n" +
                        "\n" +
                        "व्यवस्थापन:\n" +
                        "योग्य संरक्षणात्मक बुरशीनाशकाचा वापर \n" +
                        "खत व पुरेसे पाणी देऊन वनस्पतींचा ताण कमी करा उशीरा वाण लागवड करा ज्याला रोगाचा धोका कमी आहे थंड वातावरणात कंद ठेवा ");
            }

            else if(message.equals("Tomato___healthy")){
                textView2.setText("Healthy! Good job.");
            }

            else if(message.equals("background")){
                textView2.setText("Please retry with a leaf image");
            }

        }

        soln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setVisibility(View.VISIBLE);
            }
        });

        cause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setVisibility(View.VISIBLE);
            }
        });

        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView4.setVisibility(View.VISIBLE);
            }
        });
    }


}
