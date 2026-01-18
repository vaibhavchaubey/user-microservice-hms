package com.hms.user.repository;

import com.hms.user.dto.MonthlyRoleCountDTO;
import com.hms.user.dto.Roles;
import com.hms.user.entity.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

    @Query("SELECT new com.hms.user.dto.MonthlyRoleCountDTO(CAST(FUNCTION('MONTHNAME', u.createdAt) AS String), COUNT(u)) FROM User u WHERE u.role = ?1 AND YEAR(u.createdAt) = YEAR(CURRENT_DATE) GROUP BY FUNCTION('MONTH', u.createdAt), CAST(FUNCTION('MONTHNAME', u.createdAt) AS String) ORDER BY FUNCTION('MONTH', u.createdAt)")
    List<MonthlyRoleCountDTO> countRegistrationsByRoleGroupByMonth(Roles role);

}
