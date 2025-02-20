package br.com.project.comic.domain.service;

import br.com.project.comic.adapter.database.entity.CharacterComicsEntity;
import br.com.project.comic.adapter.database.entity.CharacterEntity;
import java.util.List;

public interface CharacterService {
  List<CharacterEntity> getAllCharacters();

  CharacterEntity getProfile(String nickname);

  List<CharacterComicsEntity> getComicsAndProfile(String nickname);
}
