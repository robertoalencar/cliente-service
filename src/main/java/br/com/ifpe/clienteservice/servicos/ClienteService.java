package br.com.ifpe.clienteservice.servicos;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.ifpe.clienteservice.model.Cliente;

@Service
public class ClienteService {

    @Autowired
    private KafkaTemplate<String, Serializable> kafkaTemplate;

    public void save(String topico, Cliente cliente) {

	kafkaTemplate.send(topico, cliente);
    }

}