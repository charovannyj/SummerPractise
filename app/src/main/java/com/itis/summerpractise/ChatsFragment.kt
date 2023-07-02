package com.itis.summerpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.itis.summerpractise.databinding.FragmentChatsBinding
import com.itis.summerpractise.databinding.FragmentProfileBinding

class ChatsFragment : Fragment(R.layout.fragment_chats) {
    private var binding: FragmentChatsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}