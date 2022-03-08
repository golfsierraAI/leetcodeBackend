package com.gourav.leetCodeBackend.managerImpl;

import com.gourav.leetCodeBackend.leetcodeDaoImpl.LeetcodeDaoImpl;
import com.gourav.leetCodeBackend.manager.LeetcodeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeetcodeMangerImpl implements LeetcodeManager {

    @Autowired
    LeetcodeDaoImpl dao;

    @Override
    public List<?> getDataManager() {
        return dao.getDataDao();
    }
}
