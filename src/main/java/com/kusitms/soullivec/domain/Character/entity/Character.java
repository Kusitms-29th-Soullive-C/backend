package com.kusitms.soullivec.domain.Character.entity;

import com.kusitms.soullivec.domain.Model.entity.Model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Character {

    @Id
    @Column(name = "character_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
