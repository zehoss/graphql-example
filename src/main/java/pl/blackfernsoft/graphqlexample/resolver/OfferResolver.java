package pl.blackfernsoft.graphqlexample.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.blackfernsoft.graphqlexample.entity.Offer;
import pl.blackfernsoft.graphqlexample.repository.OfferRepository;

@Component
public class OfferResolver implements GraphQLResolver<Offer> {
    private OfferRepository offerRepository;

    @Autowired
    public OfferResolver(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Iterable<Offer> getOffers() {
        return this.offerRepository.findAll();
    }

    public Offer getOffer(Long id) {
        return this.offerRepository.findById(id).orElse(null);
    }
}
