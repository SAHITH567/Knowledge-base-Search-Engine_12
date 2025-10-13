package com.example.ragbackend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/ingest")
@CrossOrigin(origins = "http://localhost:3000")
public class UploadController {

    // POST /ingest/upload
    @PostMapping("/upload")
    public ResponseEntity<String> uploadDocuments(@RequestParam("files") MultipartFile[] files) {
        String uploadDir = "uploaded-documents/";
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        StringBuilder savedFiles = new StringBuilder();
        for (MultipartFile file : files) {
            try {
                File dest = new File(uploadDir + file.getOriginalFilename());
                file.transferTo(dest);
                savedFiles.append(file.getOriginalFilename()).append(", ");
            } catch (IOException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to upload " + file.getOriginalFilename());
            }
        }
        return ResponseEntity.ok("Files uploaded successfully: " + savedFiles);
    }
}
