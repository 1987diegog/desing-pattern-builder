# Builder (Desing Pattern)
*Builder (Creational pattern)*
### Porque Builder hoy en día?
Una de las principales razones a la hora de elegir builder para la creación de objetos, es que puede ser dirigida, impidiendonos proseguir sin tener el paso previo, o mostrándonos determinadas alternativas en cada paso, con esta dirección nos aseguramos la correcta creación de un objeto complejo, por ejemplo en webTestClient la construcción del post() :

    webTestClient.post()
           .uri(UserResourse.PATH)
           .body(BodyInserters.fromValue(user))
           .exchange()
           .expectStatus().isOk()
           .expectBody(User.class)
           .value(Assertions::assertNotNull)
           .value(userData -> assertNotNull(userData.getUsername()));

A su vez en cada momento sabemos qué datos estamos seteando, sin tener que ir al método como pasaba antes en un constructor con muchos parámetros. 
