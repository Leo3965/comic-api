package br.com.project.comic.domain.service;

import br.com.project.comic.adapter.database.entity.ComicsEntity;
import java.util.List;

public interface ComicsService {
  List<ComicsEntity> getAllComics();

  List<ComicsEntity> getComics(String nickname);
}
