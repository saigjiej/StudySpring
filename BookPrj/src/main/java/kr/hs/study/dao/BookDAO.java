package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	// 저장
	public void insert_data(BookDTO dto) {
		String sql = "insert into book values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(),dto.getPrice(),dto.getPub_date());
		System.out.println("저장완료");
	}
	

}
