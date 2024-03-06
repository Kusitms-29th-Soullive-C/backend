package com.kusitms.soullivec.domain.Character.entity;

import com.kusitms.soullivec.domain.Model.entity.Model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Mood {

    @Id
    @Column(name = "mood_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moodId;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model modelId;


}
