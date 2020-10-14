package com.example.navigation_kotlin

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation_kotlin.databinding.FragmentFirstBinding



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater
: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        binding.button.setOnClickListener{view ->
//            view.findNavController().navigate(R.id.secondFragment)
            val bundle : Bundle = Bundle()
            bundle.putString("nama", "Abdul Latif")
            view.findNavController().navigate(R.id.secondFragment, bundle)
        }

//        Navigation.findNavController(view)
        return binding.root
    }

}