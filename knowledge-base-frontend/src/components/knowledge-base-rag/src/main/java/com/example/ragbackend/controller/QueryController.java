package com.example.ragbackend.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class QueryController {
    @PostMapping("/upload")
    public Map<String, String> uploadDocument(@RequestParam("file") MultipartFile file) {
        Map<String, String> res = new HashMap<>();
        res.put("message", "File uploaded: " + file.getOriginalFilename());
        return res;
    }

    @PostMapping("/query")
    public Map<String, String> queryDocument(@RequestBody Map<String, String> body) {
        String query = body.get("query");
        Map<String, String> res = new HashMap<>();
        res.put("answer", "This is a mock answer for query: " + query);
        return res;
    }
}