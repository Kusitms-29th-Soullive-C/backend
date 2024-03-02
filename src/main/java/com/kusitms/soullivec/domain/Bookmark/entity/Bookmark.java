package com.kusitms.soullivec.domain.Bookmark.entity;

import com.kusitms.soullivec.domain.Output.entity.Output;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Bookmark {

    @Id
    @Column(name = "bookmark_id")
    private Long id;

    //private Output outputId;
}
