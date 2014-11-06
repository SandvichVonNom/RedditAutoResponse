/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vonnom.redditautoresponse;

import com.github.jreddit.entity.Submission;
import com.github.jreddit.entity.User;
import com.github.jreddit.retrieval.Submissions;
import com.github.jreddit.retrieval.params.SubmissionSort;
import com.github.jreddit.utils.restclient.HttpRestClient;
import com.github.jreddit.utils.restclient.RestClient;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jscheel
 */
public class GetSubmissions {
    
    public static void main(String[] args) {
        
        // Initialize REST Client
        RestClient restClient = new HttpRestClient();
        restClient.setUserAgent("bot/1.0 by name");

        // Connect the user 
        User user = new User(restClient, "123dooor", "123door");
        try {
            user.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Handle to Submissions, which offers the basic API submission functionality
        Submissions subms = new Submissions(restClient, user);

        // Retrieve submissions of a submission
        List<Submission> submissionsSubreddit = subms.ofSubreddit("programming", SubmissionSort.NEW, -1, 100, null, null, true);
        
        System.out.println(Arrays.toString(submissionsSubreddit.toArray()));
        
    }
    
}
