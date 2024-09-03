package com.multi.spring2.config;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomDBAppender extends AppenderBase<ILoggingEvent> {
    private BasicDataSource dataSource;

    @Override
    public void start() {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/shop2");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        super.start();
    }

    @Override
    protected void append(ILoggingEvent event) {
        String sql = "INSERT INTO logs (timestamp, level, logger, message, thread, exception) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, event.getTimeStamp());
            stmt.setString(2, event.getLevel().toString());
            stmt.setString(3, event.getLoggerName());
            stmt.setString(4, event.getFormattedMessage());
            stmt.setString(5, event.getThreadName());
            stmt.setString(6, event.getThrowableProxy() != null ? event.getThrowableProxy().getMessage() : null);
            stmt.executeUpdate();
        } catch (SQLException e) {
            addError("Failed to insert log entry", e);
        }
    }

    @Override
    public void stop() {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (SQLException e) {
                addError("Failed to close data source", e);
            }
        }
        super.stop();
    }
}
