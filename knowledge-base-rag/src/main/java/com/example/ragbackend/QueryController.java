package com.example.ragbackend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class QueryController {

    private static final String UPLOAD_DIR = "uploads"; 

    @PostMapping("/upload")
    public ResponseEntity<Map<String, String>> uploadDocument(@RequestParam("file") MultipartFile file) {
        Map<String, String> res = new HashMap<>();

        if (file.isEmpty()) {
            res.put("message", "❌ No file selected");
            return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
        }

        try {
            File dir = new File(UPLOAD_DIR);
            if (!dir.exists()) dir.mkdirs();

            Path filePath = Paths.get(UPLOAD_DIR, file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            res.put("message", "✅ File saved successfully: " + file.getOriginalFilename());
            res.put("path", filePath.toAbsolutePath().toString());
            return new ResponseEntity<>(res, HttpStatus.OK);

        } catch (IOException e) {
            res.put("message", "⚠️ Error saving file: " + e.getMessage());
            return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/query")
    public ResponseEntity<Map<String, String>> queryDocument(@RequestBody Map<String, String> body) {
        String query = body.get("query");
        Map<String, String> res = new HashMap<>();
        res.put("answer", "Mock answer (next step: embed real file data). Query: " + query);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
