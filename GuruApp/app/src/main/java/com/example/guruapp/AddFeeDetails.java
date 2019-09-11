package com.example.guruapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import GuruApp.DBHandlerFeeManagement;

public class AddFeeDetails extends Fragment {

//        //toast message-------------------------------
//
//            super.onCreate(savedInstanceState);
//
//            Context context =  getApplicationContext();
//            CharSequence text = "Hello toast!";
//            int duration = Toast.LENGTH_SHORT;
//            Toast toast = Toast.makeText(context, text,
//                    duration); toast.show();

        EditText userID,userName, month,amount;
        Spinner spinner1;
        String userIDUI, userNameUI,monthUI,amountUI;
        DBHandlerFeeManagement db;

        Button btnSave;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.add_fee_details,container,false);

        String [] values =
                {"Full","Half","Free",};
        Spinner spinner = (Spinner) v.findViewById(R.id.addSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);


        userID = v.findViewById(R.id.editText);
        userName = v.findViewById(R.id.editText2);
        month = v.findViewById(R.id.editText3);
        amount = v.findViewById(R.id.editText4);
        spinner1 = v.findViewById(R.id.addSpinner);
        db = new DBHandlerFeeManagement(this.getActivity());

//        btnSave = v.findViewById(R.id.btnSave);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                userIDUI = userNameUI.getText().toString();
//
//            }
//        });





        return v;





    }

}
