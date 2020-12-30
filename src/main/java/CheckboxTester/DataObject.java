package CheckboxTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component("dao")
public class DataObject implements DataInterface {
    private DataSource dataSource;
    private JdbcTemplate template;
    @Autowired
    @Override
    public void setDataSource(DataSource source) {
        dataSource=source;
        template=new JdbcTemplate(dataSource);
    }

    @Override
    public List<Roll> getData() {
        List<Roll> rolls;
        rolls=template.query("select * from shikado",new DataMapper());
        return rolls;
    }
}
