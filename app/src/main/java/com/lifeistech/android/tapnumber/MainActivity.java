package com.lifeistech.android.tapnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lifeistech.android.tapnumber.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] hairetu;
    String mondai;
    int seikai;
    TextView textView;
    int number;
    TextView text;
    TextView textView2;
    int tyousenn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        start();
        text = (TextView) findViewById(R.id.textView);
        text.setText("＊訳が解らないメッセージが出ます");
    }


    public void start() {

        hairetu = new int[9];
        Random rand = new Random();
        hairetu[0] = rand.nextInt(9);
        hairetu[1] = rand.nextInt(9);
        hairetu[2] = rand.nextInt(9);
        hairetu[3] = rand.nextInt(9);
        hairetu[4] = rand.nextInt(9);
        hairetu[5] = rand.nextInt(9);
        hairetu[6] = rand.nextInt(9);
        hairetu[7] = rand.nextInt(9);
        hairetu[8] = rand.nextInt(9);


        mondai =
                Integer.toString(hairetu[0])
                        + Integer.toString(hairetu[1])
                        + Integer.toString(hairetu[2])
                        + Integer.toString(hairetu[3])
                        + Integer.toString(hairetu[4])
                        + Integer.toString(hairetu[5])
                        + Integer.toString(hairetu[6])
                        + Integer.toString(hairetu[7])
                        + Integer.toString(hairetu[8]);


        textView.setText(mondai);
        seikai = 0;

        tyousenn = tyousenn + 1;
        {

        }
        {
            Toast.makeText(this, "無限ループって怖くね", Toast.LENGTH_SHORT).show();
        }

        if (tyousenn == 100) {

            Toast.makeText(this, "祝　100回達成！詳しくは挑戦回数へ", Toast.LENGTH_SHORT).show();
        }

        if (tyousenn == 103) {
            tyousenn = 0;
        }


    }

    public void number1(View v) {
        if (hairetu[seikai] == 1) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {
            Toast.makeText(this, "間違えた＼(^o^)／", Toast.LENGTH_SHORT).show();
        }
    }

    public void number2(View v) {
        if (hairetu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {

            Toast.makeText(this, "俺の求めているものとは何かが違う", Toast.LENGTH_SHORT).show();
        }
    }

    public void number3(View v) {
        if (hairetu[seikai] == 3) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {

            Toast.makeText(this, "何かが違う気がする", Toast.LENGTH_SHORT).show();
        }
    }

    public void number4(View v) {
        if (hairetu[seikai] == 4) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {

            Toast.makeText(this, "誤答　撮影開始　ご期待ください", Toast.LENGTH_SHORT).show();
        }
    }

    public void number5(View v) {
        if (hairetu[seikai] == 5) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {

            Toast.makeText(this, "★BA★KA★NA★なぜ動かない", Toast.LENGTH_SHORT).show();
        }
    }

    public void number6(View v) {
        if (hairetu[seikai] == 6) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {
            Toast.makeText(this, "( ；´Д｀)", Toast.LENGTH_SHORT).show();
        }
    }

    public void number7(View v) {
        if (hairetu[seikai] == 7) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {
            Toast.makeText(this, "なぜだ！何が違う！", Toast.LENGTH_SHORT).show();
        }
    }


    public void number8(View v) {
        if (hairetu[seikai] == 8) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {

            Toast.makeText(this, "そもそも何のために数字を入れているのだろうか　いや意味なんてないのかもしれない　　", Toast.LENGTH_SHORT).show();
        }
    }

    public void number9(View v) {
        if (hairetu[seikai] == 9) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {
            Toast.makeText(this, "言わなくともわかるな　違うんだよ", Toast.LENGTH_SHORT).show();
        }
    }

    public void number0(View v) {
        if (hairetu[seikai] == 0) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;

            if (seikai == 9) {
                start();
            }
        } else {
            Toast.makeText(this, "間違えた　　　だと！？´д` ;", Toast.LENGTH_SHORT).show();

        }
    }


    public void CLEAR(View v) {
        start();


    }


    public void plus(View v) {
        text.setText(String.valueOf(tyousenn));
        {

        }
        {
            Toast.makeText(this, " ここは挑戦数とエンディング確認画面です ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "豆知識 100回以降は確認時に特別メッセージが出ます", Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"（どうしても）見たい人はSTART連打してメッセージ待ち推奨",Toast.LENGTH_SHORT).show();

        }



    if(tyousenn==101)

    {
        Toast.makeText(this, "おめでとうございます！！！", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "このゲームはここで終わりです", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "ありがとうございました　　" , Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "　　　0回で確認すると　　", Toast.LENGTH_SHORT).show();
    }

    if(tyousenn==100)

    {


        Toast.makeText(this, "祝　100回達成！なぜこんなゲームに時間を費やしてしまったのか　101回でEND　103回でリセットです", Toast.LENGTH_SHORT).show();
    }

    if(tyousenn==102)

    {
        Toast.makeText(this, "あっ　何もないですよ（ネタ切れ）", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "まぁ気になりますよね", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "これで本当にお別れです！　お疲れ様でした！", Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"　　　0回で確認すると　　　", Toast.LENGTH_SHORT).show();

    }
        if(tyousenn==0){
            Toast.makeText(this, "終わった　全て終わったんだ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "何もかも 今この瞬間に", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "そして俺は　そっと電源を落とした", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　スタッフクレジット　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　         　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　きっかけ　思いつき　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　構想　数秒　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　製作　2日ほど　　　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　構想　おれ　" , Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　製作　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　総監督　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　監督　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　プログラマー　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　ペインター　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　アシスタント　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "　監修　おれ　", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Thank foe Playing！　", Toast.LENGTH_SHORT).show();

        }
    }

    public void END (View v) {
        tyousenn = 100;

    }


}









