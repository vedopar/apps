package base.db;

import java.util.List;

public interface DBClient<K, D> {

    boolean update(DBEntry entry);

    boolean exists(K key);

    DBEntry get(K key) throws Exception;

    boolean delete(K key);

    List<DBEntry> query(String query) throws Exception;
}
