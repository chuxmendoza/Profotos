package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;  
import org.hibernate.criterion.Restrictions;
import profotos.entidades.clases.Egreso;

/**
 *
 * @author luis
 */
public class EgresoNegocio {
       
    public static Egreso Obtener(int id)
    { 
        Egreso egreso = new Egreso();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          egreso = (Egreso) session.createCriteria(Egreso.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return egreso; 
    }
}
