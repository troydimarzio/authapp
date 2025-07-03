package com.oakcodes.authapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oakcodes.authapp.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // cari user berdasarkan email (untuk login)
    Optional<User> findByEmail(String email);

    // cek apakah email sudah dipakai
    boolean existsByEmail(String email);

}
