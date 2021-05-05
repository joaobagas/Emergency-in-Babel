package com.joaob.emergencyinbabel.ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.ui.viewmodel.LanguagesViewModel;

public class LanguagesFragment extends Fragment {

    private LanguagesViewModel languagesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        languagesViewModel = new ViewModelProvider(this).get(LanguagesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_languages, container, false);
        languagesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}