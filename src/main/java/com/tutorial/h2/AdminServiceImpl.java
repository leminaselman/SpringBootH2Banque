/*
 * package com.tutorial.h2;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * public class AdminServiceImpl {
 * 
 * @Autowired private AdminRepository adminRepository;
 * 
 * public List<Admin> getAllAdmins() { return adminRepository.findAll(); }
 * 
 * 
 * public Admin getAdminById(Long id) { return
 * adminRepository.findById(id).get(); }
 * 
 * 
 * public Admin addAdmin(Admin admin) { String password = admin.getPassword();
 * 
 * return adminRepository.save(admin); }
 * 
 * 
 * public void deleteAdmin(Long idAdmin) { Admin admin =
 * adminRepository.findById(idAdmin).get(); adminRepository.delete(admin); }
 * 
 * 
 * 
 * }
 */