package pe.edu.cibertec.CL1_Kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL1_Kafka.kafka.PedidoProducer;
import pe.edu.cibertec.CL1_Kafka.model.Pedido;

@RequiredArgsConstructor
@RestController
public class PedidoController {

    private final PedidoProducer pedidoProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        pedidoProducer.enviarPedido(mensaje);
        return "Pedido enviado a Kafka";
    }


}
