package pdf.book.dto;

import lombok.Data;

@Data
public class DictionaryDto {
  private String title;
  private String word;
  private String translation;
  private String pageNumber;
}
