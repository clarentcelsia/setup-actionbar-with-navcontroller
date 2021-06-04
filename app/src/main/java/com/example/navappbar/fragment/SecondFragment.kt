package com.example.navappbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navappbar.R
import com.example.navappbar.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding2 : FragmentSecondBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val secondFragmentBinding = FragmentSecondBinding.inflate(inflater, container, false)
        binding2 = secondFragmentBinding
        return secondFragmentBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding2?.secondFragment = this

    }
}