package pl.narodzinyprogramisty.service;

import java.util.List;
import java.util.Optional;

public interface BaseServiceAPI<T> {

    Long add(T t);

    List<T> findAll();

    Optional<T> findById(Long id);

    void deleteById(Long id);

}
