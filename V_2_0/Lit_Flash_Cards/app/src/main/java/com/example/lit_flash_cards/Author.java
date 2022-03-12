package com.example.lit_flash_cards;

public class Author {
    public String Name;
    public String LiteraryDirection;
    public String ActiveYears;

    public Author(String name, String literaryDirection, String activeYears){
        Name = name;
        LiteraryDirection = literaryDirection;
        ActiveYears = activeYears;
    }

    static public void GetAuthors(Author[] authors){
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
    }
}
