package com.portfolio.profile_backend.dto.APIResponse;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class LtcResponse {
    public static class Badge{
        public String id;
        public String displayName;
        public String icon;
        public String creationDate;
    }
    public static class ContestRanking{
        public int attendedContestsCount;
        public double rating;
        public int globalRanking;
        public int totalParticipants;
        public double topPercentage;
        public Object badge;
    }
    public static class Profile{
        public String realName;
        public String aboutMe;
        public String userAvatar;
        public String location;
        public ArrayList<String> skillTags;
        public ArrayList<Object> websites;
        public Object company;
        public Object school;
        public double starRating;
    }
    public static class RecentSubmission{
        public String title;
        public String titleSlug;
        public String timestamp;
        public String statusDisplay;
        public String lang;
        public String runtime;
        public String memory;
        public String url;
        public String __typename;
    }
    public static class Root{
        public String username;
        public int totalSolved;
        public int totalSubmissions;
        public int totalQuestions;
        public int easySolved;
        public int totalEasy;
        public int mediumSolved;
        public int totalMedium;
        public int hardSolved;
        public int totalHard;
        public int ranking;
        public int contributionPoints;
        public int reputation;
        public ArrayList<RecentSubmission> recentSubmissions;
        public Profile profile;
        public ArrayList<Badge> badges;
        public ContestRanking contestRanking;
    }
}
