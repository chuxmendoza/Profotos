package negocio.Clases;



import negocio.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import profotos.entidades.clases.Usuario;

/**
 *
 * @author luis
 */
public class UsuarioNegocio {
       
    public static boolean Login(String login, String pass)
    {
        boolean realizado = false;
        int id = 0;
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          id = (int) session.createCriteria(Usuario.class).setProjection(Projections.projectionList()
                    .add(Projections.property("id"))).uniqueResult();
          if (id > 0)
              realizado = true;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return realizado; 
    }
}
