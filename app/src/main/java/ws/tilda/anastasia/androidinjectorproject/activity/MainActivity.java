package ws.tilda.anastasia.androidinjectorproject.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;
import ws.tilda.anastasia.androidinjectorproject.R;

public class MainActivity extends AppCompatActivity {

    //@Inject member1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
