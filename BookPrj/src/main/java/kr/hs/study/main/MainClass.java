package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		BookDAO dao = ctx.getBean(BookDAO.class);
		BookDTO dto = ctx.getBean(BookDTO.class);
		dto.setTitle("11");
		dto.setAuthor("김미림");
		dto.setPrice(10000);
		dto.setPub_date("2021.04.28");
		dao.insert_data(dto);
		
		ctx.close();


	}

}
