package rc.bootsecurity.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import rc.bootsecurity.model.Role;
import rc.bootsecurity.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();
        Role roleUser = new Role("USER");
        Role roleAdmin = new Role("ADMIN");
        Role roleManager = new Role("MANAGER");
        List<Role> roles1 = new ArrayList<Role>();
        List<Role> roles2 = new ArrayList<Role>();
        List<Role> roles3 = new ArrayList<Role>();
        List<Role> roles4 = new ArrayList<Role>();
        roles1.add(roleUser);
        roles2.add(roleAdmin);
        roles3.add(roleManager);
        roles4.add(roleAdmin);
        roles4.add(roleManager);
        
        // Crete users
        User dan = new User("dan",passwordEncoder.encode("dan123"), roles1);
        User admin = new User("admin",passwordEncoder.encode("dan123"), roles2);
        User manager = new User("manager",passwordEncoder.encode("dan123"), roles3);
        User adminEManager = new User("adminEManager",passwordEncoder.encode("dan123"), roles4);
        
//        User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
//        User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(dan,admin,manager);

        // Save to db
        this.userRepository.saveAll(users);
    }
}
