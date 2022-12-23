
package com.example.lab3;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.txtResult);
        value = findViewById(R.id.txtValue);



    }
    private void updateValue(String strToAdd) {
        String oldStr = value.getText().toString();
        value.setText(String.format("%s%s",oldStr,strToAdd));


    }
    public void btn0push(View view) {

        updateValue(getResources().getString(R.string.zero));

    }
    public void btn1push(View view) {

        updateValue(getResources().getString(R.string.one));
    }
    public void btn2push(View view) {

        updateValue(getResources().getString(R.string.two));

    }
    public void btn3push(View view) {

        updateValue(getResources().getString(R.string.three));

    }
    public void btn4push(View view) {

        updateValue(getResources().getString(R.string.four));

    }
    public void btn5push(View view) {

        updateValue(getResources().getString(R.string.five));

    }public void btn6push(View view) {

        updateValue(getResources().getString(R.string.six));

    }public void btn7push(View view) {

        updateValue(getResources().getString(R.string.seven));

    }
    public void btn8push(View view) {

        updateValue(getResources().getString(R.string.eight));

    }
    public void btn9push(View view) {

        updateValue(getResources().getString(R.string.nine));

    }
    public void btnDotPush(View view) {

        updateValue(getResources().getString(R.string.dot));

    }
    public void btnMultiplyPush(View view) {

        updateValue(getResources().getString(R.string.multiply));

    }
    public void btnSubtractPush(View view) {

        updateValue(getResources().getString(R.string.subtract));

    }
    public void btnDividePush(View view) {

        updateValue(getResources().getString(R.string.divide));

    }
    public void btnSumPush(View view) {

        updateValue(getResources().getString(R.string.sum));

    }
    public void btnRootPush(View view) {

        updateValue(getResources().getString(R.string.root));

    }
    public void btnClearPush(View view) {

        value.setText("");

    }

    public void btnEqualPush(View view) {
        String UserExp = value.getText().toString();
        UserExp = UserExp.replaceAll("x","*");
        Expression exp = new Expression(UserExp);
        String equal = String.valueOf(exp.calculate());
        result.setText(equal);



        }


    public void btnBackPush(View view) {
        int textSelect = value.getSelectionStart();
        int textLen = value.getText().length();

        if(textSelect != 0 && textLen != 0) {

            SpannableStringBuilder selection = (SpannableStringBuilder) value.getText();
            selection.replace(textSelect-1,textSelect," ");
            value.setText(selection);
            value.setSelection(textSelect-1);

        }



    }










    }



