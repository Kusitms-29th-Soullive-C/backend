package com.kusitms.soullivec.domain.Bookmark.entity;

import com.kusitms.soullivec.domain.Bookmark.dto.request.CreateBookmarkRequestDto;
import com.kusitms.soullivec.domain.Output.entity.Output;
import com.kusitms.soullivec.domain.User.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Bookmark {

    @Id
    @Column(name = "bookmark_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "output_id")
    private Output output;

    public static Bookmark createBookmark(User user, Output output, CreateBookmarkRequestDto bookmarkRequest) {
        return Bookmark.builder()
                .user(user)
                .output(output)
                .build();
    }

}
