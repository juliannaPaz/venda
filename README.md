# venda
Projeto modelo, contendo exemplo de classe abstrata e implementação de API REST

## Payload de exemplo para cadastro de produto

path POST: http://localhost:8080/maquiagem
```json
{
    "descricao" : "Rimel a prova de água",
    "quantidade" : 90,
    "preco" : 15.20,
    "tipoMaquiagem": "RIMEL"
}
```

path POST: http://localhost:8080/venda

```json
{
    "produtoId" : "691dc26d-d7ee-4507-acda-3c26f08b7deb",
    "quantidade": 3
}
```
### Acesso ao banco H2
http://localhost:8080/h2-console
