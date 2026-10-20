//ProblemService
package com.example.dsarevision.dsa_revision_backend.service;

import com.example.dsarevision.dsa_revision_backend.model.Problem;
import com.example.dsarevision.dsa_revision_backend.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProblemService {

    private final ProblemRepository repository;
    private int calculateDaysToAdd(int confidenceLevel){
        return switch(confidenceLevel){

            case 2 -> 3;
            case 3 -> 7;
            default -> 1;
        };
    }
    public Problem updateRevision(Long id, int confidenceLevel){
     Problem problem=repository.findById(id).orElse(null);
     if(problem==null){
         return null;
     }
     LocalDate today=LocalDate.now();
     problem.setConfidenceLevel(confidenceLevel);
     problem.setLastRevised(today);
     int daysToAdd=calculateDaysToAdd(confidenceLevel);
     problem.setNextRevisionDate(today.plusDays(daysToAdd));
     return  repository.save(problem);
    }

    public ProblemService(ProblemRepository repository) {
        this.repository = repository;
    }

    public Problem addProblem(Problem problem) {
        LocalDate today=LocalDate.now();
        problem.setLastRevised(today);
        int daysToAdd=calculateDaysToAdd(problem.getConfidenceLevel());
        problem.setNextRevisionDate(today.plusDays(daysToAdd));
        return repository.save(problem);
    }

    public List<Problem> getAllProblems() {
        return repository.findAll();
    }
}