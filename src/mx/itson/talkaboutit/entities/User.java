
package mx.itson.talkaboutit.entities;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa un usuario registrado en la plataforma "TalkAboutIt".
 * Cada usuario tiene un nombre, dirección de correo electrónico, contraseña y listas de temas y respuestas votadas.
 * Los usuarios pueden votar temas y respuestas a favor o en contra.
 * 
 * @author José Manuel Leyva Munguía
 */
public class User {
    private String name;
    private String email;
    private String password;
    private List<Topic> upvotedTopics = new ArrayList<>();
    private List<Topic> downvotedTopics = new ArrayList<>();;
    private List<Reply> upvotedReplies = new ArrayList<>();;
    private List<Reply> downvotedReplies = new ArrayList<>();;
       
    // Constructor de la clase.
    public User() {
        
    }
    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }
    /**
     * Establece el nombre del usuario.
     * @param name El nombre del usuario.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Obtiene la dirección de correo electrónico del usuario.
     * @return La dirección de correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Establece la dirección de correo electrónico del usuario.
     * @param email La dirección de correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Establece la contraseña del usuario.
     * @param password La contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }
     /**
     * Agrega un tema a la lista de temas votados a favor por el usuario.
     * @param topic El tema que el usuario votó a favor.
     */   
    public void addUpvotedTopicToList(Topic topic) {
        upvotedTopics.add(topic);
    }
    /**
     * Agrega un tema a la lista de temas votados en contra por el usuario.
     * @param topic El tema que el usuario votó en contra.
     */
    public void addDownvotedTopicToList(Topic topic) {
        downvotedTopics.add(topic);
    }
    /**
     * Agrega una respuesta a la lista de respuestas votadas a favor por el usuario.
     * @param reply La respuesta que el usuario votó a favor.
     */
    public void addUpvotedReplyToList(Reply reply) {
        upvotedReplies.add(reply);
    }
    /**
     * Agrega una respuesta a la lista de respuestas votadas en contra por el usuario.
     * @param reply La respuesta que el usuario votó en contra.
     */
    public void addDownvotedReplyToList(Reply reply) {
        downvotedReplies.add(reply);
    }


}
