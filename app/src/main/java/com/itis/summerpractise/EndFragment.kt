package com.itis.summerpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.itis.summerpractise.databinding.FragmentEndBinding
import com.itis.summerpractise.databinding.FragmentNewsBinding

class EndFragment : Fragment(R.layout.fragment_end) {
    private var binding: FragmentEndBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEndBinding.bind(view)
        val tex = arguments?.getString("name")?:""
        binding?.root?.let { Snackbar.make(it, tex, Snackbar.LENGTH_LONG).show() }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}