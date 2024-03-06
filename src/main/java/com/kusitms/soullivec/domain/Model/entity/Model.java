package com.kusitms.soullivec.domain.Model.entity;

import com.kusitms.soullivec.domain.Input.entity.Input;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Model {

    @Id
    @Column(name = "model_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "job")
    private String job;

    @Column(name = "input_id")
    private Long inputId;

    /*@ManyToOne
    @JoinColumn(name = "input_id")
    private Input inputId;*/
}
