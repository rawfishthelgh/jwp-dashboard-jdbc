package nextstep.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    private UserMapper() {
    }

    private static class UserMapperGenerator {
        private static final UserMapper INSTANCE = new UserMapper();
    }

    public static UserMapper getInstance() {
        return UserMapperGenerator.INSTANCE;
    }

    @Override
    public User mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("account"),
                rs.getString("password"),
                rs.getString("email"));
    }
}
