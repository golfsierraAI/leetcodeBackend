package com.gourav.leetCodeBackend.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface LeetcodeService {
    @GetMapping("/get")
    List<?> getDataService();
}
