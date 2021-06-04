package com.example.navappbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navappbar.R
import com.example.navappbar.databinding.FragmentSecondBinding
import com.example.navappbar.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var binding3 : FragmentThirdBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val thirdFragmentBinding = FragmentThirdBinding.inflate(inflater, container, false)
        binding3 = thirdFragmentBinding
        return thirdFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding3?.thirdBinding = this

    }
}