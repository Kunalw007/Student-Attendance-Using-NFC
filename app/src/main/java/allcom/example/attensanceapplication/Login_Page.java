package allcom.example.attensanceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

<<<<<<< HEAD
import com.google.firebase.auth.FirebaseAuth;
=======
>>>>>>> 358f94876ff05d15e6722c0c9d80fc32be38f5c1

public class Login_Page extends AppCompatActivity {
    Button LoginTwo;
    TextView Or, SignUpTwo, ForgotpasswordTwo;
    EditText EmailTwo, PasswordTwo;
    ImageView Logo;
    private FirebaseAuth mAuth;
    @SuppressWarnings("unchecked")

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);

        LoginTwo = findViewById(R.id.LoginTwo);
        Or = findViewById(R.id.Or);
        SignUpTwo = findViewById(R.id.SignUpTwo);
        ForgotpasswordTwo = findViewById(R.id.ForgotpasswordTwo);
        EmailTwo = findViewById(R.id.EmailTwo);
        PasswordTwo = findViewById(R.id.PasswordTwo);
        Logo = findViewById(R.id.Logo);
<<<<<<< HEAD

        mAuth = FirebaseAuth.getInstance();

=======
>>>>>>> 358f94876ff05d15e6722c0c9d80fc32be38f5c1
        LoginTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(Login_Page.this,Select_year_teacher.class);
               startActivity(intent);
            }
        });
        

        SignUpTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login_Page.this,New_user_signUp.class);
                startActivity(intent);
            }
        });
       ForgotpasswordTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login_Page.this,Forgot_Password.class);
                startActivity(intent);
            }
        });
    }

<<<<<<< HEAD
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }
=======

>>>>>>> 358f94876ff05d15e6722c0c9d80fc32be38f5c1
}

