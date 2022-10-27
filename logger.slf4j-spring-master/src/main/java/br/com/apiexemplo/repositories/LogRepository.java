package br.com.apiexemplo.repositories;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class LogRepository {
    private final static Logger LOGGER = Logger.getLogger(LogRepository.class.getName());

    private ObjectMapper objectMapper;

    public LogRepository() {
        objectMapper = new ObjectMapper();
    }

    public void log(Level level, Class clazz, Object object) {
        try {
            LOGGER.log(level, String.format("%s - %s", clazz.toString(), objectMapper.writeValueAsString(object)));
        } catch (JsonProcessingException e) {
            LOGGER.severe(e.getMessage());
        }
    }
}