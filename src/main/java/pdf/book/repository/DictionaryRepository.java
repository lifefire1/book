package pdf.book.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdf.book.dto.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

  List<Dictionary> findByPageNumberAndTitle(String pageNumber, String title);
}
