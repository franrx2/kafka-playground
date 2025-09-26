# Kafka Playground (Spring Boot)

Demo mínima de productor/consumidor con Spring for Apache Kafka.

## Levantar Kafka
```bash
docker compose up -d
```
## Ejecutar la app
```bash
./mvnw spring-boot:run
```
## Probar
```bash
curl -X POST "http://localhost:8080/kafka/produce?message=hola"
```
Observa los logs del consumidor.
