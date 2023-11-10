package com.example.menuandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) this.findViewById(R.id.bouton);
        registerForContextMenu(b);
    }
    
    
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.detail_menu, menu);
		return true;
	};
    
    
    public void onCreateContextMenu(ContextMenu menu, View element,
    		ContextMenuInfo info) {
    	MenuInflater inflater = getMenuInflater();    	
    	if(element.getId()==R.id.bouton)
    	inflater.inflate(R.menu.menu_contextuel, menu);
    	}

}


