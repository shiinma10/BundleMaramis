package com.example.bundlemaramis;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSkill extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama, txtAsalsekolah,txtKompetensi;


    public FragmentSkill() {
        // Required empty public constructor
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainya=(Pegawai) bundle.getSerializable("bungkus3");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_skill, container, false);
        txtNama = (TextView)view.findViewById(R.id.txt_namaskill);
        txtAsalsekolah = (TextView)view.findViewById(R.id.txt_asalsekolah);
        txtKompetensi = (TextView)view.findViewById(R.id.txt_kompetensi);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtAsalsekolah.setText(pegawainya.getAsalsekolah());
        txtKompetensi.setText(pegawainya.getKompetensi());
    }

}
