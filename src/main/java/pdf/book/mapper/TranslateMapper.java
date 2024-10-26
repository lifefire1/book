package pdf.book.mapper;

import pdf.book.dao.Dictionary;
import pdf.book.dto.TranslateDto;

public class TranslateMapper {

    public TranslateDto fromDictionary (Dictionary dictionary) {
        TranslateDto translateDto = new TranslateDto();
        translateDto.setTranslation(dictionary.getTranslation());
        translateDto.setWord(dictionary.getWord());
        return translateDto;
    }
}
