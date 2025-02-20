package br.com.project.comic.domain.service.impl;

import br.com.project.comic.adapter.database.entity.CharacterComicsEntity;
import br.com.project.comic.adapter.database.entity.CharacterEntity;
import br.com.project.comic.adapter.database.repository.CharacterComicsRepository;
import br.com.project.comic.adapter.database.repository.CharacterRepository;
import br.com.project.comic.domain.service.CharacterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

  @Autowired private CharacterRepository characterRepository;

  @Autowired private CharacterComicsRepository characterComicsRepository;

  @Override
  public List<CharacterEntity> getAllCharacters() {
    return characterRepository.findAll().stream()
        .filter(c -> c.getSk().contains("PROFILE#"))
        .toList();
  }

  @Override
  public CharacterEntity getProfile(String nickname) {
    return characterRepository.getProfile(nickname);
  }

  @Override
  public List<CharacterComicsEntity> getComicsAndProfile(String nickname) {
    return characterComicsRepository.getComicsProfile(nickname);
  }
}
