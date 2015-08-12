package com.example.gs_project;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tantrik extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle saveInstanceState) {
		super.onCreateView(inflater, container, saveInstanceState);
		View v = inflater.inflate(R.layout.tantrik, container, false);
		return v;
	}
}
