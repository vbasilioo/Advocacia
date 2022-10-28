package LOG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TesteLogger{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TesteLogger.class);
    
    public static void main(String[] args){
        LOGGER.info("Teste!");
    }
    
}
