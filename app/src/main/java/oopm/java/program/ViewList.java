package oopm.java.program;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class ViewList extends AppCompatActivity {

    private ViewList contex;
    ArrayList<String> titleArrayList;
    private RecyclerView recyclerView;

    //private AdView adView;
    private static final String TAG = "ViewList";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);



        titleArrayList = new ArrayList<String>();

        titleArrayList.add(Lables.APPLETS);
        titleArrayList.add(Lables.BIT_SHIFT);
        titleArrayList.add(Lables.BOOLEAN_LOGIC);
        titleArrayList.add(Lables.COMMAND_LINE_ARGUMENTS);
        titleArrayList.add(Lables.CONSTRUCTOR);
        titleArrayList.add(Lables.INHERITANCE);
        titleArrayList.add(Lables.INTERFACE);
        titleArrayList.add(Lables.MATH_METHOD);
        titleArrayList.add(Lables.MULTI_OF_MATRIX);
        titleArrayList.add(Lables.OVERLOAD);
        titleArrayList.add(Lables.PATTERN);
        titleArrayList.add(Lables.RELATIONAL);
        titleArrayList.add(Lables.SCANNER_ARMSTRONG);
        titleArrayList.add(Lables.SCANNER_FIBO);
        titleArrayList.add(Lables.SCANNER_PRIME_NO);
        titleArrayList.add(Lables.SUM_OF_DIAGONAL_OF_MATRIX);
        titleArrayList.add(Lables.TYPE_CAST);
        titleArrayList.add(Lables.VECTOR_CLASS);





      /*  MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");




        adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build(); //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        adView.loadAd(adRequest);

*/






        contex = ViewList.this;
        recyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        //on click listener for java programs

        TitleAdaptor adaptor = new TitleAdaptor(contex, titleArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                Intent desIntent = new Intent(contex, DesActivity.class);
                desIntent.putExtra("titles",titleArrayList.get(position));
                startActivity(desIntent);

                //Toast.makeText(contex, "clicked "+titleArrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(adaptor);
    }





}
