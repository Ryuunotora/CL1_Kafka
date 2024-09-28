package pe.edu.cibertec.CL1_Kafka.model;

import lombok.Data;

@Data
public class Pedido {

    private Long id;
    private String producto;
    private Integer cantidad;
    private  String ClienteEmail;

}
