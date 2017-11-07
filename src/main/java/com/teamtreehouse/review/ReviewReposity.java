package com.teamtreehouse.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kylebudd on 10/27/17.
 */
public interface ReviewReposity extends PagingAndSortingRepository<Review, Long> {
}
