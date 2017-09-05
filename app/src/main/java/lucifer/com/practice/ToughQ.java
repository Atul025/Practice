package lucifer.com.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lucifer on 9/5/2017.
 */
public class ToughQ extends AppCompatActivity {
    String[] taarray, tqarray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questins);
        tqarray= getResources().getStringArray(R.array.tqarray);
        taarray= getResources().getStringArray(R.array.taarray);

    }
}
