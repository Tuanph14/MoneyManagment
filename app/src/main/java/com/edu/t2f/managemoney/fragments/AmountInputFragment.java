package com.edu.t2f.managemoney.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edu.t2f.managemoney.R;
import com.edu.t2f.managemoney.model.Action;
import com.edu.t2f.managemoney.views.AmountInputView;

public class AmountInputFragment extends Fragment {

    private InputCallback inputCallback;
    private AmountInputView amountInputView;

    public interface InputCallback {
        void onInput(Action action);
    }

    public AmountInputFragment() {}

    public AmountInputFragment withInputCallback(InputCallback inputCallback) {
        this.inputCallback = inputCallback;
        return this;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstance) {
        View view = layoutInflater.inflate(R.layout.fragment_amount_input, viewGroup, false);
        //assign the view and set the callback info
        amountInputView = (AmountInputView) view.findViewById(R.id.amountInputView);
        if(inputCallback != null) amountInputView.setOnActionListener(inputCallback);
        return view;
    }

}
