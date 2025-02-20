package br.com.project.comic.adapter.database.repository;

import br.com.project.comic.adapter.database.entity.CharacterComicsEntity;
import java.util.List;

public interface CharacterComicsRepository {
  List<CharacterComicsEntity> getComicsProfile(String nickname);
}
