package cl.smu.rickmortytest.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import androidx.recyclerview.widget.LinearLayoutManager
import cl.smu.rickmortytest.databinding.FragmentHomeBinding
import cl.smu.rickmortytest.domain.GetCharactersUseCase
import cl.smu.rickmortytest.model.GetCharactersRepository
import cl.smu.rickmortytest.model.network.ApiService
import cl.smu.rickmortytest.ui.adapter.RickMortyAdapter
import cl.smu.rickmortytest.ui.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeCharacterModel()
        initRecycler()

    }

    private fun initRecycler() {
        val layoutManager = LinearLayoutManager(requireContext())
        binding.rvHome.layoutManager = layoutManager
    }

    private fun observeCharacterModel() {
        homeViewModel.getAll()
        homeViewModel.characterModel.observe(viewLifecycleOwner) { characterList ->
            binding.rvHome.adapter = RickMortyAdapter(characterList)
        }
    }
}
