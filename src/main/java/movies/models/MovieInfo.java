package movies.models;

import com.google.auto.value.AutoValue;

import java.util.Map;

@AutoValue
public abstract class MovieInfo {
    abstract String movieName();
    abstract Map<String, String> metadata();

    public static MovieInfo create(String movieName, Map<String, String> metadata) {
        return new AutoValue_MovieInfo(movieName, metadata);
    }
}
