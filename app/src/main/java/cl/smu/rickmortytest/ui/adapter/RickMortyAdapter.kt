package cl.smu.rickmortytest.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.smu.rickmortytest.databinding.ItemApiBinding
import cl.smu.rickmortytest.model.data.CharacterDetail

class RickMortyAdapter( val characterList: List<CharacterDetail>) :
    RecyclerView.Adapter<RickMortyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickMortyViewHolder {
        val binding = ItemApiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RickMortyViewHolder(binding)
    }

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(viewholder: RickMortyViewHolder, position: Int) {
        viewholder.bind(characterList[position])
    }
}