package curso.angular.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import curso.angular.hibernate.HibernateUtil;

public abstract class DaoImplementacao<T> implements DaoInterface<T> {
	
	private Class<T> persistenceClass; 
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public DaoImplementacao(Class<T> persistenceClass){
		super();
		this.persistenceClass = persistenceClass;
	}
	
	@Override
	public void salvar(T objeto) throws Exception {
		sessionFactory.getCurrentSession().save(objeto);	
	}
	
	@Override
	public void deletar(T objeto) throws Exception {
		sessionFactory.getCurrentSession().delete(objeto);
	}
	
	@Override
	public void atualizar(T objeto) throws Exception {
		sessionFactory.getCurrentSession().update(objeto);
	}
	
	@Override
	public void salvarOuAtualizar(T objeto) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(objeto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T merger(T objeto) throws Exception {
		return  (T) sessionFactory.getCurrentSession().merge(objeto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> lista() throws Exception {
		return sessionFactory.getCurrentSession().createCriteria(persistenceClass).list();
	}
	
	
	
}
