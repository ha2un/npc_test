package com.example.npc_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragTrashInfo extends Fragment {
    private View view;

    public static FragTrashInfo newinstant() {
        FragTrashInfo fragTrashInfo = new FragTrashInfo();
        return fragTrashInfo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_trashinfo, container, false);

        return view;
    }
}
