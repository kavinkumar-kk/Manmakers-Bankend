package com.example.manmakers.controller;
import java.util.List;
import com.example.manmakers.entity.membership;
import com.example.manmakers.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MembershipController {


    @Autowired
    private MembershipService membershipService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/membership")
    public List<membership> getMemberships(){
        return membershipService.getMemberships();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/createMembership", method = RequestMethod.POST)
    public String createMemberships(@RequestBody membership member){
        return membershipService.createMemberships(member);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/getMember/{id}", method = RequestMethod.GET)
    public membership getMember(@PathVariable("id") Integer id){
        return membershipService.getMember(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/updateMember/{id}", method = RequestMethod.PUT)
    public String updateMember(@PathVariable("id") Integer id, @RequestBody membership member){
        return membershipService.updateMember(id, member);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/deleteMember/{id}", method = RequestMethod.DELETE)
    public String deleteMember(@PathVariable("id") Integer id){
        return membershipService.deleteMember(id);
    }
}
