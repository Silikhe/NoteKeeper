package com.example.notekeeper;

import java.util.ArrayList;
import java.util.List;

public class dammy {
    public class DataManager {
        private static com.example.notekeeper.DataManager ourInstance = null;

        private List<CourseInfo> mCourses = new ArrayList<>();
        private List<NoteInfo> mNotes = new ArrayList<>();

        public static com.example.notekeeper.DataManager getInstance() {
            if(ourInstance == null) {
                ourInstance = new com.example.notekeeper.DataManager();
                ourInstance.initializeCourses();
                ourInstance.initializeExampleNotes();
            }
            return ourInstance;
        }

        public String getCurrentUserName() {
            return "Jim Wilson";
        }

        public String getCurrentUserEmail() {
            return "jimw@jwhh.com";
        }

        public List<NoteInfo> getNotes() {
            return mNotes;
        }

        public int createNewNote() {
            NoteInfo note = new NoteInfo(null, null, null);
            mNotes.add(note);
            return mNotes.size() - 1;
        }

    }
