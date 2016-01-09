package negocio.Clases;
 
import negocio.utils.HibernateUtils; 
import org.hibernate.Session;
import org.hibernate.criterion.Projections; 
import profotos.entidades.clases.Iva; 

/**
 *
 * @author luis
 */
public class IvaNegocio {
       
    public static int Obtener()
    { 
        int tasa = 0;
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          tasa = (int) session.createCriteria(Iva.class).setProjection(Projections.projectionList()
                    .add(Projections.property("tasa"))).setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return tasa; 
    }
}
