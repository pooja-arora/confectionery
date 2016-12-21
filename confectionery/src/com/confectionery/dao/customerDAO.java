package com.confectionery.dao;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.confectionery.bean.Customer;

public class customerDAO {

	public void addData(String customerName, String item, int quantity,
			int pricePerItem, int totalCost) {

		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = cfg
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Customer customer = new Customer();
			customer.setCustomerName(customerName);
			customer.setItem(item);
			customer.setPricePerItem(pricePerItem);
			customer.setQuantity(quantity);
			customer.setTotalCost(totalCost);
			session.save(customer);
			transaction.commit();
			System.out.println("\n\n Details Added \n");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
