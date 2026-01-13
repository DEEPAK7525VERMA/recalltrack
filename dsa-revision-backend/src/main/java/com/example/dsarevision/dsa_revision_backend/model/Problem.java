package com.example.dsarevision.dsa_revision_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String difficulty;
    private int confidenceLevel;

    private LocalDate lastRevised;
    private LocalDate nextRevisionDate;

    public Problem() {}

    public Problem(String title, String difficulty, int confidenceLevel) {
        this.title = title;
        this.difficulty = difficulty;
        this.confidenceLevel = confidenceLevel;
    }

    // getters and setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDifficulty() { return difficulty; }
    public int getConfidenceLevel() { return confidenceLevel; }
    public LocalDate getLastRevised() { return lastRevised; }
    public LocalDate getNextRevisionDate() { return nextRevisionDate; }

    public void setTitle(String title) { this.title = title; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public void setConfidenceLevel(int confidenceLevel) { this.confidenceLevel = confidenceLevel; }
    public void setLastRevised(LocalDate lastRevised) { this.lastRevised = lastRevised; }
    public void setNextRevisionDate(LocalDate nextRevisionDate) { this.nextRevisionDate = nextRevisionDate; }
}