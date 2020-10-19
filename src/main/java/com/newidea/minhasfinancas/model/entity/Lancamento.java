package com.newidea.minhasfinancas.model.entity;

import com.newidea.minhasfinancas.model.enums.StatusLancamento;
import com.newidea.minhasfinancas.model.enums.TipoLancamento;
import lombok.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name="lancamento", schema="financas")
public class Lancamento {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="descricao")
    private String descricao;

    @Column(name="mes")
    private Integer mes;

    @Column(name="ano")
    private Integer ano;

    @Column(name="valor")
    private BigDecimal valor;

    @Column(name="data_cadstro")
    @Convert(converter= Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate dataCadastro;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @Column(name="tipo")
    @Enumerated(value=EnumType.STRING)
    private TipoLancamento tipo;

    @Column(name="status")
    @Enumerated(value=EnumType.STRING)
    private StatusLancamento status;

}
