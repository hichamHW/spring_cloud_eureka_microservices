package com.user.demo.Repo;

import com.user.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
;

public interface RepoUser extends JpaRepository<User,Integer> {
}
