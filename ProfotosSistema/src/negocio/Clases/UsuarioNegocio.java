package negocio.Clases;
 
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;  
import profotos.entidades.clases.Perfil;
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
    
    public static Usuario Obtener(int id)
    { 
        Usuario entidad = new Usuario();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (Usuario) session.createCriteria(Usuario.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    public static Boolean Guardar(String login, String pass, String nombre, Perfil perfil)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSessionFactory().openSession();    
             tx = session.beginTransaction();
             Usuario entidad = new Usuario();
             entidad.setLogin(login);
             entidad.setPass(pass);
             entidad.setNombre(nombre);
             entidad.setPerfil(perfil);
             session.save(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Boolean Editar(int id, String login, String pass, String nombre, Perfil perfil)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSessionFactory().openSession();    
             tx = session.beginTransaction();
             Usuario entidad = Obtener(id);
             entidad.setLogin(login);
             entidad.setPass(pass);
             entidad.setNombre(nombre);
             entidad.setPerfil(perfil);
             session.update(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Boolean Eliminar(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSessionFactory().openSession();    
             tx = session.beginTransaction();
             Usuario entidad = Obtener(id); 
             session.delete(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Perfil ObtenerPerfil(int id)
    {
        Perfil perfil = Perfil.ADMIN;
        try 
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("id", id));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("perfil")));
            perfil = (Perfil) crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return perfil;
    }
    
    public static String ObtenerNombre(int id)
    {
        String nombre = "";
        try 
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("id", id));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("nombre")));
            nombre = (String) crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return nombre;
    }
    
    public static Boolean ValidarLogin(String login)
    {
        boolean realizado = false;
        Integer id = 0;
        try 
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.eq("login", login));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("id")));
            id = (Integer) crit.uniqueResult();
            realizado = id != null ? true : false;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return realizado;
    }
    
    public static List<Usuario> Listado()
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Usuario.class);
            lista = (List<Usuario>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Usuario> Buscar(String nombre)
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Usuario>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
}
