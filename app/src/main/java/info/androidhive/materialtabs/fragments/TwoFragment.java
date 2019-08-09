package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.Lingkaran;
import info.androidhive.materialtabs.Persegi;
import info.androidhive.materialtabs.activity.PersegiPanjang;
import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Segitiga;


public class TwoFragment extends Fragment{
    Button btnsegitiga;
    Button btnpersegipanjang;
    Button btnPersegi;
    Button btnlingkaran;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        btnsegitiga = (Button) view.findViewById(R.id.btnsegitiga);
        btnpersegipanjang = (Button) view.findViewById(R.id.btnpersegipanjang);
        btnPersegi = (Button) view.findViewById(R.id.btnPersegi);
        btnlingkaran = (Button) view.findViewById(R.id.btnlingkaran);

        // Inflate the layout for this fragment

        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Segitiga.class);
                startActivity(in);
            }
        });

        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(in);
            }
        });

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Persegi.class);
                startActivity(in);
            }
        });

        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Lingkaran.class);
                startActivity(in);
            }
        });


        return view;
    }

}
