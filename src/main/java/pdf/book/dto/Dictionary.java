package pdf.book.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dictionary {
  @Id
  private Long id;
  private String title;
  private String word;
  private String translation;
  private String pageNumber;
}
