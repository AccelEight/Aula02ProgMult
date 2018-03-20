package br.usjt.aula02final;

/**
 * Accel Gustavo Araújo Rocha   RA 81616654     SI3AN-MCA
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    /**
     * Callback method defined by the View
     * @param v
     */
    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}
