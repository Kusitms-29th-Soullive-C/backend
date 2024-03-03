package com.kusitms.soullivec.domain.Strategy.entity;

import com.kusitms.soullivec.domain.Input.entity.Input;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Strategy {

    @Id
    @Column(name = "strategy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @OneToOne
    @JoinColumn(name = "input_id")
    private Input inputId;
}
