package com.example.notekeeper;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void createNewNote() {
        DataManager dm = DataManager.getInstance();
        final  CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "test note title";
        final String noteText = "This is the Body of my note text";

        int noteIndex = dm.createNewNote();
        NoteInfo newnote = dm.getNotes().get(noteIndex);
        newnote.setCourse(course);
        newnote.setText(noteText);
        newnote.setTitle(noteTitle);
    }
}