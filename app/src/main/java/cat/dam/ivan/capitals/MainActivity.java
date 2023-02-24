package cat.dam.ivan.capitals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //member variables
    private final ArrayList<Country> mCountryList = new ArrayList<>();
    private TextView tv_country;
    private Button btn_back;
    private RecyclerView rv_items;
    private CustomRecyclerView myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        initDataAdapter();
    }

    private void initViews() {
        tv_country = findViewById(R.id.tv_title);
        rv_items = findViewById(R.id.rv_paisos);
        btn_back = findViewById(R.id.btn_back);
    }

    private void initData() {
        //Creem els items
        /*mCountryList.add(new Country("Andorra", "ad", "Andorra", R.drawable.andorra, "42.5", "1.5165"));
        mCountryList.add(new Country("Albània", "al", "Tirana", R.drawable.albania, "41.3275", "19.8189"));
        mCountryList.add(new Country("Àustria", "at", "Vienna", R.drawable.austria, "48.2", "16.3666"));
        mCountryList.add(new Country("Bòsnia i Herzegovina", "ba", "Sarajevo", R.drawable.bosnia, "43.85", "18.383"));
        mCountryList.add(new Country("Bèlgica", "be", "Brussels", R.drawable.belgica, "50.8333", "4.3333"));
        mCountryList.add(new Country("Bulgària", "bg", "Sofia", R.drawable.bulgaria, "42.6833", "23.3167"));
        mCountryList.add(new Country("Bielorússia", "by", "Minsk", R.drawable.bielorrusia, "53.9", "27.5666"));
        mCountryList.add(new Country("Suïssa", "ch", "Bern", R.drawable.suiza, "46.9167", "7.467"));
        mCountryList.add(new Country("Xipre", "cy", "Nicosia", R.drawable.xipre, "35.1667", "33.3666"));
        mCountryList.add(new Country("Txèquia", "cz", "Prague", R.drawable.txequia, "50.0833", "14.466"));
        mCountryList.add(new Country("Alemanya", "de", "Berlin", R.drawable.alemania, "52.5218", "13.4015"));
        mCountryList.add(new Country("Dinamarca", "dk", "Copenhagen", R.drawable.dinamarca, "55.6786", "12.5635"));
        mCountryList.add(new Country("Estònia", "ee", "Tallinn", R.drawable.estonia, "59.4339", "24.728"));
        mCountryList.add(new Country("Espanya", "es", "Madrid", R.drawable.espanya, "40.4", "-3.6834"));
        mCountryList.add(new Country("Finlàndia", "fi", "Helsinki", R.drawable.finlandia, "60.1756", "24.9341"));
        mCountryList.add(new Country("França", "fr", "Paris", R.drawable.francia, "48.8667", "2.3333"));
        mCountryList.add(new Country("Regne Unit", "gb", "London", R.drawable.regneunit, "51.5072", "-0.1275"));
        mCountryList.add(new Country("Grècia", "gr", "Athens", R.drawable.grecia, "37.9833", "23.7333"));
        mCountryList.add(new Country("Croàcia", "hr", "Zagreb", R.drawable.crocia, "45.8", "16"));
        mCountryList.add(new Country("Hongria", "hu", "Budapest", R.drawable.hongria, "47.5", "19.0833"));
        mCountryList.add(new Country("Irlanda", "ie", "Dublin", R.drawable.irlanda, "53.3331", "-6.2489"));
        mCountryList.add(new Country("Islàndia", "is", "Reykjavik", R.drawable.islandia, "64.15", "-21.95"));
        mCountryList.add(new Country("Itàlia", "it", "Rome", R.drawable.italia, "41.9", "12.4833"));
        mCountryList.add(new Country("Liechtenstein", "li", "Vaduz", R.drawable.liechtenstein, "47.1333", "9.5167"));
        mCountryList.add(new Country("Lituània", "lt", "Vilnius", R.drawable.lituania, "54.6834", "25.3166"));
        mCountryList.add(new Country("Luxemburg", "lu", "Luxembourg", R.drawable.luxemburgo, "49.6117", "6.13"));
        mCountryList.add(new Country("Letònia", "lv", "Riga", R.drawable.letonia, "56.95", "24.1"));
        mCountryList.add(new Country("Mònaco", "mc", "Monaco", R.drawable.monaco, "43.7333", "7.4"));
        mCountryList.add(new Country("Moldàvia", "md", "Chisinau", R.drawable.moldavia, "47", "28.85"));
        mCountryList.add(new Country("Montenegro", "me", "Podgorica", R.drawable.montenegro, "42.466", "19.2663"));
        mCountryList.add(new Country("Macedonia del nord", "mk", "Skopje", R.drawable.macedoniadelnord, "42", "21.4335"));
        mCountryList.add(new Country("Màlta", "mt", "Valletta", R.drawable.malta, "35.9", "14.5166"));
        mCountryList.add(new Country("Noruega", "no", "Oslo", R.drawable.noruega, "59.9167", "10.75"));
        mCountryList.add(new Country("Holanda", "nl", "Amsterdam", R.drawable.holanda, "52.35", "4.9166"));
        mCountryList.add(new Country("Polònia", "pl", "Warsaw", R.drawable.polonia, "52.25", "21"));
        mCountryList.add(new Country("Portugal", "pt", "Lisbon", R.drawable.portugal, "38.7167", "-9.1333"));
        mCountryList.add(new Country("Romania", "ro", "Bucharest", R.drawable.rumania, "44.4334", "26.1"));
        mCountryList.add(new Country("Sèrbia", "rs", "Belgrade", R.drawable.serbia, "44.8186", "20.468"));
        mCountryList.add(new Country("Rússia", "ru", "Moscow", R.drawable.russia, "55.7522", "37.6155"));
        mCountryList.add(new Country("Suecia", "se", "Stockholm", R.drawable.suecia, "59.3333", "18.05"));
        mCountryList.add(new Country("Eslovènia", "si", "Ljubljana", R.drawable.eslovenia, "46.0553", "14.515"));
        mCountryList.add(new Country("Eslovàquia", "sk", "Bratislava", R.drawable.eslovaquia, "48.15", "17.117"));
        mCountryList.add(new Country("San Marino", "sm", "San Marino", R.drawable.sanmarino, "43.9172", "12.4667"));
        mCountryList.add(new Country("Ucraïna", "ua", "Kiev", R.drawable.ucrania, "50.4334", "30.5166"));
        mCountryList.add(new Country("Andorra", "ad", "Andorra", R.drawable.andorra, 42.5, 1.5165));
        mCountryList.add(new Country("Albània", "al", "Tirana", R.drawable.albania, 41.3275, 19.8189));
        mCountryList.add(new Country("Àustria", "at", "Vienna", R.drawable.austria, 48.2, 16.3666));
        mCountryList.add(new Country("Bòsnia i Herzegovina", "ba", "Sarajevo", R.drawable.bosnia, 43.85, 18.383));*/

        mCountryList.add(new Country("Andorra", "ad", "Andorra", R.drawable.andorra, 42.5, 1.5165));
        mCountryList.add(new Country("Albània", "al", "Tirana", R.drawable.albania, 41.3275, 19.8189));
        mCountryList.add(new Country("Àustria", "at", "Vienna", R.drawable.austria, 48.2, 16.3666));
        mCountryList.add(new Country("Bòsnia i Herzegovina", "ba", "Sarajevo", R.drawable.bosnia, 43.85, 18.383));
        mCountryList.add(new Country("Bèlgica", "be", "Brussels", R.drawable.belgica, 50.8333, 4.3333));
        mCountryList.add(new Country("Bulgària", "bg", "Sofia", R.drawable.bulgaria, 42.6833, 23.3167));
        mCountryList.add(new Country("Bielorússia", "by", "Minsk", R.drawable.bielorrusia, 53.9, 27.5666));
        mCountryList.add(new Country("Suïssa", "ch", "Bern", R.drawable.suiza, 46.9167, 7.467));
        mCountryList.add(new Country("Xipre", "cy", "Nicosia", R.drawable.xipre, 35.1667, 33.3666));
        mCountryList.add(new Country("Txèquia", "cz", "Prague", R.drawable.txequia, 50.0833, 14.466));
        mCountryList.add(new Country("Alemanya", "de", "Berlin", R.drawable.alemania, 52.5218, 13.4015));
        mCountryList.add(new Country("Dinamarca", "dk", "Copenhagen", R.drawable.dinamarca, 55.6786, 12.5635));
        mCountryList.add(new Country("Estònia", "ee", "Tallinn", R.drawable.estonia, 59.4339, 24.728));
        mCountryList.add(new Country("Espanya", "es", "Madrid", R.drawable.espanya, 40.4, -3.6834));
        mCountryList.add(new Country("Finlàndia", "fi", "Helsinki", R.drawable.finlandia, 60.1756, 24.9341));
        mCountryList.add(new Country("França", "fr", "Paris", R.drawable.francia, 48.8667, 2.3333));
        mCountryList.add(new Country("Regne Unit", "gb", "London", R.drawable.regneunit, 51.5072, -0.1275));
        mCountryList.add(new Country("Grècia", "gr", "Athens", R.drawable.grecia, 37.9833, 23.7333));
        mCountryList.add(new Country("Croàcia", "hr", "Zagreb", R.drawable.crocia, 45.8, 16));
        mCountryList.add(new Country("Hongria", "hu", "Budapest", R.drawable.hongria, 47.5, 19.0833));
        mCountryList.add(new Country("Irlanda", "ie", "Dublin", R.drawable.irlanda, 53.3331, -6.2489));
        mCountryList.add(new Country("Islàndia", "is", "Reykjavik", R.drawable.islandia, 64.15, -21.95));
        mCountryList.add(new Country("Itàlia", "it", "Rome", R.drawable.italia, 41.9, 12.4833));
        mCountryList.add(new Country("Liechtenstein", "li", "Vaduz", R.drawable.liechtenstein, 47.1333, 9.5167));
        mCountryList.add(new Country("Lituània", "lt", "Vilnius", R.drawable.lituania, 54.6834, 25.3166));
        mCountryList.add(new Country("Luxemburg", "lu", "Luxembourg", R.drawable.luxemburgo, 49.6117, 6.13));
        mCountryList.add(new Country("Letònia", "lv", "Riga", R.drawable.letonia, 56.95, 24.1));
        mCountryList.add(new Country("Mònaco", "mc", "Monaco", R.drawable.monaco, 43.7333, 7.4));
        mCountryList.add(new Country("Moldàvia", "md", "Chisinau", R.drawable.moldavia, 47, 28.85));
        mCountryList.add(new Country("Montenegro", "me", "Podgorica", R.drawable.montenegro, 42.466, 19.2663));
        mCountryList.add(new Country("Macedonia del nord", "mk", "Skopje", R.drawable.macedoniadelnord, 42, 21.4335));
        mCountryList.add(new Country("Màlta", "mt", "Valletta", R.drawable.malta, 35.9, 14.5166));
        mCountryList.add(new Country("Noruega", "no", "Oslo", R.drawable.noruega, 59.9167, 10.75));
        mCountryList.add(new Country("Holanda", "nl", "Amsterdam", R.drawable.holanda, 52.35, 4.9166));
        mCountryList.add(new Country("Polònia", "pl", "Warsaw", R.drawable.polonia, 52.25, 21));
        mCountryList.add(new Country("Portugal", "pt", "Lisbon", R.drawable.portugal, 38.7167, -9.1333));
        mCountryList.add(new Country("Romania", "ro", "Bucharest", R.drawable.rumania, 44.4334, 26.1));
        mCountryList.add(new Country("Sèrbia", "rs", "Belgrade", R.drawable.serbia, 44.8186, 20.468));
        mCountryList.add(new Country("Rússia", "ru", "Moscow", R.drawable.russia, 55.7522, 37.6155));
        mCountryList.add(new Country("Suecia", "se", "Stockholm", R.drawable.suecia, 59.3333, 18.05));
        mCountryList.add(new Country("Eslovènia", "si", "Ljubljana", R.drawable.eslovenia, 46.0553, 14.515));
        mCountryList.add(new Country("San Marino", "sm", "San Marino", R.drawable.sanmarino, 43.9172, 12.4667));
        mCountryList.add(new Country("Ucraïna", "ua", "Kiev", R.drawable.ucrania, 50.4334, 30.5166));

    }

    private void initDataAdapter() {
        //Creem l'adaptador
        myAdapter = new CustomRecyclerView(this, mCountryList);
        //Establim l'adaptador i el layout manager
        rv_items.setAdapter(myAdapter);
        rv_items.setLayoutManager(new LinearLayoutManager(this));
    }

    //Gestionem el click de l'usuari en un item del RecyclerView gràcies al ViewHolder
    public void itemClick(View view, int position) {
        FragmentManager fm = getSupportFragmentManager();
        tv_country.setVisibility(View.GONE);
        rv_items.setVisibility(View.GONE);
        btn_back.setVisibility(View.VISIBLE);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_country.setVisibility(View.VISIBLE);
                rv_items.setVisibility(View.VISIBLE);
                btn_back.setVisibility(View.GONE);

            }
        });
        fm.beginTransaction().replace(R.id.map, new MapsFragment(mCountryList.get(position))).commit();
    }
}