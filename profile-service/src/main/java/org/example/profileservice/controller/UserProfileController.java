package org.example.profileservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.profileservice.dto.request.ProfileCreationRequest;
import org.example.profileservice.dto.response.UserProfileResponse;
import org.example.profileservice.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping("/users")
    public UserProfileResponse createProfile(@RequestBody ProfileCreationRequest profileCreationRequest) {
        return userProfileService.createProfile(profileCreationRequest);
    }

    @GetMapping("/users/{profileId}")
    public UserProfileResponse getProfile(@PathVariable String profileId) {
        return userProfileService.getProfile(profileId);
    }
}
