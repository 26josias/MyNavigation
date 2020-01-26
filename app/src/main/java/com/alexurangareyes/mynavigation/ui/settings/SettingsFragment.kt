package com.alexurangareyes.mynavigation.ui.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.alexurangareyes.mynavigation.R
import com.alexurangareyes.mynavigation.databinding.SettingsFragmentBinding
import com.alexurangareyes.mynavigation.utils.MainObserver
import com.alexurangareyes.mynavigation.utils.observeEvent


class SettingsFragment : Fragment() {

    companion object {
        fun newInstance() =
            SettingsFragment()
    }

    private lateinit var binding: SettingsFragmentBinding

    private val viewModel: SettingsViewModel by viewModels {
        SettingsViewModel.Factory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("SettingsFragment", "onCreateView")
        binding = SettingsFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.i("SettingsFragment", "Lifecycle State is : ${lifecycle.currentState}")
        Log.i("SettingsFragment", "Owner onCreate Called")
        viewLifecycleOwner.lifecycle.addObserver(
            MainObserver(
                viewLifecycleOwner
            )
        )

        binding.btnWifi.setOnClickListener {
            viewModel.setInput(100)
        }

        viewModel.postalCode.observeEvent(viewLifecycleOwner) {
            binding.nameTextView.text = it.toString()
            Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment
            )
                .navigate(R.id.action_settingsFragment_to_wifiFragment)
        }
    }
}


