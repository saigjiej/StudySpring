package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class); // java 설정
		
		//LoginDAO 가져오기
		//LoginDTO 가져와서 값을 입력한다 (kim, 1111)
		//insert_data 호출하기
		LoginDAO dao = ctx.getBean(LoginDAO.class);
//		LoginDTO dto = ctx.getBean(LoginDTO.class);
//		dto.setUserid("Kim");
//		dto.setUserpass(1111);
//		dao.insert_data(dto);
		
//		LoginDTO dto2 = ctx.getBean(LoginDTO.class);
//		dto2.setUserid("Lee");
//		dto2.setUserpass(2222);
//		dao.insert_data(dto2);
		
//		LoginDTO dto3 = ctx.getBean(LoginDTO.class);
//		dto3.setUserid("Park");
//   	dto3.setUserpass(3333);
//		dao.insert_data(dto3);
		
		// 수정
//		LoginDTO dto4 = ctx.getBean(LoginDTO.class);
//		dto4.setUserid("Kim");
//		dto4.setUserpass(55555);
//		dao.insert_data(dto4);
		
		//삭제(해야함)
		
		// select
		List<LoginDTO> list = dao.select_data();
		// list에 담겨있는 값들을 하나씩 LoginDTO 타입의 dto4에 대입시킨다.
		for(LoginDTO dto4 : list) { 
			System.out.println(dto4.getUserid());
			System.out.println(dto4.getUserpass());
		}
		
		
		ctx.close();

	}

}
