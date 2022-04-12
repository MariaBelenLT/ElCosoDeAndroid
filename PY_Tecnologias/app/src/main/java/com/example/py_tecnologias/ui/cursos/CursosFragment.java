package com.example.py_tecnologias.ui.cursos;

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

import com.example.py_tecnologias.R;
import com.example.py_tecnologias.databinding.FragmentGalleryBinding;
import com.example.py_tecnologias.ui.gallery.GalleryViewModel;

public class CursosFragment extends Fragment {

    public static CursosFragment newInstance() {
        return new CursosFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cursos, container, false);

        return root;
    }

}