package pt.jp.springdatarest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import pt.jp.springdatarest.entities.Ad;

public interface AdRepository extends PagingAndSortingRepository<Ad, Long> {
}