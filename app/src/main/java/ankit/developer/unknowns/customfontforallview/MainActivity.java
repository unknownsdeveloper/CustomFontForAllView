package ankit.developer.unknowns.customfontforallview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calligrapher calligrapher = new Calligrapher(this);
       //calligrapher.setFont(this, "alexbrush/AlexBrush-Regular.ttf", true);
        calligrapher.setFont(this, "alexbrush/Oranienbaum.ttf", true);
    }
}
