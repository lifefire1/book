package pdf.book.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdf.book.dao.Dictionary;
import pdf.book.dto.TranslateDto;
import pdf.book.mapper.TranslateMapper;
import pdf.book.repository.DictionaryRepository;

@Service
public class DictionaryService {
  @Autowired
  private DictionaryRepository repository;

  @Autowired
  private TranslateMapper mapper;

  public void save(Dictionary dictionary) {
    repository.save(dictionary);
  }

  public List<TranslateDto> findByPageNumber(String pageNumber, String title) {
    return repository.findByPageNumberAndTitle(pageNumber, title).stream().map(mapper::fromDictionary).toList();
  }
}
