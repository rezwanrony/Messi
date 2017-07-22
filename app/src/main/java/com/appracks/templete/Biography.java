package com.appracks.templete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Biography extends AppCompatActivity {
ImageView img_bio;
    Toolbar toolbar;
    TextView tv_bio,tv_personalinfo,tv_clubinfo,tv_internationalinfo,tv_earlylife,tv_footballcareer,tv_activism;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);
        toolbar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        img_bio=(ImageView)findViewById(R.id.messibio);
        tv_bio=(TextView)findViewById(R.id.tv_biography);
        tv_personalinfo=(TextView)findViewById(R.id.tv_personalinfo);
        tv_personalinfo.setText("Full name:  Lionel Andrés Messi\n" +
                "Nickname: Leo, Lio, Messiah, Pulga\n" +
                "Date of birth:  24 June 1987\n" +
                "Place of birth:\tRosario, Argentina\n" +
                "Height:\t 1.70 m (5 ft 7 inches)\n" +
                "Weight: 72kg\n" +
                "Partner: Antonella Roccuzzo (2008–)\n" +
                "Children: Thiago Messi, Mateo Messi\n" +
                "Playing position:\tForward");
        tv_earlylife=(TextView)findViewById(R.id.earlylife);
        tv_earlylife.setText("Lionel Messi was born Luis Lionel Andres Messi on June 24, 1987, in Rosario, Argentina. As a young boy, he tagged along when his two older brothers played soccer with their friends, unintimidated by the bigger boys. At the age of 8, he was recruited to join the youth system of Newell's Old Boys, a Rosario-based club. Recognizably smaller than most of the kids in his age group, Messi was eventually diagnosed by doctors as suffering from a hormone deficiency that restricted his growth.\n" +
                "\n" +
                "Messi's parents, Jorge and Ceclia, decided on a regimen of nightly growth-hormone injections for their son, though it soon proved impossible to pay several hundred dollars per month for the medication. So, at the age of 13, when Messi was offered the chance to train at soccer powerhouse FC Barcelona's youth academy, La Masia, and have his medical bills covered by the team, Messi's family picked up and moved across the Atlantic to make a new home in Spain.");
        tv_footballcareer=(TextView)findViewById(R.id.footballcarrer);
        tv_footballcareer.setText("Although he was often homesick in his new country, Messi moved quickly through the junior system ranks, and by the age of 16, he had made his first appearance for Barcelona. Messi put himself in the record books on May 1, 2005, as the youngest player to ever score a goal for the franchise. That same year, he led Argentina to the title in the under-20 World Cup, scoring on a pair of penalty kicks to propel the team over Nigeria.\n" +
                "\n" +
                "Messi eventually grew to 5 feet and 7 inches, and with his short stature, speed and relentless attacking style, he drew comparisons to another famous Argentinean footballer: Diego Maradona. Messi steered Barcelona to a wealth of success, most notably in 2009, when the left-footer's team captured the Champions League, La Liga, and Spanish Super Cup titles. That same year, after two consecutive runner-up finishes, he took home his first FIFA \"World Player of the Year\" honor/Ballon d'Or award.\n" +
                "\n" +
                "Even the great Maradona gushed about his fellow countryman. \"I see him as very similar to me,\" the retired player told the BBC. \"He's a leader and is offering lessons in beautiful football. He has something different to any other player in the world.\"\n" +
                "\n" +
                "Amazingly, the diminutive soccer wizard continued to improve, discovering new ways to elude defenders while leading Barcelona to La Liga and Spanish Super Cup championships in 2010 and 2011, as well as the '11 Champions League title.\n" +
                "\n" +
                "Messi embarked on an all-out assault on the record books in 2012. He became the first player to score five goals in a Champions League match in early March, and a few weeks later he surpassed Cesar Rodriguez's club-record 232 goals to become Barcelona's all-time leading scorer. By the end of 2012, Messi had accumulated an astounding 91 goals in club and international play, eclipsing the 85 netted in a single calendar year by Gerd Muller in 1972. Fittingly, he broke one more record when he was named the FIFA Ballon d'Or winner for the fourth time in January 2013. Messi led team Argentina to the finals of the 2014 World Cup. Although his team lost to Germany, he was named best player of the tournament.");
        tv_activism=(TextView)findViewById(R.id.activism);
        tv_activism.setText("Almost universally regarded as the best player in the game, the boyish Messi has become the commercial face of soccer with endorsements from Adidas, Pepsi, EA Sports and Turkish Airways, among other companies. Having signed an extension with Barcelona that guarantees him a base salary of approximately $21 million per year through 2018, he is one of the world's highest-paid athletes.\n" +
                "\n" +
                "Although he is famously quiet and private off the field, Messi has found ways to help out others in need. In 2007, he formed the Leo Messi Foundation to provide opportunities for disadvantaged youths. In early 2010, UNICEF named him a goodwill ambassador, with a focus on fighting for children's rights across the globe.");
        tv_clubinfo=(TextView)findViewById(R.id.club_info);
        tv_clubinfo.setText("Current team: Barcelona\n" +
                "Jersey Number: 10\n" +
                "Playing Position: Forward\n" +
                "La Liga Appearance: 348 Matches\n" +
                "La Liga Goals: 312\n" +
                "Copa del rey Appearance: 55 Matches\n" +
                "Copa del rey Goals: 39\n" +
                "Champions League Appearance: 106 Matches\n" +
                "Champions League Goals: 83\n" +
                "Other Matches Appearance: 22\n" +
                "Other Goals: 19\n" +
                "Total Matches Played for Barcelona: 531\n" +
                "Total Goals for Barcelona: 453 (As of 22 May 2016)\n" +
                "Appearance for Barcelona B & Barcelona C: 32 Matches\n" +
                "Goals for Barcelona B & Barcelona C: 11 goals\n" +
                "Lionel messi career total goals for Barcelona,Barcelona B and Barcelona C: 464 ((As of 22 May 2016))\n");
        tv_internationalinfo=(TextView)findViewById(R.id.international_info);
        tv_internationalinfo.setText("National Team: Argentina" +
                "Jersey Number: 10\n" +
                "Playing Position: Forward\n" +
                "Tournament Appearance: 72 Matches\n" +
                "Tournament Goals: 28\n" +
                "Friendly Matches Appearance: 40 Matches\n" +
                "Goals in Friendly Matches: 27\n" +
                "Total Appearance for Argentina: 112 Matches\n" +
                "Total Goals for Argentina National Team: 55 (As of 21 june 2016)\n" +
                "Apperance for Argentina U-20 Team: 18 Matches\n" +
                "Goals for Argentina U-20 Team: 14\n" +
                "Apperance for Argentina U-23 Team: 5 Matches\n" +
                "Goals for Argentina U-23 Team: 2\n" +
                "Lionel messi career total goals for Argentina U-20,Argentina U-23 and Argentina National Team: 71 ((As of 21 June 2016))\n");
        getSupportActionBar().setTitle("Biography");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    }

