# Builder (Desing Pattern)
*Builder (Creational pattern)*
### Porque Builder hoy en día?
La creación de objetos, y más que nada la creación de objetos teledirigidos esta imponiendose hoy en día, ya que nos impide proseguir sin tener el paso previo, esto nos asegura la correcta creación de un objeto. Podemos ver un ejemplo claro al utilizar webTestClient

    webTestClient.post()
           .uri(UserResourse.PATH)
           .body(BodyInserters.fromValue(user))
           .exchange()
           .expectStatus().isOk()
           .expectBody(User.class)
           .value(Assertions::assertNotNull)
           .value(userData -> assertNotNull(userData.getUsername()));

