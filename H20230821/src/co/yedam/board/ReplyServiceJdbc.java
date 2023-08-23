package co.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ReplyServiceJdbc implements ReplyService{

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String query;

	void disconn() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public boolean add(Reply reply) {
		return false;
	}

	@Override
	public List<Reply> list(int page) {
		return null;
	}

	@Override
	public boolean del(int DatNum) {
		return false;
	}


	@Override
	public void save() {
		
	}



	@Override
	public Reply search(int BrdNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
