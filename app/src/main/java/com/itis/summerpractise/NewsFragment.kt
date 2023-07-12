package com.itis.summerpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.itis.summerpractise.databinding.FragmentNewsBinding

class NewsFragment : Fragment(R.layout.fragment_news) {
    private var binding: FragmentNewsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewsBinding.bind(view)
        binding?.run{
            btnNew.setOnClickListener {
                findNavController().navigate(R.id.action_newsFragment_to_endFragment, bundleOf("name" to "NewsFragment"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}