package com.testora.service;
import com.testora.dao.SubmissionDAO; import com.testora.model.Submission; import java.util.*; import java.util.stream.*;
/** Stream-based progress and leaderboard calculations. */
public class AnalyticsService {private final SubmissionDAO dao=new SubmissionDAO();public Map<String,Long> verdictCounts(long user)throws Exception{return dao.byUser(user).stream().collect(Collectors.groupingBy(Submission::verdict,TreeMap::new,Collectors.counting()));} // SYLLABUS: groupingBy TreeMap
 public List<Submission> page(long user,int page,int size)throws Exception{return dao.byUser(user).stream().skip((long)page*size).limit(size).toList();} // SYLLABUS: pagination
}
