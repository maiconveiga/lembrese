package maiconveiga.lembre_se;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.media.*;
import android.R.*;

public class MainActivity extends ActionBarActivity {

    TextView tvTela;
    Button btAvancar;
    int contador = -2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTela = (TextView) findViewById(R.id.tela);
        img = (ImageView) findViewById(R.id.bird);
        final ImageView imagem = (ImageView) findViewById(R.id.casal);
        final TextView fim = (TextView) findViewById(R.id.Fim);

       final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.audio);



        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;

                switch (contador){

                    case -1:
                        tvTela.setText("Preparada? ;)");
                        mp.start();
                        break;
                    case 0:
                        tvTela.setText("Fiz esse aplicativo para lhe passar a seguinte mensagem.");
                        break;
                    case 1:
                        tvTela.setText("Quase sempre me pego pensando em você.");
                        break;
                    case 2:
                        tvTela.setText("Penso o quão penoso seria a minha vida sem sua presença.");
                        break;
                    case 3:
                        tvTela.setText("Fico imaginando nós dois fazendo diversas coisas juntos,");
                        break;
                    case 4:
                        tvTela.setText("como acampar, viajar e até mesmo estudando.");
                        break;
                    case 5:
                        tvTela.setText("Vejo, que pensar no que poderíamos fazer, torna cada vez mais interessante...");
                        break;
                    case 6:
                        tvTela.setText("seguir contigo nessa longa e bela caminhada.");
                        break;
                    case 7:
                        tvTela.setText("As vezes você reclama por eu não ser romântico, mas cá entre nós...");
                        break;
                    case 8:
                        tvTela.setText("Existe algo mais romântico do que fazer um aplicativo para a namorada?! =D");
                        break;
                    case 9:
                        tvTela.setText("Então, aproveito para lhe apresentar um verso que fiz para você!");
                        break;
                    case 10:
                        tvTela.setText("Ele se chama O versinho que fiz para você.");
                        break;
                    case 11:
                        tvTela.setText("Numa manhã traquila ou agitada,");
                        break;
                    case 12:
                        tvTela.setText("eu me pego pensando na minha namorada.");
                        break;
                    case 13:
                        tvTela.setText("Parece bobo, um versinho de ensino fundamental,");
                        break;
                    case 14:
                        tvTela.setText("Mas não me importo, ficar bobo apaixonado é normal.");
                        break;
                    case 15:
                        tvTela.setText("Para escrever um verso deve-se estar inspirado,");
                        break;
                    case 16:
                        tvTela.setText("É verdade, mas basta pensar em você que isso fica sossegado.");
                        break;
                    case 17:
                        tvTela.setText("Te ver após um longo dia de trabalho cansativo,");
                        break;
                    case 18:
                        tvTela.setText("me traz energia, fôlego e incentivo.");
                        break;
                    case 19:
                        tvTela.setText("Pois estamos nos esforçando para um futuro promissor,");
                        break;
                    case 20:
                        tvTela.setText("Mas mesmo que tudo falhe, não abalará o nosso amor.");
                        break;
                    case 21:
                        tvTela.setText("Bem, foi uma tentativa válida de expressar o quanto lhe aprecio e a amo.");
                        break;
                    case 22:
                        tvTela.setText("Espero que tenha gostado desse aplicativo...");
                        break;
                    case 23:
                         tvTela.setText("Tive essa ideia porque uma vez você disse que gostava de baixar apps para celular e testar.");
                        break;
                    case 24:
                        tvTela.setText("Feliz dia dos namorados!!!");
                        imagem.setImageResource(R.drawable.casal);
                        fim.setText("Feliz dia dos namorados!");
                        break;


                }

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
