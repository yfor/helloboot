package hello;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
public class HelloController {
    private final MapperTest m;

    public HelloController(MapperTest m, DataSource dataSource) {
        this.m = m;
        this.dataSource = dataSource;
    }


    private final  DataSource dataSource;
    @RequestMapping("/")
    public String index() {
//        DruidDataSource wrapper=(DruidDataSource)dataSource;
//        wrapper.setUrl("jdbc:mysql://localhost:3306/test");
//        wrapper.setUsername("root");
//        wrapper.setPassword("root");
//        wrapper.setDriverClassName("com.mysql.jdbc.Driver");
        try {
            dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Test a = m.findByidt(1);
        Accounts aa = m.findByid(1);
        return "Greetings from Spring Boot!"+a+aa;
    }

}