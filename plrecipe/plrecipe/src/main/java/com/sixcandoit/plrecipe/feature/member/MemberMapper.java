package com.sixcandoit.plrecipe.feature.member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectAllMember();
}
