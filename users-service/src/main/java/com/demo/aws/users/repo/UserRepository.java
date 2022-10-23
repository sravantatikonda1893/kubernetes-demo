package com.demo.aws.users.repo;

import com.demo.aws.users.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author sravantatikonda
 */
@Repository
public interface UserRepository extends IBaseRepository<User, Integer>,
    JpaSpecificationExecutor<User> {

}
