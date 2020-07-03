package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private String name;
    private String password;
    @JsonManagedReference
    private UserInfoDto userInfo;
    @JsonManagedReference
    private List<AddressDto> addresses;
    private Set<TopicDto> topics;
}
