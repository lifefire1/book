package pdf.book.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pdf.book.dao.Dictionary;
import pdf.book.dto.DictionaryDto;
import pdf.book.dto.TranslateDto;
import pdf.book.service.DictionaryService;

@Controller
@Slf4j
public class DictionaryController {

  @Autowired
  private DictionaryService dictionaryService;

  @PostMapping(value = "/word")
  public ResponseEntity<String> addWord(@RequestBody DictionaryDto dictionary) {
    log.info(dictionary.toString());
    Dictionary dictionary1 = new Dictionary();
    dictionary1.setWord(dictionary.getWord());
    dictionary1.setTitle(dictionary.getTitle());
    dictionary1.setPageNumber(dictionary.getPageNumber());
    dictionary1.setTranslation(dictionary.getTranslation());
    dictionaryService.save(dictionary1);
    return ResponseEntity.ok("Word added successfully");
  }

  @ResponseBody
  @GetMapping(value = "/page/{pageNumber}/title/{title}")
  public List<TranslateDto> getTitle(@PathVariable String pageNumber, @PathVariable String title) {
    return dictionaryService.findByPageNumber(pageNumber, title);
  }
}
