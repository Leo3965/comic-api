package br.com.project.comic.adapter.database.repository;

import br.com.project.comic.adapter.database.entity.ComicsEntity;
import java.util.List;

public interface ComicsRepository {

  List<ComicsEntity> getAllComics();

  List<ComicsEntity> getComics(String nickName);
}
