package cl.smu.rickmortytest.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import cl.smu.rickmortytest.R
import cl.smu.rickmortytest.databinding.FragmentHomeBinding
import cl.smu.rickmortytest.ui.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    //ViewModel
    private lateinit var homeViewModel: HomeViewModel

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
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
    }

}