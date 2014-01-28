package demo2.service;

import java.util.List;

import domain.Course;

/**
 * Training schedule interface. Only one method available to list course
 * schedule at a given location.
 * 
 * @author Paul Chapman
 */
public interface TrainingSchedule {

	/**
	 * Get courses for specified location.
	 * 
	 * @param location
	 *            Where to look: an Australian capital city and/or state (or
	 *            null to fetch all courses).
	 * 
	 * @return A non-null list of courses, that may be empty.
	 */
	List<Course> getCourses(String location);
}
