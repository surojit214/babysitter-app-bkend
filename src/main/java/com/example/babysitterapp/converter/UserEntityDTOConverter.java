package com.example.babysitterapp.converter;

import com.example.babysitterapp.dto.login.AuthorityDTO;
import com.example.babysitterapp.dto.registration.*;
import com.example.babysitterapp.entity.user.*;
import org.modelmapper.ModelMapper;

public class UserEntityDTOConverter {
    private static ModelMapper modelMapper = new ModelMapper();

    public static UserDTO convertToDto(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    public static User convertToEntity(UserDTO userDTO){
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }

    public static UserPreferenceDTO convertToDto(UserPreference userPreference) {
        UserPreferenceDTO userPreferenceDTO = modelMapper.map(userPreference, UserPreferenceDTO.class);
        return userPreferenceDTO;
    }

    public static UserPreference convertToEntity(UserPreferenceDTO userPreferenceDTO){
        UserPreference userPreference = modelMapper.map(userPreferenceDTO, UserPreference.class);
        return userPreference;
    }

    public static BabyDTO convertToDto(BabyDetail babyDetail) {
        BabyDTO babyDTO = modelMapper.map(babyDetail, BabyDTO.class);
        return babyDTO;
    }

    public static BabyDetail convertToEntity(BabyDTO babyDTO){
        BabyDetail babyDetail = modelMapper.map(babyDTO, BabyDetail.class);
        return babyDetail;
    }

    public static NannyPreferenceDTO convertToDto(NannyPreference userPreference) {
        NannyPreferenceDTO nannyPreferenceDTO = modelMapper.map(userPreference, NannyPreferenceDTO.class);
        return nannyPreferenceDTO;
    }

    public static NannyPreference convertToEntity(NannyPreferenceDTO userPreferenceDTO){
        NannyPreference nannyPreference = modelMapper.map(userPreferenceDTO, NannyPreference.class);
        return nannyPreference;
    }

    public static UserDetailDTO convertToDto(UserDetail userDetail) {
        UserDetailDTO userDetailDTO = modelMapper.map(userDetail, UserDetailDTO.class);
        return userDetailDTO;
    }

    public static UserDetail convertToEntity(UserDetailDTO userPreferenceDTO){
        UserDetail userDetail = modelMapper.map(userPreferenceDTO, UserDetail.class);
        return userDetail;
    }

    public static AuthorityDTO convertToDto(Authority auth) {
        AuthorityDTO authorityDTO = modelMapper.map(auth, AuthorityDTO.class);
        return authorityDTO;
    }

    public static Authority convertToEntity(AuthorityDTO authorityDTO){
        Authority authority = modelMapper.map(authorityDTO, Authority.class);
        return authority;
    }
}
