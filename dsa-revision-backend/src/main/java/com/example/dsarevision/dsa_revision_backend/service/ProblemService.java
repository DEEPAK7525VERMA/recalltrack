package com.example.dsarevision.dsa_revision_backend.service;

import com.example.dsarevision.dsa_revision_backend.model.Problem;
import com.example.dsarevision.dsa_revision_backend.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProblemService {

    private final ProblemRepository repository;

    public ProblemService(ProblemRepository repository) {
        this.repository = repository;
    }

    public Problem addProblem(Problem problem) {
        problem.setLastRevised(LocalDate.now());
        problem.setNextRevisionDate(LocalDate.now().plusDays(1));
        return repository.save(problem);
    }

    public List<Problem> getAllProblems() {
        return repository.findAll();
    }
}