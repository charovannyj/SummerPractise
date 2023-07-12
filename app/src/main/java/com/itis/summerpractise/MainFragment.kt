package com.itis.summerpractise

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.summerpractise.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding?.run{
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
            }
            btnToProfile.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_profileFragment)
            }
            btnToNews.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_newsFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}