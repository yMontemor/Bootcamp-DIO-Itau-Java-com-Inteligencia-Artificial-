# 📅 Cronograma Semanal de Estudos

Este roteiro detalha as atividades e conceitos a serem cobertos ao longo das 4 semanas de preparação.

---

## Semana 1: Domínio de POO e Tratamento de Erros
> **Foco:** Revisar conceitos de Programação Orientada a Objetos e implementar um tratamento de exceções blindado.

### 📝 Tópicos de Estudo
- [ ] **Classes, Objetos e Métodos:** Diferenciação entre atributos específicos e comuns.
- [ ] **Herança e Interfaces:** Uso correto de `extends`, `super()` e boas práticas para evitar a repetição de código (DRY).
- [ ] **Polimorfismo:** Sobrescrita de métodos (`@Override`) e tipos dinâmicos.
- [ ] **Tratamento de Exceções:** Uso de blocos `try/catch`, tratamento correto de `NullPointerException` e proteção do fluxo de dados.

### 🎯 Resultado Esperado
Código limpo, estruturado, reutilizável e com validações e tratamento de erros robustos.

---

## Semana 2: Banco de Dados e SQL Estratégico
> **Foco:** Aprofundar na modelagem relacional e otimização de consultas (queries).

### 📝 Tópicos de Estudo
- [ ] **PostgreSQL:** Instalação, configuração e organização de esquemas (ex: `APP`, `BI`).
- [ ] **Relacionamentos:** Definição de chaves primárias e estrangeiras (PK/FK) mapeando Beneficiários, Bairros e Doações.
- [ ] **Consultas Avançadas:** Escrita de `JOINs`, agrupamentos (`GROUP BY`) e funções agregadas condicionais como `SUM(CASE...)` para geração de indicadores.
- [ ] **Modelagem de Dados:** Elaboração do Diagrama Entidade-Relacionamento (DER) e sua transição para o modelo físico.

### 🎯 Resultado Esperado
Capacidade de modelar bancos de dados eficientes e consultar bases complexas garantindo performance.

---

## Semana 3: Protocolo HTTP e Fundamentos de APIs REST
> **Foco:** Compreender a comunicação cliente-servidor e a estrutura de APIs modernas.

### 📝 Tópicos de Estudo
- [ ] **Verbos HTTP:** Uso adequado dos métodos HTTP (`GET`, `POST`, `PUT`, `DELETE`).
- [ ] **JSON (JavaScript Object Notation):** Estruturação e serialização de dados para tráfego na rede.
- [ ] **HTTP Status Codes:** Respostas apropriadas da API (ex: `200 OK`, `201 Created`, `400 Bad Request`, `404 Not Found`, `500 Internal Server Error`).
- [ ] **Documentação de APIs:** Introdução aos padrões OpenAPI e ferramentas como Swagger.

### 🎯 Resultado Esperado
Compreensão total do ciclo de requisição e resposta na Web e modelagem correta de endpoints REST.

---

## Semana 4: Integração Total com Spring Boot
> **Foco:** Construir uma API completa integrando todos os conceitos anteriores através do Spring Boot.

### 📝 Tópicos de Estudo
- [ ] **Configuração do Projeto:** Inicialização via *Spring Initializr* com as dependências `Spring Web`, `Spring Data JPA` e `PostgreSQL Driver`.
- [ ] **Arquitetura de Software:** Aplicação prática do modelo **RAPITO** (Requisitos, Análise, Projeto, Implementação, Teste, Operação).
- [ ] **Spring Data JPA:** Mapeamento objeto-relacional e substituição de SQL manual por interfaces de repositórios.
- [ ] **Camadas da Aplicação:** Divisão clara de responsabilidades entre Controllers (exposição de endpoints) e Services (regras de negócio).

### 🎯 Resultado Esperado
Entrega de um projeto CRUD funcional e completo em Java integrado a um banco PostgreSQL.
