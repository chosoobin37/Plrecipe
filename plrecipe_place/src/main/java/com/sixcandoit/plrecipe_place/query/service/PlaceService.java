package com.sixcandoit.plrecipe_place.query.service;

import com.sixcandoit.plrecipe_place.query.dto.*;
import com.sixcandoit.plrecipe_place.query.aggregate.Place;

import java.util.List;
import java.util.Map;

public interface PlaceService {
    List<SearchPlaceDTO> getSearchPlaceByAPI(String keyword);
    List<Place> selectAllPlace();
    List<Place> selectPlaceById(int placeId);
    List<Place> selectPlaceByFilter(Map<String, Object> filter);

    CourseAndPlaceDTO selectCoursePlaceByCourseId(int courseId);
    List<CourseDTO> selectCourseByMember(int memberId);
    List<Place> getPlacesByCourseName(int courseId);

    List<PlaceStarDTO> selectStarByPlace(int placeId);
    List<PlaceStarDTO> selectStarByMember(int memberId);
}
