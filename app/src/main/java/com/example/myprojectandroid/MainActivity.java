package com.example.myprojectandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public double res1, res2;
    public String oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

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

        Button reselt = (Button) findViewById ( R.id.button );
        Button delete = (Button) findViewById ( R.id.button14 );

        Button charDelete = (Button) findViewById ( R.id.button8 );

        but0.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                textView2.setText ( textView2.getText ().toString () + "0" );

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
                textView2.setText ( textView2.getText ().toString () + "1" );

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
                textView2.setText ( textView2.getText ().toString () + "2" );

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
                textView2.setText ( textView2.getText ().toString () + "3" );

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
                textView2.setText ( textView2.getText ().toString () + "4" );

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
                textView2.setText ( textView2.getText ().toString () + "5" );

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
                textView2.setText ( textView2.getText ().toString () + "6" );

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
                textView2.setText ( textView2.getText ().toString () + "7" );

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
                textView2.setText ( textView2.getText ().toString () + "8" );

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        but0.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                textView2.setText ( textView2.getText ().toString () + "0" );

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
                textView2.setText ( textView2.getText ().toString () + "9" );

                if (res1 == 0) {
                    res1 = Double.parseDouble ( textView2.getText ().toString () );
                } else {
                    res2 = Double.parseDouble ( textView2.getText ().toString () );
                }
            }
        } );

        min.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "-";
                res1 = Double.parseDouble ( textView2.getText ().toString () );
                textView2.setText ( "" );
            }
        } );

        pul.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "+";
                res1 = Double.parseDouble ( textView2.getText ().toString () );
                textView2.setText ( "" );
            }
        } );

        del.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "/";
                res1 = Double.parseDouble ( textView2.getText ().toString () );
                textView2.setText ( "" );
            }
        } );

        ymn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                oper = "*";
                res1 = Double.parseDouble ( textView2.getText ().toString () );
                textView2.setText ( "" );
            }
        } );

        charDelete.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                textView2.setText (charDeleteMetod ( textView2.getText ().toString () ));
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
                if (res2 != 0) {
                    textView2.setText ( "" + reseltDouble ( oper, res1, res2 ) );
                } else {
                    Toast.makeText( MainActivity.this, "it is impossible to divide by zero", Toast.LENGTH_LONG ).show ();
                    textView2.setText ( "" );
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_memu, menu);
        return true;
    }
}
