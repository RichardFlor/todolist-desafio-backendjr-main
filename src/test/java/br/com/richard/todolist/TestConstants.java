package br.com.richard.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.richard.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@richard", "Curtir", false, 1));
      add(new Todo(9996L, "@richard", "Comentar", false, 1));
      add(new Todo(9997L, "@richard", "Compartilhar", false, 1));
      add(new Todo(9998L, "@richard", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@richard", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
