package com.hs;

import java.util.Iterator;
import java.util.List;
import com.hs.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;

public class UserDAO implements UserDAOIF {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "DELETE User WHERE id=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, id);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User queryById(String id) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM User WHERE id=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, id);
		List tmp = q.list();
		Iterator it = tmp.iterator();
		User ret = null;
		if (it.hasNext()) {
			ret = (User)it.next();
		}
		session.getTransaction().commit();
		session.close();
		return ret;
	}

	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM User";
		Query q = session.createQuery(hql);
		List ret = q.list();
		session.getTransaction().commit();
		session.close();
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
