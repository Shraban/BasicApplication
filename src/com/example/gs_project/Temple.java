package com.example.gs_project;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Temple extends Fragment{
	
	private Button button1 ,button2 ,button3 ,button4 , button5;
	
	@Override
	public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle saveInstanceState) {
		super.onCreateView(inflater, container, saveInstanceState);
		View v = inflater.inflate(R.layout.temple, container, false);
		
		button1 = (Button) v.findViewById(R.id.button1);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		return v;
	}
	

}
	