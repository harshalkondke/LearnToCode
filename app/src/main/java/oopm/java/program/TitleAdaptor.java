package oopm.java.program;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TitleAdaptor extends RecyclerView.Adapter<TitleAdaptor.MyViewHolder>{

    private Context contex;
    private ArrayList<String> titleList;
    private CustomItemClickListener clickListener;

    public TitleAdaptor(Context contex, ArrayList<String> titleList, CustomItemClickListener clickListener) {
        this.contex = contex;
        this.titleList = titleList;
        this.clickListener = clickListener;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(contex).inflate(R.layout.title_layout,parent, false);

        final MyViewHolder viewHolder = new MyViewHolder(view);

        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                clickListener.onItemClick(view,viewHolder.getPosition());
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titleText.setText(titleList.get(position).replace("_"," "));

    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titleText;

        public MyViewHolder(View itemView) {
            super(itemView);
            titleText = (TextView) itemView.findViewById(R.id.title_text);
        }

    }

}
