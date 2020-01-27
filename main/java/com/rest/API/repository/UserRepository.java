package com.rest.API.repository;
import com.rest.API.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	@Query(value="Select * from users", nativeQuery=true)
//	List<Contact> getAllContacts();
//	
//	@Query(value="Select * from contacts s where (:period is null OR to_char(s.timedatestamp, 'yyyy-MM-dd') <= :period)", nativeQuery=true)
//	List<Contact> getSomeContacts(@Param("period") String period);
}
