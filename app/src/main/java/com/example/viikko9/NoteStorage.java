package com.example.viikko9;

import java.util.ArrayList;

public class NoteStorage {
    private static NoteStorage instance = null;
    private ArrayList<Note> notes = new ArrayList<>();

    static NoteStorage getInstance() {
        if (instance == null) {
            instance = new NoteStorage();
        }
        return instance;
    }
    ArrayList<Note> getNotes () {
        return notes;
    }
    void addNote(Note note) {
        notes.add(note);
    }
}
