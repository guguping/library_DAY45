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

    public BookDTO select(Long id) {
        BookDTO bookDTO = bookRepository.select(id);
        if(bookDTO == null){
            return null;
        }else{
            return bookDTO;
        }
    }

    public int delete(Long id) {
        int result = bookRepository.delete(id);
        return result;
    }

    public void update(BookDTO bookDTO) {
        bookRepository.update(bookDTO);
    }
}
