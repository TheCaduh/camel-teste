import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;



public class RotaSimples {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();

        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer:treino?period=2000")
                    .log("Teste Apache Camel rodando!");
            }
        });

        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();

	}

}
