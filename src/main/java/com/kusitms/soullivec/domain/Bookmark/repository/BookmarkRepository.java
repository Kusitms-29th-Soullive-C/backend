package com.kusitms.soullivec.domain.Bookmark.repository;

import com.kusitms.soullivec.domain.Bookmark.entity.Bookmark;
import com.kusitms.soullivec.domain.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    List<Bookmark> findAllByUser(User user);

}
