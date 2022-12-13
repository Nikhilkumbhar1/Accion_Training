package com.accion;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.accion.entity.Person;
import com.accion.entity.PhoneNumber;
import com.accion.service.PersonMgmt;

@SpringBootApplication
public class AssociationOneToMany1Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AssociationOneToMany1Application.class, args);
		      PersonMgmt bean = context.getBean(PersonMgmt.class);
		
			PhoneNumber ph = new PhoneNumber();
			ph.setPhoneNumber(9999999999L);
			ph.setNumberType("office");
			ph.setProvider("Airtel");

			PhoneNumber ph1 = new PhoneNumber();
			ph1.setPhoneNumber(8888888888L);
			ph1.setNumberType("home");
			ph1.setProvider("Jio");

			//Parent Objet

			Person per = new Person();
			per.setpName("Rajesh");
			per.setpAddrs("Hyd");
			per.setPhonesInfo(Set.of(ph,ph1));
			 System.out.println(per);
			bean.saveDataUsingParent(per);

		
	}
	}


