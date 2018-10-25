package pl.blackfernsoft.graphqlexample.repository;

import org.springframework.data.repository.CrudRepository;
import pl.blackfernsoft.graphqlexample.entity.Offer;

public interface OfferRepository extends CrudRepository<Offer, Long> {
}
