package day13;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 리스너
// 외부에서 동작을 감지하여 특정 메서드를 수행하는 대상
@WebListener
public class InitialMember implements ServletContextListener{
// 인터페이스가 갖는 "강제성"
// Context는 서버단위 scope 
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//서버가 종료될때 동작하는 메서드 
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//서버가 시작할때 동작하는 메서드
		
		ArrayList<Member> datas = new ArrayList<>();
		for(int i=0; i<8; i++) {
			Member data = new Member("티모"+(i+1), "010-1234-123"+i);
			datas.add(data);
		}
		datas.add(new Member("아리", null));
		datas.add(new Member("가렌", null));
		
		ServletContext context = sce.getServletContext();
		// context는 서버 scope(application scope)
		context.setAttribute("datas", datas);
		context.setAttribute("data", new Member());
	}

}
