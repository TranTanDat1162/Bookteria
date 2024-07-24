package org.example.profileservice.mapper;

import org.example.profileservice.dto.request.ProfileCreationRequest;
import org.example.profileservice.dto.response.UserProfileResponse;
import org.example.profileservice.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest profileCreationRequest);
    UserProfileResponse toUserProfileResponse(UserProfile userProfileEntity);
}
