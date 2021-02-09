package com.example.SpringBootApplication.ServiceImpl;

import com.example.SpringBootApplication.Model.User;
import com.example.SpringBootApplication.Repository.UserRepository;
import com.example.SpringBootApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getList() {
		return userRepo.findAll();
	}

	public Optional<User> findById(Long id) {
		return userRepo.findById(id);
	}

	public List<User> findByVornameLike(String Vorname) {

		return userRepo.findByVornameLike(Vorname);
	}

	public List<User> findByNameLike(String Name) {

		return userRepo.findByNameLike(Name);
	}

}
