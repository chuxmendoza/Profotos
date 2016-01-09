package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;  
import org.hibernate.criterion.Restrictions; 
import profotos.entidades.clases.Venta;

/**
 *
 * @author luis
 */
public class VentaNegocio {
       
    public static Venta Obtener(int id)
    { 
        Venta entidad = new Venta();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (Venta) session.createCriteria(Venta.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
}
