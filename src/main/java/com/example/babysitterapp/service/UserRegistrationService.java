package com.example.babysitterapp.service;

import com.example.babysitterapp.entity.user.*;
import com.example.babysitterapp.repository.*;
import com.example.babysitterapp.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserRegistrationService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    BabyRepo babyRepo;

    @Autowired
    UserPreferenceRepo userPreferenceRepo;

    @Autowired
    NannyPreferenceRepo nannyPreferenceRepo;

    @Autowired
    UserDetailRepo userDetailRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(int userId) {
        userRepo.deleteById(userId);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    public UserPreference addUserPreference(int userId, UserPreference userPreference) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User loadedUser = user.get();
            loadedUser.setUserPreference(userPreference);
            User savedUser = userRepo.save(loadedUser);
            return savedUser.getUserPreference();
        }
        return null;
    }

    public UserPreference getUserPreference(int userId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            return user.get().getUserPreference();
        }
        return null;
    }

    public User deleteUserPreference(int userId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            UserPreference userPreference = dbUser.getUserPreference();
            dbUser.setUserPreference(null);
            userPreferenceRepo.delete(userPreference);
            userRepo.save(dbUser);
            return dbUser;
        }
        return null;
    }

    public void deleteUserPreferenceByID(int userId, int pref_id) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            dbUser.setUserPreference(null);
            userPreferenceRepo.deleteById(pref_id);
        }
    }

    public User updateUserPreference(int userId, UserPreference userPreference) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            UserPreference dbUserPreference = dbUser.getUserPreference();
            BeanUtils.copyNonNullProperties(userPreference, dbUserPreference);
            dbUser.setUserPreference(dbUserPreference);
            return dbUser;
        }
        return null;
    }

    public BabyDetail addBabyDetail(int userId, BabyDetail babyDetail) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User loadedUser = user.get();
            loadedUser.addBabyDetail(babyDetail);
            babyDetail.setUser(loadedUser);
            BabyDetail babyDetail1 = babyRepo.save(babyDetail);
            return babyDetail1;
        }
        return null;
    }

    public void removeBaby(int userId, int babyId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User loadedUser = user.get();
            List<BabyDetail> babyDetails = loadedUser.getBabyDetails().stream().filter(babyDetail -> babyDetail.getId() != babyId).collect(Collectors.toList());
            loadedUser.setBabyDetails(babyDetails);
            userRepo.save(loadedUser);
            babyRepo.deleteById(babyId);
        }
    }


    public User updateUser(User user) {
        Optional<User> dbUser = userRepo.findById(user.getId());
        if(dbUser.get() != null) {
            User saveUser = dbUser.get();
            BeanUtils.copyNonNullProperties(user, saveUser);
            userRepo.save(saveUser);
            return saveUser;
        }
        return null;
    }

    public List<BabyDetail> getAllBabyDetail(int userId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            User saveUser = dbUser.get();
            return saveUser.getBabyDetails();
        }
        return null;
    }

    public BabyDetail getBabyDetail(int userId, int babyId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            User saveUser = dbUser.get();
            return saveUser.getBabyDetails().stream().filter(babyDetail1 -> babyDetail1.getId() == babyId).findFirst().get();
        }
        return null;
    }

    public User updateBabyDetail(int userId, int babyId, BabyDetail babyDetail) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            User dbSavedUser = dbUser.get();
            BabyDetail dbBabyDetail = dbSavedUser.getBabyDetails().stream().filter(babyDetail1 -> babyDetail1.getId() == babyId).findFirst().get();
            BeanUtils.copyNonNullProperties(babyDetail, dbBabyDetail);
            List<BabyDetail> changedBabyDetails = dbSavedUser.getBabyDetails().stream().map(babyDetail1 -> {
                if (babyDetail1.getId() == babyId)
                    return dbBabyDetail;
                else
                    return babyDetail1;
            }).collect(Collectors.toList());
            dbSavedUser.setBabyDetails(changedBabyDetails);
            return dbSavedUser;
        }
        return null;
    }

    public NannyPreference getNannyPreference(int userId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            return dbUser.get().getNannyPreference();
        }
        return null;
    }

    public User deleteNannyPreference(int userId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            User savedUser = dbUser.get();
            NannyPreference nannyPreference = savedUser.getNannyPreference();
            nannyPreferenceRepo.delete(nannyPreference);
            savedUser.setNannyPreference(null);
            return savedUser;
        }
        return null;
    }

    public User updateNannyPreference(int userId, NannyPreference nannyPreference) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            NannyPreference dbNannyPreference = dbUser.getNannyPreference();
            BeanUtils.copyNonNullProperties(nannyPreference, dbNannyPreference);
            dbUser.setNannyPreference(dbNannyPreference);
            return dbUser;
        }
        return null;
    }

    public void deleteNannyPreferenceByID(int userId, int nannmyPrefId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            dbUser.setNannyPreference(null);
            nannyPreferenceRepo.deleteById(nannmyPrefId);
        }
    }

    public NannyPreference addNannyPreference(int userId, NannyPreference nannyPreference) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User loadedUser = user.get();
            loadedUser.setNannyPreference(nannyPreference);
            return loadedUser.getNannyPreference();
        }
        return null;
    }

    public UserDetail getUserDetail(int userId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            return dbUser.get().getUserDetail();
        }
        return null;
    }

    public User deleteUserDetail(int userId) {
        Optional<User> dbUser = userRepo.findById(userId);
        if(dbUser.get() != null) {
            User savedUser = dbUser.get();
            UserDetail nannyPreference = savedUser.getUserDetail();
            userDetailRepo.delete(nannyPreference);
            savedUser.setUserDetail(null);
            return savedUser;
        }
        return null;
    }

    public User updateUserDetail(int userId, UserDetail userDetail) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            UserDetail dbUserDetail = dbUser.getUserDetail();
            BeanUtils.copyNonNullProperties(userDetail, dbUserDetail);
            dbUser.setUserDetail(dbUserDetail);
            return dbUser;
        }
        return null;
    }

    public void deleteUserDetailByID(int userId, int detailId) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User dbUser = user.get();
            dbUser.setUserDetail(null);
            userDetailRepo.deleteById(detailId);
        }
    }

    public UserDetail addUserDetail(int userId, UserDetail userDetail) {
        Optional<User> user = userRepo.findById(userId);
        if(user.get() != null) {
            User loadedUser = user.get();
            loadedUser.setUserDetail(userDetail);
            return loadedUser.getUserDetail();
        }
        return null;
    }


    public List<User> getUserByType(String userType) {
        List<User> users = userRepo.findByUserType(userType);
        return users;
    }
}
