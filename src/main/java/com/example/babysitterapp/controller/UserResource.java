package com.example.babysitterapp.controller;

import com.example.babysitterapp.converter.UserEntityDTOConverter;
import com.example.babysitterapp.dto.registration.*;
import com.example.babysitterapp.entity.user.*;
import com.example.babysitterapp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE}, origins = {"http://localhost:4200"})
public class UserResource {

    @Autowired
    UserRegistrationService userRegistrationService;

    //User APIS

    @PostMapping()
    public UserDTO registerUser(@RequestBody UserDTO userDTO) {
        User user = UserEntityDTOConverter.convertToEntity(userDTO);
        return UserEntityDTOConverter.convertToDto(userRegistrationService.addUser(user));
    }

    @PutMapping
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        User user = UserEntityDTOConverter.convertToEntity(userDTO);
        if (user.getBabyDetails() != null) {
            user.getBabyDetails().forEach(babyDetail -> {
                babyDetail.setUser(user);
            });
        }
        return UserEntityDTOConverter.convertToDto(userRegistrationService.updateUser(user));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
        userRegistrationService.deleteUser(id);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOS = new ArrayList<>();
        userRegistrationService.getAllUsers().forEach(user -> userDTOS.add(UserEntityDTOConverter.convertToDto(user)));
        return userDTOS;
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.getUser(id));
    }

    //User Detail APIS

    @GetMapping(value = "/{id}/detail")
    public UserDetailDTO getAllUserDetail(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.getUserDetail(id));
    }

    @DeleteMapping(value = "/{id}/detail")
    public UserDTO deleteUserDetail(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.deleteUserDetail(id));
    }

    @PutMapping(value = "/{id}/detail")
    public UserDTO updateUserDetail(@PathVariable("id") int id, @RequestBody UserDetailDTO userDetailDTO) {
        UserDetail userDetail = UserEntityDTOConverter.convertToEntity(userDetailDTO);
        return UserEntityDTOConverter.convertToDto(userRegistrationService.updateUserDetail(id, userDetail));
    }

    @DeleteMapping(value = "/{id}/detail/{detailId}")
    public ResponseEntity<String> deleteUserDetail(@PathVariable("id") int id, @PathVariable("detailId") int detailId) {
        userRegistrationService.deleteUserDetailByID(id, detailId);
        return new ResponseEntity<>("Successfully deleted user preference", HttpStatus.OK);
    }

    @PostMapping(value = "/{id}/detail")
    public UserDetailDTO addUserDetail(@RequestBody UserDetailDTO userDetailDTO, @PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.addUserDetail(id, UserEntityDTOConverter.convertToEntity(userDetailDTO)));
    }

    //User Preference API

    @GetMapping(value = "/{id}/preference")
    public UserPreferenceDTO getAllUserPreference(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.getUserPreference(id));
    }

    @DeleteMapping(value = "/{id}/preference")
    public UserDTO deleteUserPreference(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.deleteUserPreference(id));
    }

    @PutMapping(value = "/{id}/preference")
    public UserDTO updateUserPreference(@PathVariable("id") int id, @RequestBody UserPreferenceDTO userPreferenceDTO) {
        UserPreference userPreference = UserEntityDTOConverter.convertToEntity(userPreferenceDTO);
        return UserEntityDTOConverter.convertToDto(userRegistrationService.updateUserPreference(id, userPreference));
    }

    @DeleteMapping(value = "/{id}/preference/{pref_id}")
    public ResponseEntity<String> deleteUserPreference(@PathVariable("id") int id, @PathVariable("pref_id") int pref_id) {
        userRegistrationService.deleteUserPreferenceByID(id, pref_id);
        return new ResponseEntity<>("Successfully deleted user preference", HttpStatus.OK);
    }

    @PostMapping(value = "/{id}/preference")
    public UserPreferenceDTO addUserPreference(@RequestBody UserPreferenceDTO userPreferenceDTO, @PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.addUserPreference(id, UserEntityDTOConverter.convertToEntity(userPreferenceDTO)));
    }

    //Baby APIS

    @PostMapping(value = "/{id}/baby")
    public BabyDTO addBaby(@RequestBody BabyDTO babyDTO, @PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.addBabyDetail(id, UserEntityDTOConverter.convertToEntity(babyDTO)));
    }

    @DeleteMapping(value = "/{id}/baby/{baby_id}")
    public ResponseEntity deleteBaby(@PathVariable("id") int id, @PathVariable("baby_id") int babyId) {
        userRegistrationService.removeBaby(id, babyId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/{id}/baby")
    public List<BabyDTO> getAllBabies(@PathVariable("id") int id) {
        List<BabyDTO> babyDTOS = new ArrayList<>();
        userRegistrationService.getAllBabyDetail(id).forEach(baby -> babyDTOS.add(UserEntityDTOConverter.convertToDto(baby)));
        return babyDTOS;
    }

    @GetMapping(value = "/{id}/baby/{babyId}")
    public BabyDTO getAllBabies(@PathVariable("id") int id, @PathVariable("babyId") int babyId) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.getBabyDetail(id, babyId));
    }

    @PutMapping(value = "/{id}/baby/{babyId}")
    public UserDTO updateBabyDetail(@PathVariable("id") int id, @PathVariable("babyId") int babyId, @RequestBody BabyDTO babyDTO) {
        BabyDetail babyDetail = UserEntityDTOConverter.convertToEntity(babyDTO);
        babyDetail.setId(babyId);
        return UserEntityDTOConverter.convertToDto(userRegistrationService.updateBabyDetail(id, babyId, babyDetail));
    }

    //Nanny Preference API
    @GetMapping(value = "/{id}/nannypreference")
    public NannyPreferenceDTO getAllNannyPreference(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.getNannyPreference(id));
    }

    @DeleteMapping(value = "/{id}/nannypreference")
    public UserDTO deleteNannyPreference(@PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.deleteNannyPreference(id));
    }

    @PutMapping(value = "/{id}/nannypreference")
    public UserDTO updateNannyPreference(@PathVariable("id") int id, @RequestBody NannyPreferenceDTO nannyPreferenceDTO) {
        NannyPreference userPreference = UserEntityDTOConverter.convertToEntity(nannyPreferenceDTO);
        return UserEntityDTOConverter.convertToDto(userRegistrationService.updateNannyPreference(id, userPreference));
    }

    @DeleteMapping(value = "/{id}/nannypreference/{pref_id}")
    public ResponseEntity<String> deleteNannyPreference(@PathVariable("id") int id, @PathVariable("pref_id") int pref_id) {
        userRegistrationService.deleteNannyPreferenceByID(id, pref_id);
        return new ResponseEntity<>("Successfully deleted user preference", HttpStatus.OK);
    }

    @PostMapping(value = "/{id}/nannypreference")
    public NannyPreferenceDTO addNannyPreference(@RequestBody NannyPreferenceDTO nannyPreferenceDTO, @PathVariable("id") int id) {
        return UserEntityDTOConverter.convertToDto(userRegistrationService.addNannyPreference(id, UserEntityDTOConverter.convertToEntity(nannyPreferenceDTO)));
    }
}


