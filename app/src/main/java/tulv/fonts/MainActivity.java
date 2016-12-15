package tulv.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rbA, rbC, rbB;
    TextView tvText;

    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        setEvent();
    }

    public void getWidget() {
        tvText = (TextView) findViewById(R.id.tv_Text);
        rbA = (RadioButton) findViewById(R.id.rb_a);
        rbB = (RadioButton) findViewById(R.id.rb_b);
        rbC = (RadioButton) findViewById(R.id.rb_c);
    }

    public void setEvent() {
        rbA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set fonts using from asset
                typeface = Typeface.createFromAsset(getAssets(), "fonts/Annabelle.ttf");
                tvText.setTypeface(typeface);
            }
        });
        rbB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeface = Typeface.createFromAsset(getAssets(), "fonts/Baybuom.ttf");
                tvText.setTypeface(typeface);
            }
        });
        rbC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeface = Typeface.createFromAsset(getAssets(), "fonts/Bendigo.ttf");
                tvText.setTypeface(typeface);
            }
        });
    }
}
