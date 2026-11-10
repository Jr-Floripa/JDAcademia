package com.jd.academia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aluno extends Pessoa {

    @Column(unique = true)
    private String matricula;

}
