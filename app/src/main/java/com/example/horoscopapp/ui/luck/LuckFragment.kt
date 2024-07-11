package com.example.horoscopapp.ui.luck

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import com.example.horoscopapp.R
import com.example.horoscopapp.databinding.FragmentLuckBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.Random


@AndroidEntryPoint
class LuckFragment : Fragment() {
    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
    }

    private fun initUI() {
        initListeners()
    }

    private fun initListeners() {
        binding.ivRoulette.setOnClickListener { spinRoulette() }
    }

    private fun spinRoulette() {
        val random = Random()
        // max that it will spin 1440 and min 360 ->
        val degrees = random.nextInt(1440) + 360
        val animator = ObjectAnimator.ofFloat(binding.ivRoulette, View.ROTATION, 0f,degrees.toFloat())
        animator.duration = 2000
        animator.interpolator = DecelerateInterpolator()  //it will start fast and it will finish slow
        animator.start()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false )
        // Inflate the layout for this fragment
        return binding.root
    }
}