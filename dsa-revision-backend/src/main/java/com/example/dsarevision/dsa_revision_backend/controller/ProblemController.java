//ProblemController
package com.example.dsarevision.dsa_revision_backend.controller;


import com.example.dsarevision.dsa_revision_backend.model.Problem;
import com.example.dsarevision.dsa_revision_backend.service.ProblemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problems")
public class ProblemController {

    private final ProblemService service;

    public ProblemController(ProblemService service) {
        this.service = service;
    }

    @PostMapping
    public Problem addProblem(@RequestBody Problem problem) {
        return service.addProblem(problem);
    }

    @GetMapping
    public List<Problem> getAllProblems() {
        return service.getAllProblems();
    }

    @PutMapping("/{id}/review")
    public ResponseEntity<Problem> updateRevision(
            @PathVariable Long id,
            @RequestParam int confidenceLevel
    ){
        Problem updated=service.updateRevision(id,confidenceLevel);
        if(updated==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

}