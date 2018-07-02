package pl.narodzinyprogramisty.dao;

import org.springframework.data.repository.CrudRepository;
import pl.narodzinyprogramisty.entity.user.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
}
