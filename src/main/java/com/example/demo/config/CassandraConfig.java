package com.example.demo.config;

import lombok.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.example.yourproject.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    @NonNull
    protected String getKeyspaceName() {
        return "student_db"; // Replace with your keyspace name
    }

    @Override
    protected String getLocalDataCenter() {
        return "datacenter1"; // Ensure this matches your Cassandra cluster
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }
}
