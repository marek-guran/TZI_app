package com.marekguran.tzi.teoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.marekguran.tzi.databinding.FragmentGramatikaBinding
import com.marekguran.tzi.ui.gramatika.GramatikaViewModel

class Gramatika : Fragment() {
    private var binding: FragmentGramatikaBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val gramatikaViewModel = ViewModelProvider(this).get(
            GramatikaViewModel::class.java
        )
        binding = FragmentGramatikaBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}