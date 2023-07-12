package com.itis.summerpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.itis.summerpractise.databinding.FragmentDataBinding
import com.itis.summerpractise.databinding.FragmentNewsBinding

class DataFragment : Fragment(R.layout.fragment_data) {
    private var binding: FragmentDataBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDataBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}