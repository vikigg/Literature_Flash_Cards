package com.example.lit_flash_cards;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getAuthor = findViewById(R.id.getAuthor);
        Button getWork = findViewById(R.id.getWork);
        Button getAnswers = findViewById(R.id.getAnswers);
        TextView task = findViewById(R.id.task);
        TextView direction = findViewById(R.id.direction);
        TextView years = findViewById(R.id.years);
        TextView genre = findViewById(R.id.genre);
        TextView author = findViewById(R.id.author);

        getAuthor.setText("АВТОР");
        getWork.setText("ПРОИЗВЕДЕНИЕ");
        getAnswers.setText("ОТГОВОРИ");


        int authorCount = 15;
        int workCount = 94;
        int[] currentAuthor = new int[1];
        int[] currentWork = new int[1];
        String[] current = new String[1];

        Author[] authors = new Author[authorCount];
        authors[0] = new Author("Христо Ботев", "реализъм + революционна романтика","60-70те на 19 век");
        authors[1] = new Author("Иван Вазов", "(социален) реализъм","преди и след Освобождението");
        authors[2] = new Author("Алеко Константинов", "социален реализъм","90те на 19 век");
        authors[3] = new Author("Пенчо Славейков", "индивидуализъм/модернизъм","последното десетилетие на 19 век и началото на 20 век");
        authors[4] = new Author("Пейо Яворов", "реализъм + индивидуализъм,символизъм/модернизъм","края на 19 век и началото на 20 век");
        authors[5] = new Author("Елин Пелин", "социален реализъм","началото на 20 век -->");
        authors[6] = new Author("Димчо Дебелянов", "символизъм/модернизъм","20те/началото на 20 век");
        authors[7] = new Author("Христо Смирненски", "постсимволизъм","20те на 20 век");
        authors[8] = new Author("Гео Милев", "експресионизъм","20те на 20 век");
        authors[9] = new Author("Атанас Далчев", "диаболизъм","20те на 20 век -->");
        authors[10] = new Author("Елисавета Багряна", "реализъм","20те на 20 век -->");
        authors[11] = new Author("Йордан Йовков", "етичен реализъм","20-30те на 20 век");
        authors[12] = new Author("Никола Вапцаров", "реализъм","30-40те на 20 век");
        authors[13] = new Author("Димитър Димов", "реализъм","40-50те на 20 век");
        authors[14] = new Author("Димитър Талев", "реализъм","40-50те на 20 век");

        Work[] works = new Work[workCount];
        works[0] = new Work("Майце си", "елегия", authors[0]);
        works[1] = new Work("Към брата си", "елегия", authors[0]);
        works[2] = new Work("Елегия", "елегия", authors[0]);
        works[3] = new Work("Борба", "стихотворение", authors[0]);
        works[4] = new Work("До моето първо либе", "стихотворение", authors[0]);
        works[5] = new Work("На прощаване", "стихотворение/поема", authors[0]);
        works[6] = new Work("Хаджи Димитър", "балада", authors[0]);
        works[7] = new Work("Моята молитва", "стихотворение", authors[0]);
        works[8] = new Work("Обесването на Васил Левски", "елегия", authors[0]);
        works[9] = new Work("Българският език", "ода", authors[1]);
        works[10] = new Work("Отечество любезно...", "стихотворение/ода", authors[1]);
        works[11] = new Work("При Рилския манастир", "стихотворение", authors[1]);
        works[12] = new Work("Елате ни вижте!", "елегия", authors[1]);
        works[13] = new Work("Линее нашто поколенье", "елегия", authors[1]);
        works[14] = new Work("Левски", "ода", authors[1]);
        works[15] = new Work("Паисий", "ода", authors[1]);
        works[16] = new Work("Кочо", "ода", authors[1]);
        works[17] = new Work("Опълченците на Шипка", "ода", authors[1]);
        works[18] = new Work("Дядо Йоцо гледа", "разказ", authors[1]);
        works[19] = new Work("Чичовци", "повест", authors[1]);
        works[20] = new Work("Под игото", "роман епопея", authors[1]);
        works[21] = new Work("Разни хора, разни идеали", "цикъл от фейлетони", authors[2]);
        works[22] = new Work("Бай Ганьо", "сборник/роман от фейлетони (книга)", authors[2]);
        works[23] = new Work("Cis moll", "философска поема", authors[3]);
        works[24] = new Work("Ралица", "битова поема", authors[3]);
        works[25] = new Work("Ни лъх не дъхва над полени", "лирическа миниатюра", authors[3]);
        works[26] = new Work("Спи езерото; белостволи буки", "лирическа миниатюра", authors[3]);
        works[27] = new Work("Самотен гроб в самотен кът", "лирическа миниатюра", authors[3]);
        works[28] = new Work("Градушка", "поема", authors[4]);
        works[29] = new Work("Затонеци", "елегия", authors[4]);
        works[30] = new Work("Ще бъдеш в бяло", "стихотворение", authors[4]);
        works[31] = new Work("Две хубави очи", "стихотворение", authors[4]);
        works[32] = new Work("Стон", "стихотворение", authors[4]);
        works[33] = new Work("Две души", "стихотворение", authors[4]);
        works[34] = new Work("Сенки", "стихотворение", authors[4]);
        works[35] = new Work("Песента на човека", "стихотворение", authors[4]);
        works[36] = new Work("Маска", "стихотворение", authors[4]);
        works[37] = new Work("Ветрената мелница", "разказ", authors[5]);
        works[38] = new Work("Косачи", "разказ", authors[5]);
        works[39] = new Work("Задушница", "разказ", authors[5]);
        works[40] = new Work("Мечтатели", "разказ", authors[5]);
        works[41] = new Work("На оня свят", "разказ", authors[5]);
        works[42] = new Work("Андрешко", "разказ", authors[5]);
        works[43] = new Work("Чорба от греховете на отец Никодим", "разказ", authors[5]);
        works[44] = new Work("Занемелите камбани", "разказ", authors[5]);
        works[45] = new Work("Гераците", "повест", authors[5]);
        works[46] = new Work("Черна песен", "елегия", authors[6]);
        works[47] = new Work("Пловдив", "сонет", authors[6]);
        works[48] = new Work("Да се завърнеш... (Скрити вопли)", "елегия", authors[6]);
        works[49] = new Work("Помниш ли, помниш ли...", "елегия", authors[6]);
        works[50] = new Work("Спи градът", "елегия", authors[6]);
        works[51] = new Work("Миг", "стихотворение", authors[6]);
        works[52] = new Work("Един убит", "стихотворение", authors[6]);
        works[53] = new Work("Сиротна песен", "елегия", authors[6]);
        works[54] = new Work("Тиха победа", "стихотворение", authors[6]);
        works[55] = new Work("Да бъде ден!", "стихотворение", authors[7]);
        works[56] = new Work("Ний", "стихотворение", authors[7]);
        works[57] = new Work("Йохан", "поема", authors[7]);
        works[58] = new Work("Юноша", "стихотворение", authors[7]);
        works[59] = new Work("Старият музикант", "елегия", authors[7]);
        works[60] = new Work("Цветарка", "елегия", authors[7]);
        works[61] = new Work("Зимни вечери", "лирически цикъл от фрагменти", authors[7]);
        works[62] = new Work("Септември", "поема", authors[8]);
        works[63] = new Work("Прозорец", "стихотворение", authors[9]);
        works[64] = new Work("Болница", "стихотворение", authors[9]);
        works[65] = new Work("Стаята", "стихотворение", authors[9]);
        works[66] = new Work("Къщата", "стихотворение", authors[9]);
        works[67] = new Work("Повест", "стихотворение", authors[9]);
        works[68] = new Work("Книгите", "елегия", authors[9]);
        works[69] = new Work("Камък", "стихотворение", authors[9]);
        works[70] = new Work("Дяволско", "елегия", authors[9]);
        works[71] = new Work("Кукувица", "стихотворение", authors[10]);
        works[72] = new Work("Стихии", "стихотворение", authors[10]);
        works[73] = new Work("Потомка", "стихотворение", authors[10]);
        works[74] = new Work("Вечната", "стихотворение", authors[10]);
        works[75] = new Work("Песента на колелетата", "разказ", authors[11]);
        works[76] = new Work("Последна радост", "разказ", authors[11]);
        works[77] = new Work("Шибил", "разказ", authors[11]);
        works[78] = new Work("През чумавото", "разказ", authors[11]);
        works[79] = new Work("Индже", "разказ", authors[11]);
        works[80] = new Work("Албена", "разказ", authors[11]);
        works[81] = new Work("Другоселец", "разказ", authors[11]);
        works[82] = new Work("Серафим", "разказ", authors[11]);
        works[83] = new Work("Вяра", "стихотворение", authors[12]);
        works[84] = new Work("Писмо (Ти помниш ли...)", "стихотворение", authors[12]);
        works[85] = new Work("Песен за човека", "стихотворение", authors[12]);
        works[86] = new Work("Сън", "стихотворение", authors[12]);
        works[87] = new Work("История", "стихотворение", authors[12]);
        works[88] = new Work("Завод", "стихотворение", authors[12]);
        works[89] = new Work("Кино", "стихотворение", authors[12]);
        works[90] = new Work("Прощално", "стихотворение", authors[12]);
        works[91] = new Work("Борбата е безмилостно жестока...(Предсмъртно)", "стихотворение", authors[12]);
        works[92] = new Work("Тютюн", "роман епопея", authors[13]);
        works[93] = new Work("Железният светилник", "роман епопея", authors[14]);
        // ^ were partly done automatically with a C# program *smug wink*

        getAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current[0] = "authors";
                int rand = new Random().nextInt(authorCount);
                task.setText(authors[rand].Name);
                currentAuthor[0] = rand;
                direction.setText("Направление:");
                years.setText("Години:");
                genre.setText("Жанр:");
                author.setText("Автор:");
            }
        });

        getWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current[0] = "works";
                int rand = new Random().nextInt(workCount);
                task.setText(works[rand].Name);
                currentWork[0] = rand;
                direction.setText("Направление:");
                years.setText("Години:");
                genre.setText("Жанр:");
                author.setText("Автор:");
            }
        });

        getAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (task.getText()!="")
                {
                    if(current[0]=="authors")
                    {
                        direction.setText("Направление: " + authors[currentAuthor[0]].Direction);
                        years.setText("Години: " + authors[currentAuthor[0]].Years);
                    }
                    else if(current[0]=="works")
                    {
                        genre.setText("Жанр: " + works[currentWork[0]].Genre);
                        author.setText("Автор: " + works[currentWork[0]].Author.Name);
                    }
                }
            }
        });
    }
}

