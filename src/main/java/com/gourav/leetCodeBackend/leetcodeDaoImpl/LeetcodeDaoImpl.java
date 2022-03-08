package com.gourav.leetCodeBackend.leetcodeDaoImpl;

import com.gourav.leetCodeBackend.dao.LeetcodeDAO;
import com.gourav.leetCodeBackend.entities.Questions;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class LeetcodeDaoImpl implements LeetcodeDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<?> getDataDao() {
        return entityManager.createQuery("from Questions", Questions.class).getResultList();
    }
}
