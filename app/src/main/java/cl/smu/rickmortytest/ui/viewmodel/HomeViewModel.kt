package cl.smu.rickmortytest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.smu.rickmortytest.domain.GetCharactersUseCase
import cl.smu.rickmortytest.model.data.CharacterDetail
import kotlinx.coroutines.launch

class HomeViewModel(private val getCharactersUseCase: GetCharactersUseCase) : ViewModel() {
    val characterModel = MutableLiveData<List<CharacterDetail>>()

    fun getAll() {
        viewModelScope.launch {
            try {
                val result = getCharactersUseCase()
                characterModel.postValue(result)
            } catch (e: Exception) {
                // Manejo de errores, como mostrar un mensaje de error o registrar el error
                characterModel.postValue(emptyList())
            }
        }
    }
}