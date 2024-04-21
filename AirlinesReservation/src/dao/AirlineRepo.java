package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface AirlineRepo {
	ArrayList<Customer>list=new ArrayList<Customer>();
	LinkedHashMap<Integer, Customer>ec=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>pec=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>bc=new LinkedHashMap<Integer, Customer>();
}
