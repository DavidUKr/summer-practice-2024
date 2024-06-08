package com.app.lacemauit_b.module;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Movie movie;

    @Column
    private String content;

    @Column
    private int rating;

}

