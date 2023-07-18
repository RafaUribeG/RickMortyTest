package cl.smu.rickmortytest.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import cl.smu.rickmortytest.databinding.ItemApiBinding
import cl.smu.rickmortytest.model.data.CharacterDetail
import com.squareup.picasso.Picasso

class RickMortyViewHolder(val binding: ItemApiBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(dataCharacter : CharacterDetail){
        with(binding){
            tvNameCharacter.text = dataCharacter.name
            tvSpecies.text = dataCharacter.species
            tvStatus.text = dataCharacter.status
            Picasso.get().load(dataCharacter.url).into(myView)
        }
    }
}