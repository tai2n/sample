package com.mamezou.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class UISampleActivity extends Activity implements OnClickListener, OnKeyListener{
    /** Called when the activity is first created. */
	public EditText edit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EditText
        edit = new EditText(this);
        edit.setText("sample");
        edit.setOnKeyListener(this);
        // RadioButton
        RadioGroup group = new RadioGroup(this);
        RadioButton radio1 = new RadioButton(this);
        radio1.setText("Radio1");
        group.addView(radio1);
        RadioButton radio2 = new RadioButton(this);
        radio2.setText("Radio2");
        group.addView(radio2);
        // ToggleButton
        ToggleButton toggle = new ToggleButton(this);
        // CheckBox
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText("Check");
        // SeekBar
        SeekBar seekBar = new SeekBar(this);
        // Spinner
        Spinner spinner = new Spinner(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("Red");
        adapter.add("Green");
        adapter.add("Blue");
        spinner.setAdapter(adapter);
        // Button
        Button button = new Button(this);
        button.setText("Button");
        button.setOnClickListener(this);
        // Layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
        layout.addView(edit);
        layout.addView(group);
        layout.addView(toggle);
        layout.addView(checkBox);
        layout.addView(seekBar);
        layout.addView(spinner);       
        layout.addView(button);
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		edit.setText("pushed");
	}
	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_ENTER){
		return true;
		}
		return false;
	}
}
