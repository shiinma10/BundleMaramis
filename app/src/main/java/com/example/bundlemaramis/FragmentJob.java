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
public class FragmentJob extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama, txtPekerjaan,txtLamaKerja;


    public FragmentJob() {
        // Required empty public constructor
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainya=(Pegawai) bundle.getSerializable("bungkus2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_job, container, false);
        txtNama = (TextView)view.findViewById(R.id.txt_namajob);
        txtPekerjaan = (TextView)view.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja = (TextView)view.findViewById(R.id.txt_lamakerja);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtPekerjaan.setText(pegawainya.getLamakerja());
        txtLamaKerja.setText(pegawainya.getLamakerja());
    }

}
