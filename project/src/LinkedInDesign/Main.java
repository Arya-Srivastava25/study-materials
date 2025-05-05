package LinkedInDesign;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {

}

//Requirements -

// R1 : User should be able to create their profile
// R2 : User can search other users, jobs, groups, company
// R3 : User can send connection request to other users
// R4 : User can accept or ignore connection request received from other users
// R5 : Company can create their profile
// R6 : Company can add or delete job posts
// R7 : User can add post or delete post
// R8 : User can react or comment on other's post
// R9 : User can add or delete their education, skills, experience details
// R10 : System will send notifications whenever user send request to other or someone likes the post
// R11 : User can send messages to other user


// Class diagram

/*


 */


enum AccountStatus{
    ACTIVE,
    DEACTIVATED,
    BLOCKED,
    DELETED
}

enum ConnectionRequestStatus{
    ACCEPTED,
    PENDING,
    IGNORED
}

enum JobStatus{
    ACTIVE,
    ON_HOLD,
    DELETED
}

class Address{
    private int zipCode;
    private String street;
    private String city;
    private String state;
    private String country;
}
class Account{
    private String accountId;
    private String username;
    private String email;
    private String password;
    private AccountStatus accountStatus;
}

class Education{
    private String id;
    private String degree;
    private String university;
    private Date startDate;
    private Date endDate;
    private String description;
}

class Experience{
    private String id;
    private String role;
    private String company;
    private Date startDate;
    private Date endDate;
    private String description;
}

enum SkillLevel{
    BASIC,
    HANDS_ON,
    PROFICIENT;
}
class Skill{
    private String id;
    private String name;
    private SkillLevel skillLevel;
}
class Profile{
    private List<Byte> profilePhoto;
    private List<Byte> coverPhoto;
    private List<Education> educationDetails;
    private List<Experience> experienceDetails;
    private List<Skill> skills;
    public boolean addEducationDetails(Education education){
        //Write logic
        return true;
    }
    public boolean addExperience(Experience experience){
        //Write logic
        return true;
    }
    public boolean addSkill(Skill skill){
        //Write logic
        return true;
    }

}

abstract class Person{
    private Account account;
    private Profile profile;
    private Address address;
}

class User extends Person{
    private String userId;
    private String name;
    private List<User> connections;
    private List<User> followers;
    private List<Post> posts;
    private List<Company> followingCompanies;
    private List<Group> followingGroups;

    public boolean createPost(Post post){
        //Write logic
        return true;
    }

    public boolean deletePost(Post post){
        //Write logic
        return true;
    }
    public boolean sendConnectionRequest(ConnectionRequest connectionRequest){
        //Write logic
        return true;
    }

    public boolean cancelConnectionRequest(ConnectionRequest connectionRequest){
        //Write logic
        return true;
    }

    public boolean sendMessage(Message message){
        //Write logic
        return true;
    }

    public boolean createGroup(Group group){
        //Write logic
        return true;
    }

    public boolean joinGroup(Group group){
        //Write logic
        return true;
    }

    public boolean followUser(User user){
        //Write logic
        return true;
    }

    public boolean followCompany(Company company){
        //Write logic
        return true;
    }

    public boolean applyForJob(Job job){
        //Write logic
        return true;
    }

    public boolean react(Post post){
        //Write logic
        return true;
    }

    public boolean comment(Comment comment){
        //Write logic
        return true;
    }
}

class Comment{
    private String commentId;
    private User user;
    private Post post;
    private Comment comment;
    private int numberOfLikes;
}

class Job{
    private String jobId;
    private Date postedDate;
    private Company company;
    private String description;
    private List<User> appliedUser;
    private JobStatus jobStatus;
}
class Company{
    private String companyId;
    private String name;
    private int numberOfEmployees;
    private String description;
    private List<Job> jobs;

    private boolean createJobs(Job job){
        //Write logic
        return true;
    }
}

class Group{
    private String groupId;
    private String name;
    private String description;
}
class Message{
    private User sentFrom;
    private User sentTo;
    private Date date;
    private String description;
}

class ConnectionRequest{
    private User sender;
    private User receiver;
    private ConnectionRequestStatus connectionRequestStatus;
    private Date dateOfSending;

    public void acceptRequest(){
        //Write logic
    }
    public void ignoreRequest(){
        //Write logic
    }
}
class Post{
    private String postId;
    private User user;
    private String headline;
    private String description;
    private List<Byte> images;
    private int numberOfLikes;

}

interface Search{
    public List<User> searchUser(String name);
    public List<Company> searchCompany(String name);
    public List<Group> searchGroup(String name);
    public List<Job> searchJob(String title);
}

class SearchEngine implements Search{
    HashMap<String,List<User>> users;
    HashMap<String,List<Company>> companies;
    HashMap<String,List<Group>> group;
    HashMap<String,List<Job>> jobs;


    @Override
    public List<User> searchUser(String name) {
        //Write logic

        return null;
    }

    @Override
    public List<Company> searchCompany(String name) {
        //Write logic

        return null;
    }

    @Override
    public List<Group> searchGroup(String name) {
        //Write logic

        return null;
    }

    @Override
    public List<Job> searchJob(String title) {
        //Write logic

        return null;
    }
}

class NotificationService{
    private int id;
    private String content;

    public void sendNotification(){
        //Write logic
    }
}

