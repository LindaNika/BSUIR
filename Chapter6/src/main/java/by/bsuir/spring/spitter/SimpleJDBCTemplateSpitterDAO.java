package by.bsuir.spring.spitter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

@SuppressWarnings("deprecation")
public class SimpleJDBCTemplateSpitterDAO extends SimpleJdbcDaoSupport{

	private static final String ADD_SPITTER = "insert into spitters(username,password,fullname) values(?,?,?)";
	private static final String SELECT_SPITTER_BY_ID = "select id, username, password, fullname from spitters where id=?";

	/*private SimpleJdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	public void addSpitter(Spitter s) {
		getSimpleJdbcTemplate().update(ADD_SPITTER, s.getUsername(), s.getPassword(), s.getFullname());

	}

	public Spitter getSpitterById(long id) {
		return getSimpleJdbcTemplate().queryForObject(SELECT_SPITTER_BY_ID, new ParameterizedRowMapper<Spitter>() {

			public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
				Spitter s = new Spitter();
				s.setId(rs.getLong(1));
				s.setUsername(rs.getString(2));
				s.setPassword(rs.getString(3));
				s.setFullname(rs.getString(4));

				return s;
			}
		}, id);

	}

}
