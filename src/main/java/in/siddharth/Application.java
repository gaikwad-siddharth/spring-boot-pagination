package in.siddharth;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.siddharth.entity.Employee;
import in.siddharth.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
		/*Sort ascending = Sort.by("empName").ascending();
		List<Employee> emps  = repo.findAll(ascending);
		emps.forEach(System.out::println);*/
		
		int pageNo= 1;
		PageRequest page = PageRequest.of(pageNo-1, 2);
		Page<Employee> findAll = repo.findAll(page);
		List<Employee> emps = findAll.getContent();
		emps.forEach(System.out::println);
		
	}

}
