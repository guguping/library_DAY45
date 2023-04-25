package com.icia.lib.Service;

import com.icia.lib.DTO.BookDTO;
import com.icia.lib.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public int save(BookDTO bookDTO){
        System.out.println("bookDTO = " + bookDTO);
        int result = bookRepository.save(bookDTO);
        return 0;

    }
}
