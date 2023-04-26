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
    public String updateForm(@RequestParam("id") Long id , Model model){
        BookDTO bookDTO = bookService.select(id);
        model.addAttribute("bookUpdate",bookDTO);
        return "update";
    }

    // 수정 처리
    @PostMapping("/update")
    public String update (@ModelAttribute BookDTO bookDTO){
        bookService.update(bookDTO);
        // 수정이 완료되면 상세페이지를 다시 출력
        // redirect 요청 : 다른 컨트롤러의 주소를 요청(jsp페이지 이름을 리턴하는 것이 아님)
        return "redirect:/detail?id="+bookDTO.getId();
//        jsp를 요청하는것이 아닌 detail 메소드를 요청함
    }

}
