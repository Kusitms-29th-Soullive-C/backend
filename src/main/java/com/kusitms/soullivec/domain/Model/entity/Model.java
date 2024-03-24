package com.kusitms.soullivec.domain.Model.entity;

import com.kusitms.soullivec.domain.FileUpload.entity.Image;
import com.kusitms.soullivec.domain.Input.entity.Input;
import com.kusitms.soullivec.domain.Mood.entity.Mood;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "input_id")
    private Input input;

    @OneToOne(mappedBy = "model")
    private Image modelImage;

    @OneToMany(mappedBy = "model")
    private List<Mood> mood = new ArrayList<>();

}
