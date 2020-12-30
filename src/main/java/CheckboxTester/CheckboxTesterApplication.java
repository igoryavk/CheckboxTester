package CheckboxTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;

import java.util.List;

@SpringBootApplication
public class CheckboxTesterApplication implements CommandLineRunner {
    private DataInterface dao;
    @Autowired
	public void setDao(DataInterface dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(CheckboxTesterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Roll> rolls= dao.getData();
		for (Roll roll:rolls
			 ) {
			System.out.println(roll.getName());
		}

	}
}
