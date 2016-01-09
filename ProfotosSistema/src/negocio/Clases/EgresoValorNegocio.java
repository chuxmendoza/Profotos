package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;  
import org.hibernate.criterion.Expression;
import profotos.entidades.clases.EgresoValor; 

/**
 *
 * @author luis
 */
public class EgresoValorNegocio {
       
    public static EgresoValor Obtener(int id)
    { 
        EgresoValor entidad = new EgresoValor();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (EgresoValor) session.createCriteria(EgresoValor.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
}
