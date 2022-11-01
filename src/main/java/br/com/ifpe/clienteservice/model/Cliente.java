package br.com.ifpe.clienteservice.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente implements Serializable {

    private static final long serialVersionUID = 2547660198120125434L;

    private Long id;
    private String nome;
    private String cpf;

}