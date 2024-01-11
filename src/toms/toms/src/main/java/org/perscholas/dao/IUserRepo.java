package org.perscholas.dao;

import org.perscholas.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users, Long> {
    Users findByuId(Long id);

}
