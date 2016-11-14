package member.model;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	@Autowired
	SqlSessionFactory fac;
	
	public boolean joinConfirm(){
		return true;
	}
}
