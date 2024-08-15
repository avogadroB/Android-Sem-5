package com.example.ishab_calc1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editTextNum1, editTextNum2;
    Button addButton;
    TextView anstextView;
    int num1, num2;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextNum1 = findViewById(R.id.TextNum1);
        editTextNum2 = findViewById(R.id.TextNum2);
        addButton = findViewById(R.id.Addbutton);
        anstextView = findViewById(R.id.ansText);
        addButton.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {
        num1=Integer.parseInt(editTextNum1.getText().toString());
        num2=Integer.parseInt(editTextNum2.getText().toString());
        anstextView.setText("Answer is: "+ (num1+num2));
    }
}