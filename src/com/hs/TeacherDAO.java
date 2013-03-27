package com.hs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hs.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;

public class TeacherDAO implements TeacherDAOIF {

	@Override
	public void insert(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.update(teacher);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(String teacherNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "DELETE Teacher WHERE teacherNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, teacherNo);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Teacher queryByTeacherNo(String teacherNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Teacher WHERE teacherNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, teacherNo);
		List tmp = q.list();
		Iterator it = tmp.iterator();
		Teacher ret = null;
		if (it.hasNext()) {
			ret = (Teacher)it.next();
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
		String hql = "FROM Teacher";
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
