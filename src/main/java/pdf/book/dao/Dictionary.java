package pdf.book.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Dictionary {
  @Id
  private Long id;
  private String title;
  private String word;
  private String translation;
  private String pageNumber;
}
