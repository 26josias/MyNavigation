package com.alexurangareyes.mynavigation.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.alexurangareyes.mynavigation.R
import com.alexurangareyes.mynavigation.databinding.HomeFragmentBinding
import com.alexurangareyes.mynavigation.utils.observeEvent


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() =
            HomeFragment()
    }

    private lateinit var binding: HomeFragmentBinding

    private val viewModel: HomeViewModel by viewModels {
        HomeViewModel.Factory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("HomeFragment", "onCreateView")
        binding = HomeFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("HomeFragment", "Owner onCreate Called")
        binding.btnSettings.setOnClickListener {
            viewModel.setInput("setOnClickListener")
        }

        viewModel.nameUser.observeEvent(viewLifecycleOwner) {
            binding.nameTextView.text = it
            Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment
            ).navigate(R.id.action_homeFragment_to_settingsFragment)
        }
    }

}
