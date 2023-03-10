package Controller;

import Model.Field;
import Model.IRepository;
import Model.Note;

import java.util.List;

public class Controller extends NoteController implements INoteController{


    public Controller(IRepository repository) {
        super(repository);
    }

    @Override
    public void saveNote(Note note) throws Exception {
        super.saveNote(note);
    }

    @Override
    public void deleteNote(String noteId) throws Exception {
        super.deleteNote(noteId);
    }

    @Override
    public void updateNote(Note note, Field field, Object param) throws Exception {
        super.updateNote(note, field, param);
    }

    @Override
    public Note readNote(String noteId) throws Exception {
        return super.readNote(noteId);
    }

    @Override
    public List<Note> getNotes() throws Exception {
        return super.getNotes();
    }

    @Override
    public Note getNoteById(String noteId) throws Exception {
        return super.getNoteById(noteId);
    }
}

