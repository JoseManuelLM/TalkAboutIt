
package mx.itson.talkaboutit.entities;

/**
 * Representa un voto dado por un usuario en la plataforma "TalkAboutIt".
 * Cada voto contiene información sobre el usuario que votó y si el voto es a favor o en contra.
 * 
 * @author Josem
 */
public class Vote {
    private User user;
    private boolean isUpvote;
    
    /**
     * Constructor de la clase Vote.
     * @param user El usuario que emitió el voto.
     * @param isUpvote Indica si el voto es a favor (true) o en contra (false).
     */
    public Vote(User user, boolean isUpvote) {
        this.user = user;
        this.isUpvote = isUpvote;
    }
    /**
     * Obtiene el usuario que emitió el voto.
     * @return El usuario que emitió el voto.
     */
    public User getUser() {
        return user;
    }
    /**
     * Indica si el voto es a favor o en contra.
     * @return true si el voto es a favor, false si es en contra.
     */
    public boolean isUpvote() {
        return isUpvote;
    }
}
