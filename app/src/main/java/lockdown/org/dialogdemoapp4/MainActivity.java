package lockdown.org.dialogdemoapp4;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btnDialog;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnDialog=findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Login Here");
                LayoutInflater inflater = getLayoutInflater();
                View i = inflater.inflate(R.layout.custom,null);
                ab.setView(i);
                ab.setPositiveButton("Sign in",null);
                ab.setNegativeButton("Cancel",null);
                ab.show();
            }
        });
    }
}
