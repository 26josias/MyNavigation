package com.alexurangareyes.mynavigation.ui.wifi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.alexurangareyes.mynavigation.R


class WifiFragment : Fragment() {

    companion object {
        fun newInstance() =
            WifiFragment()
    }

    private lateinit var viewModel: WifiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("WifiFragment", "onCreateView")
        return inflater.inflate(R.layout.wifi_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WifiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
