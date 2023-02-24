package cat.dam.ivan.capitals;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    //El ViewModel fa de pont amb els Views de la interficie gràfica
    //Members
    private TextView nom, code, capital, latitud, longitud;
    private ImageView image;
    private Context context;

    public ViewHolder(Context parent, View itemView) {
        super(itemView);
        nom =  itemView.findViewById(R.id.tv_country_nom);
        code =  itemView.findViewById(R.id.tv_country_inicials);
        capital =  itemView.findViewById(R.id.tv_country_capital);
        latitud = itemView.findViewById(R.id.tv_country_latitud);
        longitud = itemView.findViewById(R.id.tv_country_longitud);
        image = itemView.findViewById(R.id.iv_item_image);
        context = parent;
        // Defineix clic listener per els elements de la llista
        itemView.setOnClickListener(this);
    }

    //Getters


    public TextView getNom() {
        return nom;
    }

    public TextView getCode() {
        return code;
    }

    public TextView getCapital() {
        return capital;
    }

    public TextView getLatitud() {
        return latitud;
    }

    public TextView getLongitud() {
        return longitud;
    }

    public ImageView getImage() {
        return image;
    }

    @Override
    public void onClick(View view) {
        //Podem propagar l'esdeveniment a la MainActivity gràcies al context
        //així podem gestionar el click al punt que vulguem de la nostra aplicació
        MainActivity mainActivity = (MainActivity) context;
        mainActivity.itemClick(view, getAdapterPosition());
    }
}
