package ma.enset.calculatrice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView smallResultTextView, mainResultTextView;
    MaterialButton clearButton, openBracketButton, closeBracketButton;
    MaterialButton divideButton, multiplyButton, addButton, subtractButton, equalsButton;
    MaterialButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton;
    MaterialButton factorialButton, sqrtButton, powerButton, logButton, naturalLogButton, sinButton, cosButton, tanButton, piButton, eButton, ansButton, inverseButton, radButton, degButton;
    MaterialButton allClearButton, dotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            smallResultTextView = findViewById(R.id.result_small);
            mainResultTextView = findViewById(R.id.result_tv);

            assignId(clearButton, R.id.button_c);
            assignId(openBracketButton, R.id.button_open_bracket);
            assignId(closeBracketButton, R.id.button_closed_bracket);
            assignId(divideButton, R.id.button_div);
            assignId(multiplyButton, R.id.button_mult);
            assignId(addButton, R.id.button_plus);
            assignId(subtractButton, R.id.button_min);
            assignId(equalsButton, R.id.button_eq);

            assignId(allClearButton, R.id.button_ac);
            assignId(dotButton, R.id.button_dot);

            assignId(zeroButton, R.id.button_0);
            assignId(oneButton, R.id.button_1);
            assignId(twoButton, R.id.button_2);
            assignId(threeButton, R.id.button_3);
            assignId(fourButton, R.id.button_4);
            assignId(fiveButton, R.id.button_5);
            assignId(sixButton, R.id.button_6);
            assignId(sevenButton, R.id.button_7);
            assignId(eightButton, R.id.button_8);
            assignId(nineButton, R.id.button_9);

            //Test if orientation changed
            if (savedInstanceState != null) {
                assignId(sqrtButton, R.id.button_sqrt);
                assignId(factorialButton, R.id.button_fac);
                assignId(powerButton, R.id.button_pow);
                assignId(logButton, R.id.button_log);
                assignId(naturalLogButton, R.id.button_ln);
                assignId(sinButton, R.id.button_sin);
                assignId(cosButton, R.id.button_cos);
                assignId(tanButton, R.id.button_tan);
                assignId(piButton, R.id.button_pi);
                assignId(eButton, R.id.button_e);
                assignId(ansButton, R.id.button_ans);
                assignId(inverseButton, R.id.button_inv);
                assignId(radButton, R.id.button_rad);
                assignId(degButton, R.id.button_deg);
            }
        }//Assigning Ids block
        if (savedInstanceState != null) {
            String solution = savedInstanceState.getString("solution");
            mainResultTextView.setText(solution);
            String result = savedInstanceState.getString("result");
            smallResultTextView.setText(result);
            savedInstanceState.clear();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("solution", mainResultTextView.getText().toString());
        outState.putString("result", smallResultTextView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String solution = savedInstanceState.getString("solution");
        mainResultTextView.setText(solution);
        String result = savedInstanceState.getString("result");
        smallResultTextView.setText(result);
    }

    void assignId(MaterialButton button, int id) {
        button = findViewById(id);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = mainResultTextView.getText().toString();

        if (dataToCalculate.startsWith("0")) dataToCalculate = dataToCalculate.substring(1);

        if (buttonText.equals("AC")) {
            mainResultTextView.setText("");
            smallResultTextView.setText("0");
            return;
        }
        if (buttonText.equals("=")) {
            mainResultTextView.setText(smallResultTextView.getText());
            return;
        }
        if (buttonText.equals("C")) {
            if (dataToCalculate.length() > 0)
                dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            else dataToCalculate = "0";
        } else {
            dataToCalculate = dataToCalculate + buttonText;
        }
        if(buttonText.equals("x^y")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "^";
        }
        if(buttonText.equals("x!")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 2);
            dataToCalculate = dataToCalculate + "!";
        }
        if(buttonText.equals("sin")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "sin(";
        }
        if(buttonText.equals("cos")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "cos(";
        }
        if(buttonText.equals("tan")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "tan(";
        }
        if(buttonText.equals("log")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "log(";
        }
        if(buttonText.equals("ln")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 2);
            dataToCalculate = dataToCalculate + "ln(";
        }
        if(buttonText.equals("√")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            dataToCalculate = dataToCalculate + "sqrt(";
        }
        if(buttonText.equals("π")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            dataToCalculate = dataToCalculate + "pi";
        }
        if(buttonText.equals("e")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            dataToCalculate = dataToCalculate + "e";
        }
        if(buttonText.equals("Ans")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "ans";
        }
        if(buttonText.equals("deg")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "deg(";
        }
        if(buttonText.equals("Rad")){
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 3);
            dataToCalculate = dataToCalculate + "rad(";
        }

        mainResultTextView.setText(dataToCalculate);
        System.out.println(dataToCalculate);

        String finalResult = getResult(dataToCalculate);
        if (!finalResult.equals("NaN")) {
            smallResultTextView.setText(finalResult);
        }
    }

    String getResult(String data) {
        try {
            if (data.endsWith("+") || data.endsWith("-") || data.endsWith("*") || data.endsWith("/")) {
                data = data.substring(0, data.length() - 1);
            }
            if (data.startsWith("*") || data.startsWith("/")) {
                data = data.substring(1);
            }
            if (data.contains("++") || data.contains("--") || data.contains("**") || data.contains("//")) {
                return "NaN";
            }
            if (data.contains("+-") || data.contains("-+") || data.contains("*-") || data.contains("/-")) {
                data = data.replace("+-", "-");
                data = data.replace("-+", "-");
                data = data.replace("*-", "*-1*");
                data = data.replace("/-", "/-1*");
            }

            Expression expression = new Expression(data);
            Double finalResult = expression.calculate();
            return finalResult.toString();

        } catch (Exception e) {
            return "NaN";
        }
    }
}
