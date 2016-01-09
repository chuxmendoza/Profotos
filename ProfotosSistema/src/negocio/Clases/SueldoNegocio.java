package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;  
import org.hibernate.criterion.Expression;
import profotos.entidades.clases.Sueldo; 

/**
 *
 * @author luis
 */
public class SueldoNegocio {
       
    public static Sueldo Obtener()
    { 
        Sueldo entidad = new Sueldo();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (Sueldo) session.createCriteria(Sueldo.class).setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
}
