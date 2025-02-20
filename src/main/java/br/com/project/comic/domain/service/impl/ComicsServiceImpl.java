package br.com.project.comic.domain.service.impl;

import br.com.project.comic.adapter.database.entity.ComicsEntity;
import br.com.project.comic.adapter.database.repository.ComicsRepository;
import br.com.project.comic.domain.service.ComicsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComicsServiceImpl implements ComicsService {

  @Autowired private ComicsRepository comicsRepository;

  @Override
  public List<ComicsEntity> getAllComics() {
    return comicsRepository.getAllComics();
  }

  @Override
  public List<ComicsEntity> getComics(String nickname) {
    return comicsRepository.getComics(nickname);
  }
}
