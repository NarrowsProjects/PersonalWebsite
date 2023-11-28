package application.rest;

import application.models.Worry;
import application.repositories.WorryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/worries")
public class WorryController {
    @Autowired
    WorryRepository repository;

    // Get all worries
    @GetMapping
    public ResponseEntity<List<Worry>> getAllWorries() {
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping("names")
    public ResponseEntity<List<String>> getAllNames() {
        return ResponseEntity.ok(repository.findAllNames());
    }

    @PostMapping
    public ResponseEntity<Worry> createWorry(@RequestBody Worry worry) {
        repository.save(worry);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + worry.getDate().toString()).build().toUri();
        return ResponseEntity.created(uri).body(worry);
    }

    // Custom query: Get worries by name and type
    @GetMapping("/byNameAndType/{name}/{type}")
    public ResponseEntity<List<Worry>> getWorriesByNameAndType(
            @PathVariable("name") String name,
            @PathVariable("type") String type) {
        List<Worry> worries = repository.findWorriesByTypeAndName(name, type);
        return ResponseEntity.ok(worries);
    }

    // Custom query: Get worries by name
    @GetMapping("/byName/{name}")
    public ResponseEntity<List<Worry>> getWorriesByName(@PathVariable String name) {
        List<Worry> worries = repository.findWorriesByName(name);
        return ResponseEntity.ok(worries);
    }

    // Custom query: Get worries by type
    @GetMapping("/byType/{type}")
    public ResponseEntity<List<Worry>> getWorriesByType(@PathVariable("type") String type) {
        List<Worry> worries = repository.findWorriesByType(type);
        return ResponseEntity.ok(worries);
    }

}
