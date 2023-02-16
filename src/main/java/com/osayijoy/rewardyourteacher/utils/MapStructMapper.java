package com.osayijoy.rewardyourteacher.utils;

import com.osayijoy.rewardyourteacher.dto.*;
import com.osayijoy.rewardyourteacher.entity.User;
import com.osayijoy.rewardyourteacher.entity.Wallet;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Mapper(
        componentModel = "spring"
)
@Component
public interface MapStructMapper {
    Wallet walletRequestToWallet(WalletRequest walletRequest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Wallet updateWalletFromWalletRequest(WalletRequest walletRequest, @MappingTarget Wallet wallet);

    WalletResponse walletToWalletResponse(Wallet wallet);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User updateUserFromTeacherRequestDTO(TeacherRequestDTO teacherRequestDTO, @MappingTarget User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User updateUserFromStudentRequestDTO(StudentRequestDTO studentRequestDTO, @MappingTarget User user);

    UserResponseDTO userToUserResponse(User user);

    TeacherResponseDTO userToTeacherResponseDTO(User user);
}