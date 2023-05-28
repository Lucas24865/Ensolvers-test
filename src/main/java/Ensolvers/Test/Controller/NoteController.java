package Ensolvers.Test.Controller;

import Ensolvers.Test.Model.Note;
import Ensolvers.Test.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteService note;

    @GetMapping("/GetNotes")
    public ResponseEntity<List<Note>> GetNotes() {
        return ResponseEntity.ok(note.GetAllNotes());
    }
    @PostMapping("/AddNote")
    public ResponseEntity<Long> AddNote(@RequestBody Note newNote) {
        return ResponseEntity.ok(note.AddNote(newNote));
    }
    @PostMapping("/EditNote")
    public ResponseEntity<Long> EditNote(@RequestBody Note editedNote) {
        return ResponseEntity.ok(note.EditNote(editedNote));
    }
    @DeleteMapping("/DeleteNote")
    public ResponseEntity<Boolean> DeleteNote(@RequestParam Long id) {
        return ResponseEntity.ok(note.DeleteNote(id));
    }


}
