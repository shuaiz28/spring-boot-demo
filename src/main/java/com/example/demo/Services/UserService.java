package com.example.demo.Services;

import com.example.demo.Infrastructures.Repositories.Entities.User;
import com.example.demo.Infrastructures.Repositories.UserRepository;
import com.example.demo.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> toDto(user))
                .collect(Collectors.toList());
    }

    public UserDto getUser(String id) {
        return toDto(userRepository.getOne(id));
    }

    public void addUser(UserDto userDto) {
        userRepository.save(toEntity(userDto));
    }

    public void updateUser(String id, UserDto userDto) {
        userRepository.save(toEntity(userDto));
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public UserDto toDto(User user) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDto.class);
    }

    public User toEntity(UserDto userDto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDto, User.class);
    }
}
