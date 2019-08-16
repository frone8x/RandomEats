package com.example.randomeats;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShuffleFragment extends Fragment {
    private static final String TAG = "ShuffleFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.shuffle_fragment, container, false);

//        return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
