package com.example.testingandroidapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;


public class ToastTestFragment extends Fragment {

    View parent;
//    View layouttoast;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            parent = inflater.inflate(R.layout.fragment_toast_test, container, false);
        //layouttoast.findViewById(R.id.imagetoast)).setBackgroundResource(R.drawable.icon);







        parent.findViewById(R.id.btnTestFrag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast.makeText(getActivity(),"HEllo",R.style.mytoast).show();
                System.out.println("KKKKKK");
            }
        });

        return inflater.inflate(R.layout.fragment_toast_test, container, false);
    }


//    public void showToast(){
//        Toast mytoast = new Toast(parent.getContext());
//        mytoast.setView(layouttoast);
//        mytoast.setDuration(Toast.LENGTH_LONG);
//        mytoast.show();
//    }

//    public void showToast(View v) {
////        StyleableToast.makeText(this, "Hello World!", R.style.mytoast).show();
////        StyleableToast.makeText(this,"HEllo",R.style.mytoast).show();
//    }

}
