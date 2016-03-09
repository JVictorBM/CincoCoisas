package com.example.android.cincocoisas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contadorFumanteNaoFumante = 0;
    private int contadorEstagioCancer = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irParaPaginaPrincipal(View view){
        setContentView(R.layout.activity_main);
    }
    public void irParaPrimeiraRazao(View view){
        setContentView(R.layout.primeira_razao);
    }
    public void irParaSegundaRazao(View view){
        setContentView(R.layout.segunda_razao);
    }
    public void irParaTerceiraRazao(View view){
        setContentView(R.layout.terceira_razao);
    }
    public void irParaQuartaRazao(View view){
        setContentView(R.layout.quarta_razao);
    }
    public void irParaQuintaRazao(View view){
        setContentView(R.layout.quinta_razao);
    }

    public void mudarImagemPulmaoFumanteENaoFumante(View view){
        ImageView img = (ImageView)findViewById(R.id.img_fumante_nao_fumante);
        TextView textDescricao = (TextView) findViewById(R.id.textview_imagem_pulmao);
        contadorFumanteNaoFumante++;
        if(contadorFumanteNaoFumante > 1){
            contadorFumanteNaoFumante = 0;
        }
        if(contadorFumanteNaoFumante == 0){
            img.setImageResource(R.drawable.pulmao_nao_fumante);
            textDescricao.setText(R.string.descricao_imagem_pulmao_nao_fumante);
        }else{
            img.setImageResource(R.drawable.pulmao_fumante);
            textDescricao.setText(R.string.descricao_imagem_pulmao_fumante);
        }
    }
    public void mudarImagemEstagioCancer(View view){
        ImageView img = (ImageView)findViewById(R.id.img_estagio_cancer);
        TextView textDescricao = (TextView) findViewById(R.id.textview_imagem_cancer_pulmao);
        contadorEstagioCancer++;
        if(contadorEstagioCancer > 4){
            contadorEstagioCancer = 0;
        }
        if(contadorEstagioCancer == 0){
            img.setImageResource(R.drawable.estagio0);
            textDescricao.setText(R.string.descricao_imagem_cancer_estagio0);
        }
        else if(contadorEstagioCancer == 1){
            img.setImageResource(R.drawable.estagio1);
            textDescricao.setText(R.string.descricao_imagem_cancer_estagio1);
        }
        else if(contadorEstagioCancer == 2){
            img.setImageResource(R.drawable.estagio2);
            textDescricao.setText(R.string.descricao_imagem_cancer_estagio2);
        }
        else if(contadorEstagioCancer == 3){
            img.setImageResource(R.drawable.estagio3);
            textDescricao.setText(R.string.descricao_imagem_cancer_estagio3);
        }
        else if(contadorEstagioCancer == 4){
            img.setImageResource(R.drawable.estagio3);
            textDescricao.setText(R.string.descricao_imagem_cancer_estagio4);
        }
    }

}
