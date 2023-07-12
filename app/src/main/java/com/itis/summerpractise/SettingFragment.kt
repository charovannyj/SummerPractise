package com.itis.summerpractise

import android.os.Bundle
import android.text.style.TtsSpan.ARG_TEXT
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.itis.summerpractise.ProfileFragment.Companion.ARG_COUNTRY
import com.itis.summerpractise.ProfileFragment.Companion.ARG_ICON
import com.itis.summerpractise.ProfileFragment.Companion.ARG_ID
import com.itis.summerpractise.ProfileFragment.Companion.ARG_NAME
import com.itis.summerpractise.databinding.FragmentSettingsBinding

class SettingFragment: Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        val id = arguments?.getInt(ARG_ID, -1)
        val text = arguments?.getString(ARG_ICON, "")
        val name = arguments?.getString(ARG_NAME, "")
        val country = arguments?.getString(ARG_COUNTRY, "")
        // Используйте извлеченные данные для обновления иконки и текста
        binding?.textView?.text = id.toString()
        binding?.text?.text = name.toString()
        binding?.text2?.text = country.toString()
        val imageView = binding?.image
        if (imageView != null) {
            Glide.with(this)
                .load(text)
                .into(imageView)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}