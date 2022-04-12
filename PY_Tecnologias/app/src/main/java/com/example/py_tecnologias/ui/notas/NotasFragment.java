package com.example.py_tecnologias.ui.notas;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.py_tecnologias.R;

public class NotasFragment extends Fragment {

    private NotasViewModel mViewModel;

    public static NotasFragment newInstance() {
        return new NotasFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cursos, container, false);

        return root;
    }

}