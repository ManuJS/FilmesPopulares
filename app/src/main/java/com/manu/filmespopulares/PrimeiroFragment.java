package com.manu.filmespopulares;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.manu.filmespopulares.Adapter.FilmesGridAdapter;
import com.manu.filmespopulares.AsynkTask.ListadeFilmesAsynkTask;
import com.manu.filmespopulares.Models.Filme;
import com.manu.filmespopulares.Adapter.FilmesAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by emanu on 31/08/2016.
 */
public class PrimeiroFragment extends Fragment {
    ListView listView;

    private FilmesGridAdapter filmesGridAdapter;

    Filme[] listadeFilmes = {
            new Filme("Esquadrao Suicida", "Grupo de bandidos soltos para uma missao", R.drawable.cupcake),
            new Filme("Batman vs Superman", "Lex lutor bola um plano pra destruir os filhos de kripton", R.drawable.donut),
            new Filme("Jogada de Mestre", "Grupo de magicos escolhidos a dedo para um assalto", R.drawable.eclair),
            new Filme("4 vidas e 1 cachorro", "Cão que reencarna até encontrar seu dono", R.drawable.froyo),


    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new ListadeFilmesAsynkTask().execute();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout_2, container, false);


        filmesGridAdapter = new FilmesGridAdapter(getActivity(), Arrays.asList(listadeFilmes));

        GridView gridView = (GridView) rootView.findViewById(R.id.flavors_grid);
        gridView.setAdapter(filmesGridAdapter);

        return rootView;

    }


}
