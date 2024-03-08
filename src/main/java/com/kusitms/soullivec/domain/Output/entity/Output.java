package com.kusitms.soullivec.domain.Output.entity;

import com.kusitms.soullivec.domain.Model.entity.Model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Output {

    @Id
    @Column(name = "output_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long outputId;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "fitness")
    private int fitness;

    @Column(name = "issue")
    private int issue;

    @Column(name = "negativity")
    private String negativity;

    @Column(name = "image")
    private String image;

    @Column(name = "strategy")
    private String strategy;

    @Column(name = "input_id")
    private Long inputId;

    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
