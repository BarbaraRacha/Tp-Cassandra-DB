package racha.barbara.tp7cassandradb.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import racha.barbara.tp7cassandradb.tables.Product;

@Repository
public interface ProductRepository extends CassandraRepository<Product, String> {
}
