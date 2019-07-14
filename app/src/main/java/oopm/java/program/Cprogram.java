/*  package oopm.java.program;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cprogram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogram);
    }
}

*/


package oopm.java.program;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Cprogram extends AppCompatActivity {

    private Cprogram contex;
    ArrayList<String> titleArrayList;
    private RecyclerView recyclerView;

    //private AdView adView;
    private static final String TAG = "ViewList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);



        titleArrayList = new ArrayList<String>();




        titleArrayList.add(Lables.c01);
        titleArrayList.add(Lables.c02);
        titleArrayList.add(Lables.c03);
        titleArrayList.add(Lables.c04);
        titleArrayList.add(Lables.c05);
        titleArrayList.add(Lables.c06);
        titleArrayList.add(Lables.c07);
        titleArrayList.add(Lables.c08);
        titleArrayList.add(Lables.c09);
        titleArrayList.add(Lables.c10);
        titleArrayList.add(Lables.c11);
        titleArrayList.add(Lables.c12);
        titleArrayList.add(Lables.c13);
        titleArrayList.add(Lables.c14);
        titleArrayList.add(Lables.c15);
        titleArrayList.add(Lables.c16);
        titleArrayList.add(Lables.c17);
        titleArrayList.add(Lables.c18);
        titleArrayList.add(Lables.c19);
        titleArrayList.add(Lables.c20);
        titleArrayList.add(Lables.c21);
        titleArrayList.add(Lables.c22);
        titleArrayList.add(Lables.c23);
        titleArrayList.add(Lables.c24);
        titleArrayList.add(Lables.c25);
        titleArrayList.add(Lables.c26);
        titleArrayList.add(Lables.c27);
        titleArrayList.add(Lables.c28);
        titleArrayList.add(Lables.c29);
        titleArrayList.add(Lables.c30);
        titleArrayList.add(Lables.c31);
        titleArrayList.add(Lables.c32);
        titleArrayList.add(Lables.c33);
        titleArrayList.add(Lables.c34);
        titleArrayList.add(Lables.c35);
        titleArrayList.add(Lables.c36);
        titleArrayList.add(Lables.c37);
        titleArrayList.add(Lables.c38);
        titleArrayList.add(Lables.c39);
        titleArrayList.add(Lables.c40);
        titleArrayList.add(Lables.c41);
        titleArrayList.add(Lables.c42);
        titleArrayList.add(Lables.c43);
        titleArrayList.add(Lables.c44);
        titleArrayList.add(Lables.c45);
        titleArrayList.add(Lables.c46);
        titleArrayList.add(Lables.c47);
        titleArrayList.add(Lables.c48);
        titleArrayList.add(Lables.c49);
        titleArrayList.add(Lables.c50);


        contex = Cprogram.this;
        recyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



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




