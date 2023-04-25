package com.icia.lib.Controller;

import com.icia.lib.DTO.BookDTO;
import com.icia.lib.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @Autowired // BookService 의존성 주입 (필드 주입)
    private BookService bookService;
    @GetMapping("/save")
    public String save(){
        return "save";
    }
    @PostMapping("/save")
    public String saveParam(@ModelAttribute BookDTO bookDTO , Model model){
        int saveResult = bookService.save(bookDTO);
        model.addAttribute("result",saveResult);
        return "saveResult";

    }
    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
    @GetMapping("/list")
    public String list(){
        List<BookDTO> bookDTOList = bookService.findAll();

        return "list";
    }

}
