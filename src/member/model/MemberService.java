package member.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	@Autowired
	SqlSessionFactory fac;
	
	public boolean joinConfirm(MemberDTO dto){
		SqlSession ss = fac.openSession();
		try{			
			int r = ss.insert("member.insertMember",dto);
			if(r==1){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ss.close();
		}
	}
}
