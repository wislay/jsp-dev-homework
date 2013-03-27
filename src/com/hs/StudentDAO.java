package com.hs;

import java.util.Iterator;
import java.util.List;
import com.hs.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;

public class StudentDAO implements StudentDAOIF {

	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.update(student);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(String studentNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "DELETE Student WHERE studentNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, studentNo);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Student queryByStudentNo(String studentNo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Student WHERE studentNo=?";
		Query q = session.createQuery(hql);
		q.setParameter(0, studentNo);
		List tmp = q.list();
		Iterator it = tmp.iterator();
		Student ret = null;
		if (it.hasNext()) {
			ret = (Student)it.next();
		}
		session.getTransaction().commit();
		session.close();
		//Test
//		if (null == ret) {
//			System.out.println("[Test]ret is null!");
//		}
//		else {
//			System.out.println("[Test]ret is not null!");
//		}
		//Test
		return ret;
	}
	
//	public Student queryByStudentNo_v_2(String studentNo) {
//		// TODO Auto-generated method stub
//		Student ret = null;
//		List tmp = queryAll();
//		Iterator it = tmp.iterator();
//		while (it.hasNext()) {
//			Student stu = (Student)it.next();
//			if (stu.getStudentNo().equals(studentNo)) {
//				ret = stu;
//				break;
//			}
//		}
//		
//		return ret;
//	}

	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql = "FROM Student";
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
