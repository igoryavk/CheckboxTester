package CheckboxTester;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Roll roll=new Roll();
        roll.setName(rs.getString("name"));
        roll.setPrice(rs.getString("price"));
        roll.setComposition(rs.getString("composition"));
        return roll;
    }
}
