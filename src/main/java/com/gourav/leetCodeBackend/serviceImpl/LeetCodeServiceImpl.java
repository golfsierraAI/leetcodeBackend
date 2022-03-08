package com.gourav.leetCodeBackend.serviceImpl;

import com.gourav.leetCodeBackend.managerImpl.LeetcodeMangerImpl;
import com.gourav.leetCodeBackend.service.LeetcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeetCodeServiceImpl implements LeetcodeService {
    @Autowired
    LeetcodeMangerImpl manager;

    @Override
    public List<?> getDataService() {
        return manager.getDataManager();
    }
}
