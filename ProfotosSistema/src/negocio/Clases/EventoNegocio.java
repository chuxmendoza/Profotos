package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;
import org.hibernate.criterion.Expression; 
import profotos.entidades.clases.Evento;

/**
 *
 * @author luis
 */
public class EventoNegocio {
       
    public static Evento Obtener(int id)
    { 
        Evento entidad = new Evento();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (Evento) session.createCriteria(Evento.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
}
