package com.icia.lib.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long id = 0L;
    private String bookName;
    private String bookPublisher;
    private String bookAuthor;
    private Long bookPrice;

}



