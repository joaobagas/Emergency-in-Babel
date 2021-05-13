package com.joaob.emergencyinbabel.ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.joaob.emergencyinbabel.R;
import com.joaob.emergencyinbabel.data.domain.Language;
import com.joaob.emergencyinbabel.ui.list.LanguageListAdapter;
import com.joaob.emergencyinbabel.ui.viewmodel.LanguagesViewModel;

import java.util.ArrayList;

import io.reactivex.schedulers.Schedulers;

public class LanguagesFragment extends Fragment implements LanguageListAdapter.OnListItemClickListener {
    private LanguagesViewModel languagesViewModel;
    private RecyclerView languageRecyclerView;
    private LanguageListAdapter languageListAdapter;
    private ArrayList<Language> languages;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        languagesViewModel = new ViewModelProvider(this).get(LanguagesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_languages, container, false);

        languages = (ArrayList<Language>) languagesViewModel.getLanguages().blockingFirst();

        languageRecyclerView = (RecyclerView) root.findViewById(R.id.language_rv);
        languageRecyclerView.hasFixedSize();
        languageRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        languageListAdapter = new LanguageListAdapter(languages, this);
        languageRecyclerView.setAdapter(languageListAdapter);

        return root;
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Toast.makeText(getContext().getApplicationContext(), "Test language", Toast.LENGTH_SHORT).show();
    }
}