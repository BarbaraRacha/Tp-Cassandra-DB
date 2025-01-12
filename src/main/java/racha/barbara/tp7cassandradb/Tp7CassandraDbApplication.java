package racha.barbara.tp7cassandradb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import racha.barbara.tp7cassandradb.helpers.ProductFactory;
import racha.barbara.tp7cassandradb.repositories.ProductRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class Tp7CassandraDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp7CassandraDbApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository repository) {

        return args -> {
            Stream.generate(ProductFactory::get)
                    .limit(10)
                    .forEach(repository::save);
        };
    }
}
