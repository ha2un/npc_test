package com.example.npc_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragCommunity extends Fragment {
    private View view;

    public static FragCommunity newinstant() {
        FragCommunity fragCommunity = new FragCommunity();
        return fragCommunity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_community, container, false);

        return view;
    }
}
