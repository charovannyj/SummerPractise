package com.itis.summerpractise

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.itis.summerpractise.databinding.FragmentSettingsBinding

class SettingFragment: Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}