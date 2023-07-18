package cl.smu.rickmortytest.domain

import cl.smu.rickmortytest.model.GetCharactersRepository
import cl.smu.rickmortytest.model.data.CharacterDetail

class GetCharactersUseCase(private val repository: GetCharactersRepository) {

    suspend operator fun invoke(): List<CharacterDetail> {
        return repository.getCharacters()
    }
}
