package com.team9.token_arts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void goToLog(View view) {
        Intent intentLog = new Intent(this, EmailPasswordActivity.class);
        startActivity(intentLog);
    }

       private static class MyArrayAdapter extends ArrayAdapter<Class> {
        private Context mContext;
        private Class[] mClasses;

        private MyArrayAdapter(Context context, int resource, Class[] objects) {
            super(context, resource, objects);
            mContext = context;
            mClasses = objects;
        }
    }

   /*public void clickTextView(View view){
        Intent intentTerminus = new Intent(this, TerminusActivity.class);
        startActivity(intentTerminus);
    }

   public void clickTextView2(View view){
        Intent intentTerminus2 = new Intent(this, PolyActivity.class);
    }*/

    //Método para generar el menú
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal_menu, menu);
        return true;
    }

    // Método para asignar funciones al menú
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_login_email) {
            goToLoginEmail();
        } else if (id == R.id.item_login_facebook) {
            goToLoginFacebook();
        } else if (id == R.id.item_exit) {
            goToHome();
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToLoginEmail(View view) {
        Intent intentLogEmail = new Intent(this, EmailPasswordActivity.class);
        startActivity(intentLogEmail);
    }

    public void goToLoginFacebook(View view) {
        Intent intentLogFacebook = new Intent(this, FacebookActivity.class);
        startActivity(intentLogFacebook);
    }

    public void goToHome(View view) {
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }

    public void goToLoginEmail() {
        Intent intentLogEmail = new Intent(this, EmailPasswordActivity.class);
        startActivity(intentLogEmail);
    }

    public void goToLoginFacebook() {
        Intent intentLogFacebook = new Intent(this, FacebookActivity.class);
        startActivity(intentLogFacebook);
    }

    public void goToHome() {
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }

}