package pl.kfrak.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button openHelloActivityButton;
    private Button openPermisionsButton;
    private Button resourcesFunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecircle", "onCreate");

        editText = (EditText) findViewById(R.id.editText);
        openHelloActivityButton = (Button) findViewById(R.id.main_openHelloActivityButton);
        openPermisionsButton = (Button) findViewById(R.id.main_OpenPermissionsButton);
        resourcesFunButton = (Button) findViewById(R.id.main_ResourcesFunButton);
}

    public void onButtonClick(View view){
        switch (view.getId()){
            case R.id.main_OpenPermissionsButton: openPermisionsButton();
                break;
            case R.id.main_openHelloActivityButton: openHelloActivity();
                break;
            case R.id.main_ResourcesFunButton: resourcesFunButton();
                break;
            default:Log.e("Blad", "Niewspierany przycisk");
                break;
        }
    }

    private void resourcesFunButton() {
        Intent intent = new Intent(this, ResourcesActivity.class);
        startActivity(intent);
    }


    private void openPermisionsButton() {
        Intent intent = new Intent(this, PermissionActivity.class);
        startActivity(intent);
    }

    private void openHelloActivity() {
        String name = editText.getText().toString();
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecircle", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecircle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecircle", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecircle", "onResume");
    }


}
