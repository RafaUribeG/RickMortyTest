package cl.smu.rickmortytest.model.network

import cl.smu.rickmortytest.model.data.Character
import cl.smu.rickmortytest.model.data.CharacterDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiService {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiClient: ApiClient = retrofit.create(ApiClient::class.java)

    suspend fun getCharacters(): List<CharacterDetail> {
        return apiClient.getCharacters().body() ?: emptyList()
    }
}
