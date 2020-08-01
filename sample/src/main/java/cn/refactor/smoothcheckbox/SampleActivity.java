package cn.refactor.smoothcheckbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.refactor.library.SmoothCheckBox;

public class SampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        final SmoothCheckBox scb1 = findViewById(R.id.scb1);
        scb1.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox checkBox, boolean isChecked) {
                Log.d("SmoothCheckBox", String.valueOf(isChecked));
            }
        });

        View layoutScb2 = findViewById(R.id.layout_scb2);
        final SmoothCheckBox scb2 = findViewById(R.id.scb2);
        Button btnToggle = findViewById(R.id.btn_toggle);
        layoutScb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scb2.setChecked(!scb2.isChecked(),true);
            }
        });
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scb2.setChecked(!scb2.isChecked(),true);
            }
        });
    }

}
