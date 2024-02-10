package dev.flavio.consumer;

import io.quarkus.logging.Log;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class RmqConsumer {

    private final static String CONST_FILA = "quarkus-rabbitmq";

    @Incoming(CONST_FILA)
    public void process(JsonObject msg){
        Log.info(msg.toString());
    }
}
