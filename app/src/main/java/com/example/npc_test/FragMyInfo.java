package com.example.npc_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragMyInfo extends Fragment {
    private View view;

    public static FragMyInfo newinstant() {
        FragMyInfo fragMyInfo = new FragMyInfo();
        return fragMyInfo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_myinfo, container, false);

        return view;
    }
}
