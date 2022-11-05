package lacerda.luhan.catapi.service;

import lacerda.luhan.catapi.config.exception.NotFoundException;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.repository.BreedRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class BreedService {
    private static final String ITEM_NAO_ENCONTRADO = "Não foi encontrado nenhum item com o id %s";

    private BreedRepository breedRepository;
    private BreedMapper breedMapper;

    public List<BreedDto> findAllBreeds() {
        return breedMapper.breedEntityToDto(breedRepository.findAll());
    }

    public BreedDto findBreedById(String id) {
        try {
            return breedMapper.breedEntityToDto(breedRepository.findById(id).orElseThrow(NotFoundException::new));
        } catch (NotFoundException e) {
            log.error(String.format(ITEM_NAO_ENCONTRADO, id));
            e.printStackTrace();
            throw e;
        }
    }

    public BreedDto save(BreedDto breedDto) {
        return breedMapper.breedEntityToDto(breedRepository.save(breedMapper.breedDtoToEntity(breedDto)));
    }

    public void deleteById(String id) {
        try {
            breedRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            log.error(String.format(ITEM_NAO_ENCONTRADO, id));
            e.printStackTrace();
            throw new NotFoundException(e);
        }
    }
}
