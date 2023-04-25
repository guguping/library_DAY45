package com.icia.lib.Service;

import com.icia.lib.DTO.BookDTO;
import com.icia.lib.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public int save(BookDTO bookDTO){
        System.out.println("bookDTO = " + bookDTO);
        int result = bookRepository.save(bookDTO);
        return result;
    }

    public List<BookDTO> findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        if(bookDTOList.size() == 0){
            return null;
        }else {
            return bookDTOList;
        }
    }
}
