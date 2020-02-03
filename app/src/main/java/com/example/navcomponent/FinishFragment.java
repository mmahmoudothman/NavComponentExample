package com.example.navcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.content.ContentValues.TAG;


public class FinishFragment extends Fragment {

    public FinishFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_finish, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.finishGameBtn);
        final NavController navController= Navigation.findNavController(view);

        if (getArguments()!=null)
        {
            FinishFragmentArgs args=FinishFragmentArgs.fromBundle(getArguments());
            String message= args.getMessage();
            Log.i(TAG, "onViewCreated: "+message);
            User user= args.getUser();
            Log.i(TAG, "onViewCreated: "+user.getUsername());
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_secondFragment_to_thirdFragment);
            }
        });
    }

}
