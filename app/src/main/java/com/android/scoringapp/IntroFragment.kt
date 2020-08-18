package com.android.scoringapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.scoringapp.databinding.FragmentIntroBinding

/**
 * A simple [Fragment] subclass.
 */
class IntroFragment : Fragment() {
    private lateinit var dataBinding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        dataBinding.apply {
            return root
        }
    }
}