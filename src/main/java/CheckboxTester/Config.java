package CheckboxTester;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {
    @Bean("dataSource")
    public DataSource getDataSource()
    {
        DriverManagerDataSource source=new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgresql://35.226.23.157/mybase");
        source.setUsername("spring");
        source.setPassword("yavkin85");
        return source;
    }
}
