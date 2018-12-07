package com.example.simon.nuitdelinfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class UrgenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urgence);
    }
    public void morsure(View view) {
        TextView check1 = (TextView) findViewById(R.id.conseil);
        check1.setText("En cas de morsure de serpent, il faut s'allonger et se calmer.Ensuite il faut appeler les secours et attendre qu'ils nous donnent les gestes de secours appropriés. Les systèmes d'aspiration du venin n'ont pas fait leurs preuves. Il faut donc éviter de sucer le venin.");
    }

    public void deshydratation(View view) {

        TextView check1 = (TextView) findViewById(R.id.conseil);
        check1.setText("Il faut augmenter l'apport en eau dans l'organisme (boire beaucoup, de préférence de l'eau voire des jus de fruits) et éviter de favoriser la perte de liquide et de sel (éviter de boire de l'alcool par exemple).");
    }

    public void blessure(View view) {
        TextView check1 = (TextView) findViewById(R.id.conseil);
        check1.setText("Appliquez une pression sur la plaie en utilisant un tampon propre et si possible, maintenez la pression jusqu’à ce que le saignement cesse.");
    }

    public void telSecours(View view) {
        Uri u=Uri.parse("tel:123456789");

        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}
