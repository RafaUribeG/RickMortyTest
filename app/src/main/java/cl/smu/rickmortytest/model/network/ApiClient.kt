package cl.smu.rickmortytest.model.network

import cl.smu.rickmortytest.model.data.Character
import cl.smu.rickmortytest.model.data.CharacterDetail
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient{
    @GET("character")
    suspend fun getCharacters() : Response <List<CharacterDetail>>
}