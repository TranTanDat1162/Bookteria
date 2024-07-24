package org.example.profileservice.service;

import lombok.RequiredArgsConstructor;
import org.example.profileservice.dto.request.ProfileCreationRequest;
import org.example.profileservice.dto.response.UserProfileResponse;
import org.example.profileservice.entity.UserProfile;
import org.example.profileservice.mapper.IUserProfileMapper;
import org.example.profileservice.repository.IUserProfileRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final IUserProfileRepository userProfileRepository;
    private final IUserProfileMapper userProfileMapper;

    public UserProfileResponse createProfile(ProfileCreationRequest profileCreationRequest) {
        UserProfile userProfile = userProfileMapper.toUserProfile(profileCreationRequest);
        userProfile = userProfileRepository.save(userProfile);
        return userProfileMapper.toUserProfileResponse(userProfile);
    }

    public UserProfileResponse getProfile(String userId) {
        UserProfile userProfile = userProfileRepository.findById(userId).
                orElseThrow(() -> new RuntimeException("Profile not found"));
        return userProfileMapper.toUserProfileResponse(userProfile);
    }
}
