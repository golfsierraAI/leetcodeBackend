package com.gourav.leetCodeBackend.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public interface LeetcodeService {
    @GetMapping("/")
    List<?> getDataService();
}
