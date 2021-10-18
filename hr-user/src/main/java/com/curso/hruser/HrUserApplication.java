package com.curso.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HrUserApplication implements CommandLineRunner{

	//OBS essa classe nao é instanciada por padrao no SPRING, por isso
	// é necessario instanciar em um classe de configuracao(AppConfig) do spring e e injetar o Bean
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("BCRYPT = " + passwordEncoder.encode("123456"));
	}

}
