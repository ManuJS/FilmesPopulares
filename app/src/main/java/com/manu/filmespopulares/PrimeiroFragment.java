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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emanu on 31/08/2016.
 */
public class PrimeiroFragment extends Fragment {
    ListView listView;

    String[] tituloFilmes = {"Esquadrao suicida", "Batman vs Superman"};
    String[] sinopseFilmes = {"sinopse1", "Sinopse2"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);
        ArrayAdapter<String> mForecastAdapter;

        String[] data = {

                "Hoje - Doming - 29º ",
                "Segunda - feira - 29º",
                "Terça - feira - 30º",
                "Quarta - feira - 31º",
                "Quinta - feira - 28º",
                "Sexta - feira - 27º",
                "Sábado - 15º"

        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.item_filme, // The name of the layout ID.
                        R.id.filme_titulo, // The ID of the textview to populate.
                        weekForecast);

        listView = (ListView) rootView.findViewById(R.id.listview_filmes);
        listView.setAdapter(mForecastAdapter);

        return rootView;

    }



}
