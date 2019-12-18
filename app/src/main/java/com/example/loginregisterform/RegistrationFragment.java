package com.example.loginregisterform;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.loginregisterform.R;

import java.util.List;

public class RegistrationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.register_fragment, container, false);

        Button logIn = vg.findViewById(R.id.log_in);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideAllFragments();
                List<Fragment> lf = getFragmentManager().getFragments();
                getFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_in, R.anim.fragment_out).show(lf.get(0)).commit();
            }
        });

        return vg;
    }

    private void hideAllFragments(){
        for(Fragment f : getFragmentManager().getFragments()){
            getFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_in, R.anim.fragment_out).hide(f).commit();
        }
    }
}
