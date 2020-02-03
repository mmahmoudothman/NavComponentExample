package com.example.navcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

public class RestartFragment extends Fragment {

    public RestartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restart, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.restartGameBtn);
        final NavController navController = Navigation.findNavController(view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish the cycle 
                NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.strartFragment, true).build();
                navController.navigate(R.id.action_thirdFragment_to_strartFragment, null, navOptions);
            }

        });
    }
}
