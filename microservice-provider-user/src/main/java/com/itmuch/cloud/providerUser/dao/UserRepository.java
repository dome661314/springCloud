package com.itmuch.cloud.providerUser.dao;

import com.itmuch.cloud.providerUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
