package pe.edu.cibertec.CL1_Kafka.kafka;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.CL1_Kafka.model.Pedido;

@Slf4j
@Service
public class PedidoConsumer {

    @KafkaListener(topics = "Pedidos", groupId = "pedido-service")
    public void obtenerMensaje(Pedido pedido){
        System.out.println("Pedido Recibido" + pedido);
        log.info("Mensaje recibido desde Kafka" + pedido);
    }

}
