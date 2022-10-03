package nextstep.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.lang.Nullable;

@FunctionalInterface
public interface RowMapper<T> {
    @Nullable
    <T> T mapRow(ResultSet rs, int rowNum) throws SQLException;
}
