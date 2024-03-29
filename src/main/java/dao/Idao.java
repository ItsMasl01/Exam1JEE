package dao;

import java.sql.SQLException;
import java.util.List;

public interface Idao<T> {
    List<T> selectAll();
    T select(Long id);
    int insert(T t) throws SQLException;
    void update(T t);
    void delete(Long id);
}
