/*package com.example.demo.service;

import org.springframework.security.core.admindetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl extends AdminService {

	
	private AdminRepository adminRepo;
	
	public AdminServiceImpl(AdminRepository adminRepo) {
		super();
		this.adminRepo = adminRepo;
	}


	@Override
    public AdminDetails loadAdminByUsername(String username) throws AdminnameNotFoundException {
        Admin admin = adminRepo.findByEmail(username);
    	if(admin == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
			
	
        return new AdminDetails(admin);
    }
	
}
*/