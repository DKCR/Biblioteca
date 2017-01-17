package com.biblioteca.biblioteca.Adapter;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.biblioteca.biblioteca.Model.CV_Model;
import com.biblioteca.biblioteca.R;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by luis on 16/01/2017.
 */

public class RV_BookList_Adapter extends RecyclerView.Adapter<RV_BookList_Adapter.Holder>{

    private ArrayList<CV_Model> cardViews;
    private Activity activity;
    private int resource;


    public RV_BookList_Adapter(ArrayList<CV_Model> cardViews, Activity activity, int resource) {
        this.activity = activity;
        this.resource = resource;
        this.cardViews = cardViews;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        CV_Model CV = cardViews.get(position);

        holder.TV_Titulo.setText(CV.getTV_Titulo());
        holder.TV_Autor.setText(CV.getTV_Autor());
        holder.TV_Editorial.setText(CV.getTV_Editorial());
        holder.TV_NoRepisa.setText(CV.getTV_NoRepisa());
        holder.TV_NoPrestamo.setText(CV.getTV_NoPrestamo());
        holder.TV_NoVendidos.setText(CV.getTV_NoVendidos());

        Glide.with(activity).load(CV.getImage()).into(holder.IV_image);

    }



    @Override
    public int getItemCount() {
        return cardViews.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private ImageView IV_image;
        private TextView TV_Titulo;
        private TextView TV_Autor;
        private TextView TV_Editorial;
        private TextView TV_NoRepisa;
        private TextView TV_NoPrestamo;
        private TextView TV_NoVendidos;
        private Button   BTN_Prestamo;
        private Button   BTN_Compra;

        public Holder(final View itemView) {
            super(itemView);
            this.IV_image      = (ImageView) itemView.findViewById(R.id.IV_BookImage);
            this.TV_Titulo     = (TextView) itemView.findViewById(R.id.CV_TV_Titulo);
            this.TV_Autor      = (TextView) itemView.findViewById(R.id.CV_TV_Autor);
            this.TV_Editorial  = (TextView) itemView.findViewById(R.id.CV_TV_Editorial);
            this.TV_NoRepisa   = (TextView) itemView.findViewById(R.id.CV_TV_NoRepisa);
            this.TV_NoPrestamo = (TextView) itemView.findViewById(R.id.CV_TV_NoPrestamo);
            this.TV_NoVendidos = (TextView) itemView.findViewById(R.id.CV_TV_NoVendidos);
            this.BTN_Prestamo  = (Button) itemView.findViewById(R.id.CV_BTN_Prestamo);
            this.BTN_Compra    = (Button) itemView.findViewById(R.id.CV_BTN_Compra);

            this.BTN_Prestamo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Toast.makeText(activity, TV_Autor.getText(), Toast.LENGTH_LONG).show();
                    int repisa = Integer.valueOf(TV_NoRepisa.getText().toString());

                    if (repisa < 1) {
                        Toast.makeText(activity, "Ya no hay libros disponibles", Toast.LENGTH_LONG).show();
                    }else{
                        int prestamo = Integer.valueOf(TV_NoPrestamo.getText().toString());

                        prestamo++;
                        repisa--;

                        TV_NoRepisa.setText(String.valueOf(repisa));
                        TV_NoPrestamo.setText(String.valueOf(prestamo));
                        Toast.makeText(activity, "Prestado: " + TV_Titulo.getText().toString(), Toast.LENGTH_LONG).show();
                    }

                }
            });

            this.BTN_Compra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int repisa = Integer.valueOf(TV_NoRepisa.getText().toString());

                    if (repisa < 1) {
                        Toast.makeText(activity, "Ya no hay libros disponibles", Toast.LENGTH_LONG).show();
                    }else{
                        int venta = Integer.valueOf(TV_NoVendidos.getText().toString());

                        venta++;
                        repisa--;

                        TV_NoRepisa.setText(String.valueOf(repisa));
                        TV_NoVendidos.setText(String.valueOf(venta));
                        Toast.makeText(activity, "Vendido: " + TV_Titulo.getText().toString(), Toast.LENGTH_LONG).show();
                    }

                }
            });
        }



    }
}
