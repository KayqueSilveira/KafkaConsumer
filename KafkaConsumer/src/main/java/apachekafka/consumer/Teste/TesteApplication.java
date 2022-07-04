package apachekafka.consumer.Teste;

import apachekafka.consumer.Teste.eventos.ConsumidorEvento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		TesteApplication aplicacaoProducer = new TesteApplication();
		aplicacaoProducer.iniciar();
}

	public void iniciar(){
		log.info("iniciando a aplicação");
		ConsumidorEvento consumidor = new ConsumidorEvento();
		consumidor.executar();
	}

}
