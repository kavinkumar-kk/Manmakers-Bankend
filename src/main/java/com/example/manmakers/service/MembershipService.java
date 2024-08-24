package com.example.manmakers.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import com.example.manmakers.entity.membership;
import com.example.manmakers.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MembershipService {
@Autowired
    private MembershipRepository membershipRepository;

    public List<membership> getMemberships(){

        List<membership> membershipList = new ArrayList<>();

        membershipRepository.findAll().forEach(item -> membershipList.add(item));

        return membershipList;
        
    }

    public String createMemberships(membership member){
        membershipRepository.save(member);
        return "Membership created successfully";
    }

    public membership getMember(Integer id){
        return membershipRepository.findById(id).get();
    }

    public String updateMember(Integer id, membership member){
        Optional<membership> mem1 = membershipRepository.findById(id);
        if (mem1.isPresent()) {
            membership originalMember = mem1.get();
            originalMember.setName(member.getName());
            originalMember.setAddress(member.getAddress());
            originalMember.setAge(member.getAge());
            originalMember.setGender(member.getGender());
            originalMember.setDuration(member.getDuration());
            originalMember.setContactnumber(member.getContactnumber());
            originalMember.setFeespaid(member.getFeespaid());
            originalMember.setFeespaiddate(member.getFeespaiddate());
            originalMember.setGoal(member.getGoal());
            originalMember.setHeight(member.getHeight());
            originalMember.setWeight(member.getWeight());
            originalMember.setMode(originalMember.getMode());
            originalMember.setSnacks(originalMember.getSnacks());
            originalMember.setTiming(originalMember.getTiming());
            originalMember.setReferredby(member.getReferredby());
            originalMember.setId(originalMember.getId());
            originalMember.setHipsize(originalMember.getHipsize());
            originalMember.setFeespending(originalMember.getFeespending());
            membershipRepository.save(originalMember);
            return "Membership updated successfully";
        }
        return null;
    }

    public String deleteMember(Integer id){
        membershipRepository.deleteById(id);
        return "Member deleted successfully";
    }

}
