package org.apache.maven.archetypes.maven_archetype_quickstart;

public class OutputUser {
    private String name;
    private String lastLogin;

    public OutputUser(String name, String lastLogin) {
        this.name = name;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public String getLastLogin() {
        return lastLogin;
    }
}
