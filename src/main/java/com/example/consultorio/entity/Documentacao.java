package com.example.consultorio.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Documentacao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private String tipo;
    @OneToOne
    @JoinColumn(name = "Doutor Responsavel")
    private Doutor doutor ;
    @OneToOne
    @JoinColumn(name = "Paciente")
    private Paciente paciente;
}
