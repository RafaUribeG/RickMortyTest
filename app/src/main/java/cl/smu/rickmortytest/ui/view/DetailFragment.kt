package cl.smu.rickmortytest.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.smu.rickmortytest.R
import cl.smu.rickmortytest.databinding.FragmentHomeBinding
import cl.smu.rickmortytest.ui.viewmodel.DetailViewModel

class DetailFragment : Fragment() {


    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
    }
    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[DetailViewModel::class.java]
    }

}