package com.icia.lib.Controller;

import com.icia.lib.DTO.BookDTO;
import com.icia.lib.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String detail(@RequestParam("id") Long id,Model model){
        BookDTO bookDTO = bookService.select(id);
        model.addAttribute("bookDTO",bookDTO);
        return "detail";
    }
    @GetMapping("/detailDelete")
    public String detailDelete(@RequestParam("id") Long id,Model model){
        int deleteResult = bookService.delete(id);
        model.addAttribute("result",deleteResult);
        return "detailDelete";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<BookDTO> bookDTOList = bookService.findAll();
//        for (BookDTO bookDTO : bookDTOList){
//            System.out.println("BookDTO =" + bookDTO);
//        }
        model.addAttribute("bookDTOList",bookDTOList);
        return "list";
    }
    @GetMapping("/update")
    public String updaeForm(@RequestParam("id") Long id , Model model){
        BookDTO bookDTO = bookService.select(id);
        model.addAttribute("bookUpdate",bookDTO);
        return "update";
    }

}
