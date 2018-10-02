package fr.utt.if26.grangaud_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     *  Crée l'activité principale de l'application avec un texte au milieu qui utilise la ressource string message et un bouton en bas qui change la couleur du fond de ce texte en rouge
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText(getResources().getString(R.string.message));
        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            } });
    }
}
