package com.example.Plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.plant_recognize.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int m_index = intent.getIntExtra(MainActivity.extra_int,8);
        TextView usesText = findViewById(R.id.usesText);
        System.out.println("the int recieved is "+m_index);
        CharSequence[] names = {"Hibiscus","Tulsi" , "Papaya" , "Amrutha balli" , "Lemon" , "Ajwain" , "Bramhi","Ekkamale"};

        if(m_index == 0) {
            System.out.println(1);
            usesText.setText("Benefits of " + names[m_index] +"(Hibiscus rosa-sinensis)"+ "\n \n \t " +
                    "1. Hibiscus leaves treat dandruff and itchy scalp.\n \n \t " +
                    "2. Hibiscus tea and extract has also been popularized as a natural appetite suppressant that can help to lose weight. \n \n \t " +
                    "3. Drinking hibiscus tea lowers blood pressure in people with mild hypertension. \n \n \t " +
                    "4. Studies have shown that hibiscus may promote liver health and help keep it working efficiently.\n \n \t " +
                    "5. Hibiscus contains an abundance of antioxidants and this is believed to give it some amount of protective properties against some forms of cancer like stomach cancer and leukemia.");

        }
        else if(m_index == 1) {
            System.out.println(2);

            usesText.setText("Benefits of "+names[m_index]+"(Ocimum tenuiflorum)"+"\n \n \t" +
                    "1. Tulsi leaves are used to treat skin problems like acne, blackheads and premature aging.\n \n \t " +
                    "2. Tulsi is also used to treat heart disease and fever.\n \n \t " +
                    "3. Tulsi tea has zero calories that boosts stamina.\n \n \t" +
                    "4. Tulsi tea controls the metabolism and helps our body to absorb essential nutrients.\n \n \t" +
                    "5. Tulsi can reduce greying of the hair and keep it thick and black.\n \n \t " +
                    "6. Tulsi leaves left in boiled water overnight can be used to wash your eyes.\n \n \t" +
                    "7. Tulsi eyewash can also reduce strain on eyes.\n");

        }
        else if(m_index == 2){
            System.out.println(3);

            usesText.setText("Benefits of "+names[m_index]+"(Carica papaya)"+"\n \n \t" +
                    "1. Cancer: Research suggests that consuming papaya is linked to a reduced risk of developing gallbladder and colorectal cancers.\n \n \t" +
                    "2. Diabetes: Early research suggests that consuming fermented papaya daily for 2 months can reduce blood sugar levels in people with diabetes.\n \n \t" +
                    "3. Human papillomavirus (HPV) infection: Research suggests that consuming papaya is linked to a reduced risk of HPV infection.\n \n \t" +
                    "4. Papaya leaf has a potential to treat certain symptoms associated with dengue.\n \n \t " +
                    "5. The significant contribution of fiber, antioxidants and potassium also make papaya even more attractive to those at risk of heart disease. ");

        }

        else if(m_index == 3){
            System.out.println(4);

            usesText.setText("Benefits of "+names[m_index]+"(Tinospora cordifolia)"+"\n \n \t" +
                    "1. It helps reduce blood sugar levels along with preventing many of the complications associated with diabetes. \n \n \t" +
                    "2. Amrutha balli tea is a traditional remedy for treating stomach ulcers and diarrhea. \n \n \t " +
                    "3. It is a herb that treats both mental illnesses and physical illnesses equally effectively. It is very useful for patients who are suffering from depression, anxiety and acute stress. \n \n \t " +
                    "4. It has anti allergy properties and it is especially effective for treating allergic rhinitis. Allergic rhinitis is a condition in which the nose gets inflamed due to allergens in the sir. ");

        }
        else if(m_index == 4){
            System.out.println(5);

            usesText.setText("Benefits of "+names[m_index]+"(Citrus lemon)"+"\n \n \t" +
                    "1. Consuming lemon juice can help reduce high blood pressure.\n \n \t " +
                    "2. The citric acid in lemons may help prevent kidney stones. \n \n \t " +
                    "3. By drinking a glass of lemon water after meals, bad breath maybe avoided. \n \n \t" +
                    "4. Lemons contain high concentrations of vitamin C, which is required to generate collagen. Collagen gives our skin a plump and youthful look. It helps to reduce the fine lines on the face and make your skin clear.\n \n \t " +
                    "5. Compounds present in the lemon- limonene and naringenin have anti-cancer properties.");

        }
        else if(m_index == 5) {
            System.out.println(6);

            usesText.setText("Benefits " + names[m_index] + "(Trachyspermum ammi)"+ "\n \n \t" +
                    "1. Ajwain can help to reduce pain associated with toothaches.\n \n \t " +
                    "2. The active constituents in ajwain are extremely beneficial in maintaining the natural colour of hair and prevent further greying. \n \n \t" +
                    "3. Ajwain or oma water is an excellent Ayurvedic remedy to treat indigestion problems. It helps in treating indigestion issues and eases irregular periods problem.  \n \n \t" +
                    "4. Several studies have revealed that ajwain seeds are potent to battle against bacteria like E. coli and salmonella that causes food poisoning and other gastrointestinal conditions.");


        }
        else if(m_index == 6){
            System.out.println(7);

            usesText.setText("Benefits of "+names[m_index]+"(Bacopa monnieri)"+"\n \n \t" +
                    "1. Consumption of Brahmi syrup was found to be effective in reducing the level of anxiety and associated symptoms.\n \n \t" +
                    "2. Brahmi improves our brain functioning and enhances both short-term and long-term memory. \n \n \t " +
                    "3. Brahmi is found to reduce blood pressure. \n \n \t" +
                    "4. Brahmi is a usual constituent of hair oil as it nourishes the hair roots, strengthens the hair and prevents dandruff.\n \n  \t " +
                    "5. Consumption of Brahmi calms us. It effectively reduces stress and anxiety. Brahmi at bedtime induces sleep and is helpful in insomnia.  ");

        }
        else if(m_index == 7){
            System.out.println(8);

            usesText.setText("Benefits of "+names[m_index]+"(Calotropis gigantea)"+"\n \n \t" +
                    "1. Root and leaf: in asthma and also used in bacterial infection, swelling with redness, boils also and shortness of breath and the bark in liver and spleen diseases.\n \n  \t" +
                    "2. Effective in treating skin, digestive, respiratory, circulatory and neurological disorders.\n \n \t" +
                    "3. Used to treat fevers, elephantiasis, nausea, vomiting, and diarrhea.\n \n \t " +
                    "4. Milky juice: used against arthritis, cancer, and as an antidote for snake bite. \n \n \t " +
                    "5. Use of calotropis as a contraceptive and as a promising cancer medication.");

        }
        else {
            Toast.makeText(this, "Please select an image and click predict first", Toast.LENGTH_SHORT).show();
        }
    }
}