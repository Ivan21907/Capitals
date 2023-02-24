package cat.dam.ivan.capitals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomRecyclerView extends RecyclerView.Adapter<ViewHolder>{
    //Aquesta classe és el nostre adaptador, és a dir, el que ens permetrà mostrar les dades
    //Members
    private final ArrayList<Country> dataSet;

    //Constructor, aquí passem els ítems que mostrarem, és a dir, el model de dades
    public CustomRecyclerView(Context context, ArrayList<Country> dataSet) {
        this.dataSet = dataSet;
    }

    //Mètode que només es crida la primera vegada en crear la llista
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Creem la vista de cada ítem a partir del nostre layout
        Context context= parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(context, view);
    }

    //Es crida cada vegada que es fa scroll a la pantalla i els elements desapareixen i apareixen
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        //Donem valor als views de cada card mitjançant el ViewHolder
        final Country item = dataSet.get(position);
        viewHolder.getNom().setText(item.getName());
        viewHolder.getCode().setText(item.getCode());
        viewHolder.getCapital().setText(item.getCapital());
        viewHolder.getLatitud().setText(String.valueOf(item.getLatitude()));
        viewHolder.getLongitud().setText(String.valueOf(item.getLongitude()));
        viewHolder.getImage().setImageResource(item.getImageResourceID());
    }

    // Torna el nombre d'ítems del nostre arraylist, l'invoca automàticament el layout manager
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
