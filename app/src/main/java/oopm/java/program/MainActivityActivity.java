package oopm.java.program;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
//import android.widget.Toast;

/*import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;*/

import java.util.ArrayList;

public class MainActivityActivity extends AppCompatActivity implements View.OnClickListener {

   private CardView javaprogram,cprogram,python,addprogram,aboutus;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        javaprogram = (CardView) findViewById(R.id.java);
        cprogram = (CardView) findViewById(R.id.c_programming);
        python = (CardView) findViewById(R.id.python);
        addprogram = (CardView) findViewById(R.id.add_programs);
        aboutus = (CardView) findViewById(R.id.aboutUs);

        javaprogram.setOnClickListener(this);
        cprogram.setOnClickListener(this);
        python.setOnClickListener(this);
        addprogram.setOnClickListener(this);
        aboutus.setOnClickListener(this);




        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

    }


    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.java : i = new Intent(MainActivityActivity.this,Javaprogram.class); startActivity(i); break;
            case R.id.c_programming : i = new Intent(this,Cprogram.class); startActivity(i); break;
            case R.id.add_programs : i = new Intent(this,RequestProgram.class); startActivity(i); break;
            case R.id.python : i = new Intent(this,Pythonprogram.class); startActivity(i); break;
            case R.id.aboutUs : i = new Intent(this,AboutUs.class); startActivity(i); break;
            default: break;



        }

    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_about_us){
            Intent intent = new Intent(MainActivityActivity.this, AboutUs.class);
            startActivity(intent);
            return false;

        }
        return super.onOptionsItemSelected(item);
    }

    */
}
