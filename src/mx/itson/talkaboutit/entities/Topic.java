
package mx.itson.talkaboutit.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
/**
 * Representa un tema de discusión.
 * Cada tema tiene un título, contenido, autor, respuestas, votos y una fecha de creación.
 * Los usuarios pueden votar a favor o en contra de un tema y añadir respuestas.
 * 
 * @author José Manuel Leyva Munguía
 */
public class Topic {
    private String title;
    private String content;
    private User author;
    private String category;
    private List<Reply> replies;
    private List<Vote> votes;
    private LocalDate creationDate;
       
    //Constructor de la clase.
    public Topic() {}
    
    // Inicializa la lista de votos.
    {
        votes = new ArrayList<>();
    }
    /**
     * Obtiene el título del tema.
     * @return El título del tema.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Obtiene el contenido del tema.
     * @return El contenido del tema.
     */
    public String getContent() {
        return content;
    }
    /**
     * Obtiene el autor del tema.
     * @return El autor del tema.
     */
    public User getAuthor() {
        return author;
    }
    
    /**
     * Establece el título del tema.
     * @param title El título del tema.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Establece el contenido del tema.
     * @param content El contenido del tema.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Establece el autor del tema.
     * @param author El autor del tema.
     */
    public void setAuthor(User author) {
        this.author = author;
    }
    
    /**
     * Obtiene la categoría del tema.
     * @return La categoría del tema.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Establece la categoría del tema.
     * @param category La categoría del tema.
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    /**
     * Incrementa el voto positivo del tema por un usuario.
     * @param user El usuario que vota.
     */
    public void upvote(User user) {
        votes.add(new Vote(user, true));
    }
    /**
     * Incrementa el voto negativo del tema por un usuario.
     * @param user El usuario que vota.
     */
    public void downvote(User user) {
        votes.add(new Vote(user, false));
    }
    /**
     * Obtiene el número de votos positivos del tema.
     * @return El número de votos positivos.
     */
    public int getUpvotes() {
        return (int)votes.stream().filter(Vote::isUpvote).count();
    }
    /**
     * Obtiene el número de votos negativos del tema.
     * @return El número de votos negativos.
     */
    public int getDownvotes() {
        return (int)votes.stream().filter(vote -> !vote.isUpvote()).count();
    }

    /**
     * Añade una respuesta al tema.
     * @param reply La respuesta a añadir.
     */
    public void addReply(Reply reply) {
        replies.add(reply);
    }
    /**
     * Elimina una respuesta del tema.
     * @param reply La respuesta a eliminar.
     */
    public void removeReply(Reply reply) {
        replies.remove(reply);
    }
    /**
     * Obtiene la fecha de creación del tema.
     * @return La fecha de creación del tema.
     */
    public LocalDate getCreationDate(){
        return this.creationDate;
    }
    /**
     * Establece la fecha de creación del tema.
     * @param creationDate La fecha de creación del tema.
     */
    public void setCreationDate(LocalDate creationDate){
        this.creationDate = creationDate;
    }
}
