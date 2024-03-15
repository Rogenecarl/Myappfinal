package com.example.myappfinals;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private Button button;
    public CardView tiktok, cardspotify, game1, game2;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CardView tiktok = view.findViewById(R.id.tiktok);
        tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openTIktok();}
        });

        CardView cardspotify = view.findViewById(R.id.cardspotify);
        cardspotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openSpotify();}
        });

        CardView game1 = view.findViewById(R.id.game1);
        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {opengtav();}
        });

        CardView game2 = view.findViewById(R.id.game2);
        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openspf();}
        });

        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextButton();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void openNextButton(){
        Intent intent = new Intent(getActivity(), NextButton.class);
        startActivity(intent);
    }

    public void openTIktok(){
        Intent intent = new Intent(getActivity(), TIktok.class);
        startActivity(intent);
    }

    public void openSpotify(){
        Intent intent = new Intent(getActivity(), Spotify.class);
        startActivity(intent);
    }

    public void opengtav(){
        Intent intent = new Intent(getActivity(), gtav.class);
        startActivity(intent);
    }

    public void openspf(){
        Intent intent = new Intent(getActivity(), spf.class);
        startActivity(intent);
    }



}