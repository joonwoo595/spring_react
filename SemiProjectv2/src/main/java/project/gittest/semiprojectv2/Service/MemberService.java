package project.gittest.semiprojectv2.Service;

import project.gittest.semiprojectv2.domain.Member;
import project.gittest.semiprojectv2.domain.MemberDTO;

public interface MemberService {

    boolean newMember(MemberDTO member);

    Member loginMember(MemberDTO member);
}