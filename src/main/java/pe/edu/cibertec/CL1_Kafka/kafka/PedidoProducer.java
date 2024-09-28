package pe.edu.cibertec.CL1_Kafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.CL1_Kafka.model.Pedido;

@Slf4j
@RequiredArgsConstructor
@Service
public class PedidoProducer {

    private  final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "Pedidos";

    public void enviarPedido(String mensaje){
        kafkaTemplate.send(TOPIC , mensaje);
        log.info("Mensaje Construido listo para enviar a Kafka");
    }



}
