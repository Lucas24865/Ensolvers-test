package Ensolvers.Test.Service;

import Ensolvers.Test.Model.Note;
import Ensolvers.Test.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    //Todo savegameService
    @Autowired
    private NoteRepository noteRepo;

    public List<Note> GetAllNotes(){
        return noteRepo.findAll();
    }
    public Long AddNote(Note note){
        return noteRepo.save(note).getId();
    }
    public Long EditNote(Note note){
        return noteRepo.save(note).getId();
    }
    public boolean DeleteNote(Long id){
        noteRepo.deleteById(id);
        return true;
    }
}
