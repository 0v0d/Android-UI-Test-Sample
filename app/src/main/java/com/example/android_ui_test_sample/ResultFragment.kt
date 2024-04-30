package com.example.android_ui_test_sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_ui_test_sample.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentResultBinding.inflate(inflater, container, false)
        val args = ResultFragmentArgs.fromBundle(requireArguments())
        binding.inputText = args.inputText
        return binding.root
    }
}