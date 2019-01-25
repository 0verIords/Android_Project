package com.example.myprojectandroid;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public double res1 = 0, res2 = 0, aDouble = 0;
    public String oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final TextView textView1 = (TextView) findViewById ( R.id.textView1 );
        final TextView textView2 = (TextView) findViewById ( R.id.textView2 );

        Button but1 = (Button) findViewById ( R.id.button11 );
        Button but2 = (Button) findViewById ( R.id.button17 );
        Button but3 = (Button) findViewById ( R.id.button18 );
        Button but4 = (Button) findViewById ( R.id.button10 );
        Button but5 = (Button) findViewById ( R.id.button15 );
        Button but6 = (Button) findViewById ( R.id.button16 );
        Button but7 = (Button) findViewById ( R.id.button9 );
        Button but8 = (Button) findViewById ( R.id.button12 );
        Button but9 = (Button) findViewById ( R.id.button13 );

        Button but0 = (Button) findViewById ( R.id.button21 );

        Button min = (Button) findViewById ( R.id.button19 );
        Button pul = (Button) findViewById ( R.id.button20 );
        Button del = (Button) findViewById ( R.id.button6 );
        Button ymn = (Button) findViewById ( R.id.button7 );

        Button point = (Button) findViewById ( R.id.button22 );

        Button reselt = (Button) findViewById ( R.id.button );
        Button delete = (Button) findViewById ( R.id.button14 );

        Button charDelete = (Button) findViewById ( R.id.button8 );

        but0.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "0" );
                    textView1.setText ( textView1.getText ().toString () + "0" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }

            }
        } );

        but1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "1" );
                    textView1.setText ( textView1.getText ().toString () + "1" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "2" );
                    textView1.setText ( textView1.getText ().toString () + "2" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }
                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "3" );
                    textView1.setText ( textView1.getText ().toString () + "3" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "4" );
                    textView1.setText ( textView1.getText ().toString () + "4" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "5" );
                    textView1.setText ( textView1.getText ().toString () + "5" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "6" );
                    textView1.setText ( textView1.getText ().toString () + "6" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "7" );
                    textView1.setText ( textView1.getText ().toString () + "7" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "8" );
                    textView1.setText ( textView1.getText ().toString () + "8" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );


        but9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (isNamberFol (textView2.getText ().toString ())) {
                    textView2.setText ( textView2.getText ().toString () + "9" );
                    textView1.setText ( textView1.getText ().toString () + "9" );
                } else {
                    Toast.makeText( MainActivity.this, "numbers can not be more than six (6)", Toast.LENGTH_LONG ).show ();
                }

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        point.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (isPoint ( textView2.getText ().toString () )) {
                    textView2.setText ( textView2.getText ().toString () + "." );
                    textView1.setText ( textView1.getText ().toString () + "." );
                } else if (!isPoint ( textView2.getText ().toString () )) {
                    Toast.makeText( MainActivity.this, "the point is already there", Toast.LENGTH_LONG ).show ();
                }
            }
        } );

        min.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "-";
                res1 = Double.parseDouble ( textView2.getText ().toString () );

                if (aDouble != 0) {
                    textView1.setText ( "" + aDouble );
                    aDouble = 0;
                }

                textView1.setText ( textView1.getText ().toString () + " - " );

                textView2.setText ( "" );
            }
        } );

        pul.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "+";
                res1 = Double.parseDouble ( textView2.getText ().toString () );

                if (aDouble != 0) {
                    textView1.setText ( "" + aDouble );
                    aDouble = 0;
                }

                textView1.setText ( textView1.getText ().toString () + " + " );


                textView2.setText ( "" );
            }
        } );

        del.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "/";
                res1 = Double.parseDouble ( textView2.getText ().toString () );

                if (aDouble != 0) {
                    textView1.setText ( "" + aDouble );
                    aDouble = 0;
                }

                textView1.setText ( textView1.getText ().toString () + " ÷ " );

                textView2.setText ( "" );
            }
        } );

        ymn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "*";
                res1 = Double.parseDouble ( textView2.getText ().toString () );
                if (aDouble != 0) {
                    textView1.setText ( "" + aDouble );
                    aDouble = 0;
                }

                textView1.setText ( textView1.getText ().toString () + " * " );

                textView2.setText ( "" );
            }
        } );

        charDelete.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                textView2.setText (charDeleteMetod ( textView2.getText ().toString () ));
                textView1.setText (charDeleteMetod ( textView1.getText ().toString () ));
            }
        } );

        delete.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "";
                res1 = 0;
                res2 = 0;
                textView2.setText ( "" );
                textView1.setText ( "" );
            }
        } );

        reselt.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                try {
                    if (res2 != 0) {
                        if (isEqually ( textView1.getText ().toString () )) {
                            textView1.setText ( textView1.getText ().toString () + " = " );
                        }
                        aDouble = reseltDouble ( oper, res1, res2 );
                        textView2.setText ( "" + reseltDouble ( oper, res1, res2 ) );
                    } else {
                        Toast.makeText ( MainActivity.this, "it is impossible to divide by ZERO", Toast.LENGTH_LONG ).show ();
                        textView2.setText ( "" );
                        textView1.setText ( "" );
                        res2 = 0;
                        res1 = 0;
                    }
                } catch (Exception e) {
                    Toast.makeText ( MainActivity.this, "Unknown error", Toast.LENGTH_LONG ).show ();
                    textView2.setText ( "" );
                    textView1.setText ( "" );
                    res2 = 0;
                    res1 = 0;
                }
            }
        } );

    }

    public static String charDeleteMetod (String str) {
        char[] chars = str.toCharArray ();
        String strFinal = "";

        for (int i = 0; i < chars.length - 1; i++) {
            strFinal += chars[i];
        }
        return strFinal;
    }

    public static double reseltDouble (String str, double a, double b) {
        double reselt = 0;

        switch (str) {
            case "/" :
                reselt = a / b;
                break;
            case "*" :
                reselt = a * b;
                break;
            case "-" :
                reselt = a - b;
                break;
            case "+" :
                reselt = a + b;
                break;
        }

        return reselt;
    }

    public static boolean isNamberFol (String str) {
        boolean booleanFinal = false;

        if (str.length () < 6) {
            booleanFinal = true;
        }

        return booleanFinal;
    }

    public static boolean isPoint (String str) {
        boolean booleanFinal = true;
        char[] chars = str.toCharArray ();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                booleanFinal = false;
            }
        }

        return booleanFinal;
    }

    public static boolean isEqually (String str) {
        boolean booleanFinal = true;

        char[] chars = str.toCharArray ();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '=') {
                booleanFinal = false;
            }
        }

        return booleanFinal;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_memu, menu);
        return true;
    }
}
