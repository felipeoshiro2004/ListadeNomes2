package com.example.listadenomes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView listNomes;

    private String[] itens = {
            "Flechas", "Bombardeiro", "Arqueiras", "Cavaleiro", "Bola de Fogo",
            "Mini P.E.K.K.A", "Mosqueteira", "Gigante", "Príncipe", "Dragão Bebê",
            "Exército de Esqueletos", "Bruxa", "Goblins Lanceiros", "Goblins", "Cabana de Goblins",
            "Valquíria", "Relâmpago", "Barril de Goblins", "Esqueletos", "Servos",
            "Lápide", "Torre de Bombas", "Esqueleto Gigante", "Balão", "Canhão",
            "Bárbaros", "Foguete", "Cabana de Bárbaros", "Fúria", "X-Besta",
            "Tesla", "Horda de Servos", "Torre Inferno", "Corredor", "Feitiço de Gelo",
            "P.E.K.K.A", "Zap", "Mago", "Espelho", "Morteiro", "Gangue de Goblins",
            "Coletor de Elixir", "Golem", "Gigante Real", "Três Mosqueteiras", "Príncipe das Trevas",
            "Veneno", "Mago de Gelo", "Princesa", "Espírito de Fogo", "Fornalha",
            "Guardas", "Lava Hound", "Mineiro", "Sparky", "Lançador",
            "Espírito de Gelo", "Lenhador", "O Tronco", "Megasservo", "Dragão Infernal",
            "Golem de Gelo", "Cemitério", "Tornado", "Bárbaros de Elite", "Clone",
            "Mago Elétrico", "Goblin com Dardo", "Executor", "Aríete de Batalha",
            "Bandida", "Bruxa Sombria", "Morcegos", "Carrinho de Canhão", "Máquina Voadora",
            "Barril de Esqueletos", "Megacavaleiro", "Eletrocutadores", "Caçador", "Fantasma Real",
            "Arqueiro Mágico", "Barril de Bárbaro", "Patifes", "Porcos Reais", "Bola de Neve",
            "Recrutas Reais", "Goblin Gigante", "Dragão Elétrico", "Domadora de Carneiro", "Destruidores de Muros",
            "Terremoto", "Jaula de Goblin", "Pescador", "Golem de Elixir", "Curadora Guerreira",
            "Pirotécnica", "Encomenda Real", "Espirito Curador", "Dragões Esqueleto", "Gigante Elétrico",
            "Espírito Elétrico", "Bruxa Mãe", "Goblin com Broca", "Cavaleiro Dourado", "Rainha Arqueira",
            "Rei Esqueleto", "Mineiro Bombado"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listNomes = findViewById(R.id.listNomes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens

        );


        listNomes.setAdapter(adapter);

        listNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String nomeSelecionado = listNomes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), nomeSelecionado, Toast.LENGTH_SHORT).show();



            }
        });

    }

    public void MostrarArena (View view)  {

        Intent arena = new Intent(this, Arena.class);
        startActivity(arena);

    }
}
