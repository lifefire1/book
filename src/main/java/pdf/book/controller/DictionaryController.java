package pdf.book.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pdf.book.dto.Dictionary;
import pdf.book.service.DictionaryService;

@Controller
@Slf4j
public class DictionaryController {

  @Autowired
  private DictionaryService dictionaryService;

  @PostMapping(value = "/word")
  public ResponseEntity<String> addWord(Dictionary dictionary) {
    log.info(dictionary.toString());
    dictionaryService.save(dictionary);
    return ResponseEntity.ok("Word added successfully");
  }

  @GetMapping(value = "/page/{pageNumber}/title/{title}")
  public List<Dictionary> getTitle(@PathVariable String pageNumber, @PathVariable String title) {
    return dictionaryService.findByPageNumber(pageNumber, title);
  }
}
