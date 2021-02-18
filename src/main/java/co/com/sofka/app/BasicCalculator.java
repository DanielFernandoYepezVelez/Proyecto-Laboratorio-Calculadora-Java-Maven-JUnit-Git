package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    // TODO: Completar Las Demás Operaciones Aritméticas

    public Long sub(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        if (number2 == 0) {
            throw new RuntimeException("La División Por Cero(0) No Es Válida");
        }

        logger.info( "Summing {} / {}", number1, number2 );
        return number1 / number2;
    }
}
