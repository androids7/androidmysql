package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		setTheme(android.R.style.Theme_Material_Light);
	
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

		actionbar=getActionBar();
		
		actionbar.setSubtitle("action");
        setContentView(R.layout.main);
		
		
		/*
		AlertDialog.Builder dialog=new AlertDialog.Builder(this);
		
		dialog.setTitle("列表对话框");
		final String[] args={"a","b","c"};
		dialog.setItems(args,new DialogInterface.OnClickListener()
		{
		public void	onClick(DialogInterface di,int it)
			{
				Toast.makeText(getBaseContext(),args[it],0).show();
			}
		});
		
		dialog.show();
		*/
		
		
		
		ProgressDialog dialog=new ProgressDialog(this);
		dialog.show();
    }
}
