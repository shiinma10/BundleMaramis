package com.example.bundlemaramis;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabFragmentAdapter extends FragmentPagerAdapter {
    String[]judul=new String[]{"Personal", "Job", "Skill"};
    Pegawai objPegawai;

    public TabFragmentAdapter(FragmentManager fm,Pegawai objPegawai) {
        super(fm);
        this.objPegawai =objPegawai;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Fragment fragmentPersonal = new FragmentPersonal();
                Bundle bungkus = new Bundle();
                bungkus.putSerializable("bungkus1", objPegawai);
                fragmentPersonal.setArguments(bungkus);
                return  fragmentPersonal;
            case 1:
                Fragment fragmentJob = new FragmentJob();
                Bundle bungkus2 = new Bundle();
                bungkus2.putSerializable("bungkus2", objPegawai);
                fragmentJob.setArguments(bungkus2);
                return fragmentJob;
            case 2:
                Fragment fragmentSkill = new FragmentSkill();
                Bundle bungkus3 = new Bundle();
                bungkus3.putSerializable("bungkus3", objPegawai);
                fragmentSkill.setArguments(bungkus3);
                return fragmentSkill;
        }
        return null;
    }

    @Override
    public int getCount() {

        return judul.length;
    }
    @Nullable
    @Override
    public  CharSequence getPageTitle(int position) {
        return judul[position];
    }
}
