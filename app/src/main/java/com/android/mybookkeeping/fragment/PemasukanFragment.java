package com.android.mybookkeeping.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.android.mybookkeeping.R;

import java.util.Calendar;

public class PemasukanFragment extends Fragment {

    EditText editDate, editJumlah, editKeterangan;
    Spinner spinner;
    Button simpanBtn;

    public PemasukanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pemasukan, container, false);

        editDate = view.findViewById(R.id.editTextDate);

        Calendar calendar = Calendar.getInstance();

        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        PemasukanFragment.this.getContext(), (DatePickerDialog.OnDateSetListener) (view1, year1, month1, day1) -> {
                    month1 = month1 + 1;
                    String date = day1 + "/" + month1 + "/" + year1;
                    editDate.setText(date);
                }, year, month, day);
                datePickerDialog.show();
                ;
            }
        });

        spinner = view.findViewById(R.id.kategoriInput);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(PemasukanFragment.this.getContext(), R.array.spinnerPemasukan, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        editJumlah = view.findViewById(R.id.editTextNumberDecimal);
        editKeterangan = view.findViewById(R.id.keteranganInput);

        simpanBtn = view.findViewById(R.id.simpanButton);

        return view;
    }
}