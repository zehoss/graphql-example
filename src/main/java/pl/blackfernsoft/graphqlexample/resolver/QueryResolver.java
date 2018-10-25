package pl.blackfernsoft.graphqlexample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.blackfernsoft.graphqlexample.entity.Animal;
import pl.blackfernsoft.graphqlexample.entity.Offer;
import pl.blackfernsoft.graphqlexample.entity.Pet;
import pl.blackfernsoft.graphqlexample.repository.OfferRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private OfferRepository offerRepository;

    @Autowired
    public QueryResolver(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<>();

        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("name of a pet");
        pet.setType(Animal.CAT);
        pet.setAge(2);

        pets.add(pet);

        return pets;
    }

    public Iterable<Offer> getOffers() {
        return this.offerRepository.findAll();
    }

    public Offer getOffer(Long id) {
        return this.offerRepository.findById(id).orElse(null);
    }
}
