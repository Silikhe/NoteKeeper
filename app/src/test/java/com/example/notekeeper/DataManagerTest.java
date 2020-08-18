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
        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setText(noteText);
        newNote.setTitle(noteTitle);

        NoteInfo compareNotes = dm.getNotes().get(noteIndex);
//        assertSame(newNote, compareNotes);
        assertEquals(compareNotes.getCourse(), course);
        assertEquals(compareNotes.getTitle(), noteTitle);
        assertEquals(compareNotes.getText(), noteText);




    }
}