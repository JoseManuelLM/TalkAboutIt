
package mx.itson.talkaboutit.ui;

import java.time.LocalDate;
import mx.itson.talkaboutit.entities.*;
/**
 * Clase Main de la aplicación "TalkAboutIt".
 * Operaciones de prueba con los objetos User, Topic y Reply.
 * 
 * @author José Manuel Leyva Munguía
 */
public class Main {
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * @param args Los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Se crea un usuario user1 y se le asignan valores para nombre, email y contraseña.
        User user1 = new User();
        user1.setName("Juan Perez");
        user1.setEmail("JuanP@gmail.com");
        user1.setPassword("12345");
        // Se crea un usuario user2 y se le asignan valores para nombre, email y contraseña.
        User user2 = new User();
        user2.setName("Esteban Jimenez");
        user2.setEmail("EstebanJ@gmail.com");
        user2.setPassword("54321");
        
        // Se obtiene el nombre y email del usuario user1 y se imprime en pantalla
        System.out.println("User Name: " + user1.getName());
        System.out.println("User Email: " + user1.getEmail());
        
        // Se crea un tema topic1 y se le asignan valores para título, contenido y autor.
        Topic topic1 = new Topic();
        topic1.setTitle("Mi amor por los coches.");
        topic1.setCategory("Coches.");
        topic1.setContent("Me gustan mucho los coches.");
        topic1.setAuthor(user1);
        
        // Se imprime el título, contenido y autor del topic1.
        System.out.println("Título del Topic1: " + topic1.getTitle());
        System.out.println("Categoría del Topic1: " + topic1.getCategory());
        System.out.println("Contenido del Topic1: " + topic1.getContent());
        System.out.println("Autor del Topic1: " + topic1.getAuthor().getName());
        
        // Se establece la fecha de creación del topic1 y se imprime.
        LocalDate CreationDate1 = LocalDate.of(2023, 10, 17);
        topic1.setCreationDate(CreationDate1);
        LocalDate topic1CreationDate = topic1.getCreationDate();
        System.out.println("Fecha de publicación del Topic1: " + topic1CreationDate);
        
        // Se crea una respuesta reply1 y se le asigna un contenido y un autor, los cuales se imprimen.
        Reply reply1 = new Reply();
        reply1.setContent("No me gustan los coches.");
        reply1.setAuthor(user2);
        topic1.addReply(reply1);
        System.out.println("Autor de la respuesta Reply1: " + reply1.getAuthor().getName());
        System.out.println("Respuesta: " + reply1.getContent());
        
        // Se establece la fecha de creación de reply1 y se imprime.
        LocalDate CreationDate2 = LocalDate.of(2023, 10, 18);
        reply1.setCreationDate(CreationDate2);
        LocalDate reply1CreationDate = reply1.getCreationDate();
        System.out.println("Fecha de publicación de la Reply1: " + reply1CreationDate);
        
        //Se agrega una subrespuesta subreply1 a la respuesta reply1
        Reply subreply1 = new Reply();
        subreply1.setContent("Oh! Entiendo...");
        subreply1.setAuthor(user1);
        reply1.addSubReply(subreply1);
        System.out.println("Autor de la subrespuesta Subreply1: " + subreply1.getAuthor().getName());
        System.out.println("Respuesta: " + subreply1.getContent());
        
        // Se establece la fecha de creación de subreply1 y se imprime.
        LocalDate CreationDate3 = LocalDate.of(2023, 10, 19);
        subreply1.setCreationDate(CreationDate3);
        LocalDate subreply1CreationDate = subreply1.getCreationDate();
        System.out.println("Fecha de publicación de la subreply1: " + subreply1CreationDate);
        
        // User1 le da UpVote al tema topic1 y a la respuesta reply1 y se guardan en un listado.
        topic1.upvote(user1);
        user1.addUpvotedTopicToList(topic1);
        reply1.upvote(user1);
        user1.addUpvotedReplyToList(reply1);
        
        // User2 le da DownVote al tema topic1 y a la respuesta reply1 y se guardan en un listado.
        topic1.downvote(user2);
        user2.addDownvotedTopicToList(topic1);
        reply1.downvote(user2);
        user2.addDownvotedReplyToList(reply1);
        
        // Se imprime el conteo de UpVotes y DownVotes del tema topic1 y la respuesta reply1
        System.out.println("Topic Upvotes: " + topic1.getUpvotes());
        System.out.println("Topic Downvotes: " + topic1.getDownvotes());

        System.out.println("Reply Upvotes: " + reply1.getUpvotes());
        System.out.println("Reply Downvotes: " + reply1.getDownvotes());

        
    }
    
}
