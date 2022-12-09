<!-- cSpell:disable -->
# Exercícios Moodle

Instituto Federal de Educação, Ciência e Tecnologia de Mato Grosso do Sul - **IFMS** <br>
Tecnologia em Análise e Desenvolvimento de Sistemas - **TADS6** <br>
Desenvolcimento de Sistemas Distribuidos - **DSD** <br>
Campus Três Lagoas <br>
**Professor:** Vinicius Gomes Ferreira <br>
**Aluno:** Maurício da Silva Batista

---

## Seção 2

Implementação de um serviço **Calculadora** que realiza soma por meio de requisições REST e passagem de parâmetros via URL (Path Params). Este é o contrato:

```bash
# Endpoint GET:
/calculator/{num1}/{num2}
```

Estender as funcionalidades da calculadora do exercício anterior, a resposta deve ser a soma dos números em **num1** e **num2** para contemplar o seguinte contrato:

```bash
# Endpoint POST:
/calculator

# Request Body:
{
    "num1": 1,
    "num2": 2
}
```

---

## Seção 3

Estender as funcionalidades da calculadora do exercício anterior, devolvendo uma exceção personalizada do tipo **ArithhmeticException** com status code **400** (BAD_REQUEST) por meio de um JSON a ser exibido no naveagador. Para contemplar o seguinte contrato:

```bash
# Endpoint GET:
/sum/{num1}/{num2}
```

---

## Evidências

Prints das requisições, mostrando a **URL**, **Request Body** (POST) e **Response**. <br>
Requisições feitas na Extensão **ThunderClient** do VSCode com a aplicação **SpringBoot** executando. <br>
Para cada requisição há dois prints, um de sucesso exibindo o resultado, e outro de falha exibindo o Response com a mensagem da Exceção.

```bash
# Imagens:
/src/main/resources/static
```
