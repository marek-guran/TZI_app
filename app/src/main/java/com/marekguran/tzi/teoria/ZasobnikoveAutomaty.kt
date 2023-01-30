package com.marekguran.tzi.teoria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.marekguran.tzi.databinding.FragmentSlideshowBinding
import com.marekguran.tzi.ui.slideshow.SlideshowViewModel

class ZasobnikoveAutomaty : Fragment() {
    private var binding: FragmentSlideshowBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val slideshowViewModel = ViewModelProvider(this).get(
            SlideshowViewModel::class.java
        )
        binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}