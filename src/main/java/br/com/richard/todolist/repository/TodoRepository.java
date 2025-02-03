package br.com.richard.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.richard.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
