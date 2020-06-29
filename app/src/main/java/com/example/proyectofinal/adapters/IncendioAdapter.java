package com.example.proyectofinal.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinal.R;
import com.example.proyectofinal.models.Incendio;

import java.util.ArrayList;

public class IncendioAdapter extends RecyclerView.Adapter <IncendioAdapter.ViewHolder> {

    private int resource;
    private ArrayList<Incendio> incendiosList;


    public IncendioAdapter(ArrayList<Incendio> incendiosList, int resource) {
        this.incendiosList = incendiosList;
        this.resource = resource;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Incendio incendio =  incendiosList.get(position);

        holder.textViewIncendio.setText(incendio.getUsuario());
    }

    @Override
    public int getItemCount() {
        return incendiosList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       private TextView textViewIncendio;

       public View view;
       public  ViewHolder(View view){
           super(view);

           this.view = view;
           this.textViewIncendio = (TextView) view.findViewById(R.id.txtIncendio);
       }
   }
}
