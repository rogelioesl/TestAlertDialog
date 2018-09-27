package apps.bwmeill.com.testalertdialog.dialogpers.actividades;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import apps.bwmeill.com.testalertdialog.R;
import apps.bwmeill.com.testalertdialog.dialogpers.dialogos.SimpleDialog;
import apps.bwmeill.com.testalertdialog.dialogpers.fragmentos.MainFragment;


public class MainActivity extends AppCompatActivity implements
        DatePickerDialog.OnDateSetListener,
        TimePickerDialog.OnTimeSetListener,
        SimpleDialog.OnSimpleDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            MainFragment fragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment, "MainFragment")
                    .commit();
        }

    }


    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(
                this,
                "Fecha: " + year + "-" + monthOfYear + "-" + dayOfMonth,
                Toast.LENGTH_LONG)
                .show();

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(
                this,
                "Tiempo: " + hourOfDay + ":" + minute,
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onPossitiveButtonClick() {
        Toast.makeText(
                this,
                "Botón Positivo Pulsado",
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNegativeButtonClick() {
        Toast.makeText(
                this,
                "Botón Negativo Pulsado",
                Toast.LENGTH_LONG)
                .show();
    }
}