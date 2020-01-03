package mircoservice.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MircoserviceGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircoserviceGatewayZuulApplication.class, args);
	}

}
