package com.example.viikko9;

public class Note {
    public int Id;
    public String title;
    public String content;
    public String timeAndDate;
    private static int idCounter = 1;

    public Note(String title, String content) {
        this.Id = idCounter++;
        this.title = title;
        this.content = content;
        // Ajan sekä päivämäärän löytämiseen käytetty tekoälyä, en osannut itse.
        this.timeAndDate = java.text.DateFormat.getDateTimeInstance().format(new java.util.Date());
    }
}
