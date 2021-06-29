package com.cainiao.myproject01.dao;

import com.cainiao.myproject01.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByNameAndPassword(String name,String password);
}
