package cl.smu.rickmortytest.model.network

import cl.smu.rickmortytest.model.data.CharacterDetail

class CharacterProvider {
    companion object{
        var dataCharacter : List<CharacterDetail> = emptyList()
    }
}