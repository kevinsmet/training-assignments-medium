package com.netflix.simianarmy.aws.janitor;

public class DatabaseParameters {

    String dbDriver;
    String dbUser;
    String dbPass;
    String dbUrl;

    public DatabaseParameters(String dbDriver, String dbUser, String dbPass, String dbUrl) {
        this.dbDriver = dbDriver;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        this.dbUrl = dbUrl;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}
