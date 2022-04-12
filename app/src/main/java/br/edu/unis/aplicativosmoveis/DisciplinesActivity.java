package br.edu.unis.aplicativosmoveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DisciplinesActivity extends AppCompatActivity {

    RecyclerView rvDisciplines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines);

        rvDisciplines = findViewById(R.id.rv_disciplines);
        rvDisciplines.setLayoutManager(new LinearLayoutManager(this));

        List<Discipline> disciplines = new ArrayList<>();
        disciplines.add(new Discipline("Aplicações Móveis", "SI", "5º período", R.color.teal_200));
        disciplines.add(new Discipline("Gestão de Projetos", "SI", "5º período", R.color.purple_500));
        disciplines.add(new Discipline("TCC", "SI", "5º período", R.color.purple_700));
        disciplines.add(new Discipline("Ética e Responsabilidade Social", "SI", "5º período", R.color.teal_200));
        disciplines.add(new Discipline("Conhecimentos Gerais", "SI", "5º período", R.color.purple_500));
        disciplines.add(new Discipline("Aplicações Móveis", "SI", "5º período", R.color.purple_700));
        disciplines.add(new Discipline("Gestão de Projetos", "SI", "5º período",R.color.teal_200));
        disciplines.add(new Discipline("TCC", "SI", "5º período", R.color.purple_500));
        disciplines.add(new Discipline("Ética e Responsabilidade Social", "SI", "5º período", R.color.purple_700));
        disciplines.add(new Discipline("Conhecimentos Gerais", "SI", "5º período",R.color.teal_200));


        DisciplinesAdapter adapter = new DisciplinesAdapter(disciplines);
        rvDisciplines.setAdapter(adapter);
    }
}