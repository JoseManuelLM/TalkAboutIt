
package mx.itson.talkaboutit.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
/**
 * Representa una respuesta a un tema de discusión.
 * Cada respuesta tiene contenido, autor, votos y una fecha de creación.
 * Al igual que en los temas, los usuarios pueden votar a favor o en contra de una respuesta.
 * 
 * @author José Manuel Leyva Munguía
 */
public class Reply {
    private String content;
    private User author;
    private List<Vote> votes;
    private LocalDate creationDate;

    // Constructor de la clase.
    public Reply() {}
    
    // Inicializa la lista de votos.
    {
        votes = new ArrayList<>();
    }
    /**
     * Obtiene el contenido de la respuesta.
     * @return El contenido de la respuesta.
     */
    public String getContent() {
        return content;
    }
    /**
     * Establece el contenido de la respuesta.
     * @param content El contenido de la respuesta.
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * Obtiene el autor de la respuesta.
     * @return El autor de la respuesta.
     */
    public User getAuthor() {
        return author;
    }
    /**
     * Establece el autor de la respuesta.
     * @param author El autor de la respuesta.
     */
    public void setAuthor(User author) {
        this.author = author;
    }
    
    
    /**
     * Incrementa el voto positivo de la respuesta por un usuario.
     * @param user El usuario que vota.
     */
    public void upvote(User user) {
        votes.add(new Vote(user, true));
    }
    /**
     * Incrementa el voto negativo de la respuesta por un usuario.
     * @param user El usuario que vota.
     */
    public void downvote(User user) {
        votes.add(new Vote(user, false));
    }
    /**
     * Obtiene el número de votos positivos de la respuesta.
     * @return El número de votos positivos.
     */
    public int getUpvotes() {
        return (int)votes.stream().filter(Vote::isUpvote).count();
    }
    /**
     * Obtiene el número de votos negativos de la respuesta.
     * @return El número de votos negativos.
     */
    public int getDownvotes() {
        return (int)votes.stream().filter(vote -> !vote.isUpvote()).count();
    }
    /**
     * Obtiene la fecha de creación de la respuesta.
     * @return La fecha de creación de la respuesta.
     */
    public LocalDate getCreationDate(){
        return this.creationDate;
    }
    /**
     * Establece la fecha de creación de la respuesta.
     * @param creationDate La fecha de creación de la respuesta.
     */
    public void setCreationDate(LocalDate creationDate){
        this.creationDate = creationDate;
    }
}