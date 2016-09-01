package com.manu.filmespopulares;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.manu.filmespopulares.outros.Filme;
import com.manu.filmespopulares.outros.FilmesAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emanu on 31/08/2016.
 */
public class PrimeiroFragment extends Fragment {
    ListView listView;

//    String[] tituloFilmes = {"Esquadrao suicida", "Batman vs Superman"};
//    String[] sinopseFilmes = {"sinopse1", "Sinopse2"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        ArrayList<Filme> filmeLista = GetFilmesLista();

        listView = (ListView) rootView.findViewById(R.id.listview_filmes);
        listView.setAdapter(new FilmesAdapter(getActivity(), filmeLista));

//        ArrayAdapter<String> mForecastAdapter;
//        ArrayAdapter<String> mSinopseFilme;

//        List<String> sinopseFilme =  new ArrayList<String>(Arrays.asList(sinopseFilmes));
//
//        List<String> tituloFilme = new ArrayList<String>(Arrays.asList(tituloFilmes));

//        mForecastAdapter =
//                new ArrayAdapter<String>(
//                        getActivity(), // The current context (this activity)
//                        R.layout.item_filme, // The name of the layout ID.
//                        R.id.filme_titulo, // The ID of the textview to populate.
//                        tituloFilme);
//
//        mSinopseFilme = new ArrayAdapter<String>(getActivity(), // The current context (this activity)
//                R.layout.item_filme, // The name of the layout ID.
//                R.id.filme_sinopse, // The ID of the textview to populate.
//                sinopseFilme);


        return rootView;

    }
    private ArrayList<Filme> GetFilmesLista(){
        ArrayList<Filme> listaFilmes = new ArrayList<Filme>();

        Filme filme = new Filme();

        filme.setTituloFilme("Esquadrao Suicida");
        filme.setSinopseFilme("Grupo de bandidos soltos para uma missao");
        listaFilmes.add(filme);

        filme = new Filme();
        filme.setTituloFilme("Batman vs Superman");
        filme.setSinopseFilme("Lex lutor bola um plano pra destruir os filhos de kripton");
        listaFilmes.add(filme);

        filme = new Filme();
        filme.setTituloFilme("Jogada de mestre 2");
        filme.setSinopseFilme("Grupo de magicos escolhidos a dedo para um assalto");
        listaFilmes.add(filme);

        return listaFilmes;
    }


}
