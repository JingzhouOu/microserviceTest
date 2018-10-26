package com.jingzhou.microserviceTest.repository;

import com.jingzhou.microserviceTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jingzhou Ou
 * Created on 18-10-26
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
