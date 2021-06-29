package com.dev.gitclone.GitApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.gitclone.GitApplication.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
//	@Modifying
//	@Query("delete from users u where u.id in ?1")
//	void deleteUsersWithId(List<Integer> ids);
	
//	void deleteByIdIn(Integer id);

}
