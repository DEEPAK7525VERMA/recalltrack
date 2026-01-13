package com.example.dsarevision.dsa_revision_backend.repository;

import com.example.dsarevision.dsa_revision_backend.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}