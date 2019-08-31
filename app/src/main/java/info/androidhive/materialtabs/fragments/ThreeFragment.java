package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import info.androidhive.materialtabs.Adapter;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.Bangun;
import info.androidhive.materialtabs.activity.BangunRuang;
import info.androidhive.materialtabs.activity.MainActivity;
import info.androidhive.materialtabs.activity.Segitiga;


public class ThreeFragment<BangunRuangArraylist> extends Fragment{
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<BangunRuang> BangunRuangArraylist;
    private String[]name={
            "KUBUS",
            "BALOK",
            "TABUNG",
            "KERUCUT"


    };
    private int[]photo={
            R.drawable.beam,
            R.drawable.cone,
            R.drawable.cube,
            R.drawable.tabung,
    };

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        addData();

        recyclerView = view.findViewById(R.id.recycler_view);

        adapter = new Adapter(BangunRuangArraylist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


        return view;
    }

    void addData(){
        BangunRuangArraylist = new ArrayList<>();
        BangunRuangArraylist.add(new BangunRuang("Kubus", "Volume atau isi kubus V= sisi x sisi x sisi atau V= s x s x s.", "Luas : 6xS"));
        BangunRuangArraylist.add(new BangunRuang("Balok", "Volume balok V = Panjang x lebar x tinggi atau V = p x l x t.", "Luas :(2 x p x l) + (2 x p x t) + (2 x l x t)"));
        BangunRuangArraylist.add(new BangunRuang("Prisma Segitiga", "Luas permukaannya = keliling alas segitiga x tinggi + (2 x luas alas segitiga).", "Volume prisma segitiga V= Luas alas segitiga x tinggi"));
        BangunRuangArraylist.add(new BangunRuang("Limas Segiempat", "Luas permukaannya luas permukaan limas segiempat = luas alas + luas selubung limas.", "Volume limas V = 1/3 x luas alas x tinggi atau V = 1/3 x p x l x t."));




        }



    }


