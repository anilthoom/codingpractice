package com.anilt.component.library.controller;

import com.anilt.component.library.model.ComponentLibrary;
import com.anilt.component.library.repository.ComponentLibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ComponentLibController {

    @Autowired
    private ComponentLibraryRepository componentLibraryRepository;

    @GetMapping("/components")
    public List<ComponentLibrary> getAllComponentLibraries(){
        return componentLibraryRepository.findAll();
    }

    public ResponseEntity<ComponentLibrary> getComponentLibraryById(@PathVariable(value = "id") Long componentId){
        return null;
    }
}
