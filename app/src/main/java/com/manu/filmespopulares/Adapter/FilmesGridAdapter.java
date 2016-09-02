package com.manu.filmespopulares.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.manu.filmespopulares.Models.Filme;
import com.manu.filmespopulares.R;

import java.util.List;

/**
 * Created by emanu on 02/09/2016.
 */
public class FilmesGridAdapter extends ArrayAdapter<Filme> {


    public FilmesGridAdapter(Activity context, List<Filme> listaGridFilmes) {

        super(context, 0, listaGridFilmes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Filme filme = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_grid_filme, parent, false);
        }

        ImageView iconView = (ImageView) convertView.findViewById(R.id.filme_image);
        iconView.setImageResource(filme.getImage());

        TextView tituloFilme = (TextView) convertView.findViewById(R.id.filme_titulo);
        tituloFilme.setText(filme.getTituloFilme() + " - " + filme.getSinopseFilme());

        return convertView;
    }
}
