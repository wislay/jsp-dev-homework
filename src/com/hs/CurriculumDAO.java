package com.hs;

import java.util.Iterator;
import java.util.List;
import com.hs.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;

public class CurriculumDAO implements CurriculumDAOIF {

	@Override
	public void insert(Curriculum curriculum) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(curriculum);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void update(Curriculum curriculum) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.update(curriculum);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(String listNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "DELETE Curriculum WHERE listNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, listNo);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Curriculum queryByListNo(String listNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Curriculum WHERE listNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, listNo);
		List tmp = q.list();
		Iterator it = tmp.iterator();
		Curriculum ret = null;
		if (it.hasNext()) {
			ret = (Curriculum)it.next();
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
		String hql = "FROM Curriculum";
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

	@Override
	public List queryByStudentNoInClass(String studentNoInClass) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Curriculum WHERE classNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, studentNoInClass);
		List ret = q.list();
		session.getTransaction().commit();
		session.close();
		return ret;
	}

	@Override
	public List queryByTeacherNo(String teacherNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Curriculum WHERE teacherNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, teacherNo);
		List ret = q.list();
		session.getTransaction().commit();
		session.close();
		return ret;
	}

}
