package pdf.book.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pdf.book.dto.Dictionary;
import pdf.book.repository.DictionaryRepository;

@Service
public class DictionaryService {
  @Autowired
  private DictionaryRepository repository;

  public void save(Dictionary dictionary) {
    repository.save(dictionary);
  }

  public List<Dictionary> findByPageNumber(String pageNumber, String title) {
    return repository.findByPageNumberAndTitle(pageNumber, title);
  }
}
