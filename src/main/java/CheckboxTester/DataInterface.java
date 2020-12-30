package CheckboxTester;

import javax.sql.DataSource;
import java.util.List;

public interface DataInterface {
    public void setDataSource(DataSource source);
    public List<Roll> getData();
}
