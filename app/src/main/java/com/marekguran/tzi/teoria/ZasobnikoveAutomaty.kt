package com.marekguran.tzi.teoria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.marekguran.tzi.databinding.FragmentZasobnikovyAutomatBinding

class ZasobnikoveAutomaty : Fragment() {
    private var binding: FragmentZasobnikovyAutomatBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZasobnikovyAutomatBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}