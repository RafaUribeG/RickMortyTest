package cl.smu.rickmortytest.model

data class Character(
    val info: Info,
    val characterDetails: List<CharacterDetail>
)