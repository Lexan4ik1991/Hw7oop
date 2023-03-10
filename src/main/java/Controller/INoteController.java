package Controller;

import Model.Field;
import Model.Note;

import java.util.List;

public interface INoteController {

    public void saveNote(Note note) throws Exception;

    public void deleteNote(String noteId) throws Exception;

    public void updateNote(Note note, Field field, Object param) throws Exception;

    public Note readNote(String noteId) throws Exception;

    public List<Note> getNotes() throws Exception;


}