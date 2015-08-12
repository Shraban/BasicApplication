package com.example.gs_project;

import android.R.anim;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
				
				Tantrik t = new Tantrik();
				Bundle b = new Bundle();
				b.putInt("index", 1);
				t.setArguments(b);
				getFragmentManager().beginTransaction().replace(R.id.container, t).addToBackStack("f2").commit();
				
				/*Fragment fragment2 = new Tantrik();
		        FragmentManager fm = getFragmentManager();
		        FragmentTransaction transaction = fm.beginTransaction();
		        transaction.replace(R.id.button1, fragment2);
		        transaction.commit();*/
				
				/*FragmentManager fm = getFragmentManager();
		        FragmentTransaction ft = fm.beginTransaction();

		        Tantrik llf = new Tantrik();
		        ft.replace(R.id.button1, llf);
		        ft.commit();
				
				
				Tantrik t = new Tantrik();
				FragmentTransaction tr = getFragmentManager().beginTransaction();
				tr.replace(android.R.id.content, t);
				tr.addToBackStack(null);
				tr.commit();*/
				
				/*FragmentTransaction t = getActivity().getFragmentManager().beginTransaction();
		        Fragment mFrag = new Tantrik();
		        t.replace(android.R.id.content, mFrag);
		        t.commit();*/
				/*getFragmentManager().beginTransaction()
				.add(android.R.id.content, new Tantrik()).commit();*/
				
				/*getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new Tantrik())
                .commit();*/
				
				/*Fragment fragment = new Tantrik();
				FragmentManager fragmentManager = getActivity().getFragmentManager();
				FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		        fragmentTransaction.replace(R.layo, fragment);
		        fragmentTransaction.addToBackStack(null);
		        fragmentTransaction.commit();*/
				
			}
		});
		button2 = (Button) v.findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button3 = (Button) v.findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button4 = (Button) v.findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button5 = (Button) v.findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		

		
		return v;
	}
	

}
	