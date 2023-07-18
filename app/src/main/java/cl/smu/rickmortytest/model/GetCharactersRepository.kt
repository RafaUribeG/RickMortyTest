package cl.smu.rickmortytest.model

import cl.smu.rickmortytest.model.data.CharacterDetail
import cl.smu.rickmortytest.model.network.ApiService
import cl.smu.rickmortytest.model.network.CharacterProvider

class GetCharactersRepository(private val apiService: ApiService) {

    suspend fun getCharacters(): List<CharacterDetail> {
        return apiService.getCharacters()
    }
}
