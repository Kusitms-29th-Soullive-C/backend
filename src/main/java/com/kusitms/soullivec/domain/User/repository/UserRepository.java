package com.kusitms.soullivec.domain.User.repository;

import com.kusitms.soullivec.domain.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
