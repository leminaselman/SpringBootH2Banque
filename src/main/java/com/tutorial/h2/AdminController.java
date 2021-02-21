/*
 * package com.tutorial.h2;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * 
 * @RequestMapping("/admin") public class AdminController {
 * 
 * @Autowired AdminService adminService;
 * 
 * private final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
 * 
 * 
 * @PostMapping("/new") public Admin addAdmin(@RequestBody Admin admin) { return
 * adminService.addAdmin(admin); }
 * 
 * @GetMapping("/all") public List<Admin> getComptes() {
 * LOGGER.debug("Laffichage de tout les admin est un risque"); return
 * adminService.getAllAdmins(); }
 * 
 * @GetMapping("/{id}") public Admin getCompte(@PathVariable Long id) { return
 * adminService.getAdminById(id); }
 * 
 * @PostMapping("/delete") public String deleteClient(@RequestBody Admin admin)
 * { adminService.deleteAdmin(admin.getIdAdmin()); return "Done"; }
 * 
 * }
 */