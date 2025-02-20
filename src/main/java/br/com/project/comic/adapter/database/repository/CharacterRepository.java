package br.com.project.comic.adapter.database.repository;

import br.com.project.comic.adapter.database.entity.CharacterEntity;
import java.util.List;

public interface CharacterRepository {
  CharacterEntity getProfile(String tweetId);

  List<CharacterEntity> findAll();
}
