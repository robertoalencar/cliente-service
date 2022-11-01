package br.com.ifpe.clienteservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.clienteservice.config.TopicosKafka;
import br.com.ifpe.clienteservice.model.Cliente;
import br.com.ifpe.clienteservice.servicos.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Cliente cliente) {

	clienteService.save(TopicosKafka.TOPICO_CLIENTE_SAVE, cliente);
	return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
