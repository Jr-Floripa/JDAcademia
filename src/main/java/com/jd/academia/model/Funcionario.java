package com.jd.academia.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Funcionario extends Pessoa {

    private String cargo;

}
