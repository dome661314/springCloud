package com.itmuch.cloud.providerUser.dao;

import com.itmuch.cloud.ProviderUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
