package org.apache.maven.archetypes.maven_archetype_quickstart;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

public class App{
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder jsonInputBuilder = new StringBuilder();

        try {
        	System.out.println("Input: ");
            String line;
            while ((line = reader.readLine()) != null && !line.trim().isEmpty()) {
                jsonInputBuilder.append(line);
            }

            String jsonInput = jsonInputBuilder.toString();
    
            // Parse JSON input
            List<User> users = mapper.readValue(jsonInput, new TypeReference<List<User>>() {});

            // Filter, sort, map
            List<OutputUser> result = users.stream()
                    .filter(user -> user.getAge() >= 18)
                    .sorted(Comparator.comparing((User u) -> {
                        try {
                            return ZonedDateTime.parse(u.getLastLogin());
                        } catch (DateTimeParseException e) {
                            System.err.println("Invalid date format for user: " + u.getFirstName() + " " + u.getLastName());
                            return ZonedDateTime.parse("1970-01-01T00:00:00Z");
                        }
                    }).reversed())
                    .map(u -> new OutputUser(u.getFirstName() + " " + u.getLastName(), u.getLastLogin()))
                    .collect(Collectors.toList());

            // Output result
            String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
            System.out.println("output: ");
            System.out.println(jsonOutput);

        } catch (JsonProcessingException e) {
            System.err.println("Invalid JSON input. Please check the format.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
