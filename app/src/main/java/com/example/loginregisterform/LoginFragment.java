package com.example.loginregisterform;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.login_fragment, container, false);
        Button createAccount = vg.findViewById(R.id.log_in);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideAllFragments();
                List<Fragment> lf = getFragmentManager().getFragments();
                getFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_in, R.anim.fragment_out).show(lf.get(1)).commit();
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
