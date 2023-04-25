package com.icia.lib.Repository;

import com.icia.lib.DTO.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save(BookDTO bookDTO) {
        /* insert 수행결과를 int 로 리턴.
           insert 수행이 되지 않았으면 0 , 됐으면 1 */
        return sql.insert("Book.save",bookDTO);
        // Book.save 는 어떤 맵퍼에 있는 어떤 쿼리문을 보낼건가 ,
        // bookDTO 자리는 실제 쿼리에 적용할 값
    }

    public List<BookDTO> findAll() {
        return sql.selectList("Book.findAll");
    }

    public BookDTO select(Long id) {
        return sql.selectOne("Book.select",id);
    }
}
