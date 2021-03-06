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
import androidx.navigation.Navigation;


public class StartFragment extends Fragment {


    public StartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.startGameBtn);
        final NavController navController= Navigation.findNavController(view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                StartFragmentDirections.ActionStrartFragmentToSecondFragment action = StartFragmentDirections.actionStrartFragmentToSecondFragment();
//                navController.navigate(R.id.action_strartFragment_to_secondFragment);
                User user= new User(26,"Mahmoud Osman");
                StartFragmentDirections.ActionStrartFragmentToSecondFragment action = StartFragmentDirections.actionStrartFragmentToSecondFragment(user);
                action.setMessage("this is some message....");
                navController.navigate(action);

            }
        });
    }
}
