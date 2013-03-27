package com.hs;

import java.util.Iterator;
import java.util.List;
import com.hs.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;

public class CourseDAO implements CourseDAOIF {

	@Override
	public void insert(Course course) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.update(course);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(String courseId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "DELETE Course WHERE courseId=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, courseId);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Course queryByCourseId(String courseId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Course WHERE courseId=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, courseId);
		List tmp = q.list();
		Iterator it = tmp.iterator();
		Course ret = null;
		if (it.hasNext()) {
			ret = (Course)it.next();
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
		String hql = "FROM Course";
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
