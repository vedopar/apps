package base.db;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class DBEntry<K, D> {
    public abstract K key();
    public abstract D data();

    public static <K, D> DBEntry<K, D> create(K key, D data) {
        return new AutoValue_DBEntry<K, D>(key, data);
    }
}
