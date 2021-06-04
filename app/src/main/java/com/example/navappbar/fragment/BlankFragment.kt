package com.example.navappbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navappbar.R
import com.example.navappbar.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var binding: FragmentBlankBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentBlankBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.blankFragment = this

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun onClick(){
        //action
        findNavController().navigate(R.id.action_blankFragment_to_secondFragment)
    }

    fun onClick2(){
        //action
        findNavController().navigate(R.id.action_blankFragment_to_thirdFragment)
    }

}