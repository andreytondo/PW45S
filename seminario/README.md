# Quarkus

Quarkus é um framework Java moderno e nativo para nuvem, idealizado para arquiteturas de microsserviços, contêineres e Kubernetes. 

Ele foi projetado para oferecer “Java supersônico e subatômico”, com tempo de inicialização e consumo de memória muito baixos. Criado inicialmente pela Red Hat em 2019 (como projeto comunitário) e lançado oficialmente em 2020, o Quarkus é open source sob **Apache License 2.0**. Atualmente reúne uma comunidade ativa com mais de 900 contribuidores e mais de 700 extensões.

## Vantagens

1. Tempo de boot extremamente rápido (graças à compilação antecipada para binário nativo com GraalVM e o footprint de memória reduzido). Ideal para ambientes em nuvem, serverless e elasticidade rápida.

2. Suporta live coding e testing em modo de desenvolvimento, oferecendo um trabalho fluido. 

3. Construído sobre padrões consolidados como Eclipse MicroProfile, JAX-RS (RESTEasy), CDI e Hibernate/JPA, além de integrar-se a bibliotecas populares como Apache Kafka, Camel, Spring APIs (via extensões), etc.

4. Suporte a programação reativa via Vert.x é nativo, permitindo aplicações altamente escaláveis.

## Desvantagens

1. Por ser relativamente novo, o ecossistema do Quarkus ainda é menor que o de frameworks consagrados (p. ex. Spring). 

2. Algumas bibliotecas menos comuns podem não ter suporte direto e a comunidade, embora crescente, é menor que a de alternativas de longa data.

3. Além disso, o uso avançado de GraalVM e compilação nativa pode implicar em uma curva de aprendizado extra e limitações (nem todas as APIs Java são totalmente compatíveis em modo nativo).

## Características Principais

O Quarkus foca em tempo de startup rápido e baixo consumo de memória, obtidos tanto no HotSpot quanto – especialmente – em imagens nativas GraalVM.

Ele oferece compatibilidade com Java EE/Jakarta EE e MicroProfile para que projetos existentes migrem facilmente, e tem suporte integrado a várias extensões (RESTEasy, Hibernate, SmallRye OpenAPI/Swagger, JAX-RS, etc.).

Além disso, recursos nativos para geração automática de manifestos Kubernetes e containers.

## Servidores Web

Internamente, o Quarkus usa o Eclipse Vert.x como camada HTTP fundamental e uma versão customizada do Undertow para suporte a servlets. Na prática, isso significa que recursos JAX-RS (RESTEasy) podem rodar sobre servlets do Undertow ou diretamente sobre Vert.x. O resultado é um servidor embutido leve, capaz de lidar tanto com APIs REST tradicionais quanto com programação reativa.

## Configuração

Para rodar aplicações Quarkus modernas, utilizamos Maven ou Gradle como ferramentas de build; Opcionalmente, recomenda-se instalar o Quarkus CLI via JBang ou SDKMAN, que facilita geração de projetos e execução em modo dev. As configurações da aplicação (portas, conexão com banco, etc.) ficam em application.properties ou application.yaml.

## Licença

O projeto é mantido majoritariamente pela Red Hat, mas é totalmente open source sob **Apache License 2.0**. A governança está migrando para uma fundação para reforçar a participação de outros fornecedores.

## Conclusões

Em resumo, o Quarkus é um framework promissor para aplicações Java modernas e baseadas em microsserviços. Ele simplifica a configuração inicial (geração de projeto via CLI, Dev Mode eficiente) e possui documentação oficial abrangente. A comunidade é ativa, mas ainda menor que a de frameworks veteranos como Spring. 

Por outro lado, há muito material novo (blogs, tutoriais, vídeos), e a documentação oficial cobre a maior parte dos casos de uso. Considera-se que Quarkus oferece boa facilidade de configuração, acelera o desenvolvimento com recarga automática e facilita a implantação em contêineres. 

Porém, é importante avaliar a maturidade do ecossistema e o custo de aprendizado da tecnologia nativa (GraalVM) caso se dependa de recursos específicos. Em geral, Quarkus é recomendado quando se busca performance em nuvem e aplicações leves, contando-se com uma comunidade em crescimento e suporte corporativo pela Red Hat.

# Aplicação CRUD

## Instalar ferramentas necessárias

Para executar o projeto, você precisará instalar as seguintes ferramentas:

1. Java JDK 17+.
2. Maven (ou Gradle).

## Criando o projeto

Utilize o Quarkus Maven Plugin (ou CLI) para gerar o esqueleto do projeto. Por exemplo, no terminal execute:

```bash
mvn io.quarkus:quarkus-maven-plugin:3.7.0:create \
    -DprojectGroupId=com.github.andreytondo \
    -DprojectArtifactId=quarkus-crud \
    -Dextensions="hibernate-orm,hibernate-validator,jdbc-postgresql,smallrye-openapi, rest-jackson, hibernate-orm-panache"
```

Após isso, entre na pasta do projeto:

```bash
cd quarkus-crud
```

## Configurando o projeto

No arquivo `src/main/resources/application.properties`, adicione as seguintes configurações:

```properties
# Configurações do banco de dados
quarkus.datasource.db-kind=postgresql
quarkus.datasource.username=postgres
quarkus.datasource.password=postgres
quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/quarkus_crud
quarkus.hibernate-orm.database.generation=update
```

## Executando o projeto

Para executar o projeto, utilize o seguinte comando:

```bash
mvn clean quarkus:dev
```