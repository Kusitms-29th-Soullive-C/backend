package com.kusitms.soullivec.domain.FileUpload.entity;

import com.kusitms.soullivec.domain.Model.entity.Model;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;

    public Image(String url){
        this.imageUrl=url;
    }

}