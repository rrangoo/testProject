package org.examlpe.testproject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Number {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true)
    private String name;

    private String number;
}
