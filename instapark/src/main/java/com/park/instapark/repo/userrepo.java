package com.park.instapark.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.park.instapark.model.user;
@Repository
public interface userrepo extends JpaRepository<user, Integer> {

}
