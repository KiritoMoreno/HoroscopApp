package com.example.horoscopapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horoscopapp.databinding.FragmentHoroscopeBinding
import com.example.horoscopapp.domain.model.HoroscopeInfo
import com.example.horoscopapp.domain.model.HoroscopeInfo.*
import com.example.horoscopapp.domain.model.HoroscopeModel
import com.example.horoscopapp.ui.horoscope.adapter.HoroscopeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    private lateinit var horoscopeAdapter: HoroscopeAdapter

    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!
    private val horoscopeViewModel by viewModels<HoroscopeViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initUIState() {
        // we created a special courutine, is atached with the cicle of life of the fragment
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeViewModel.horoscope.collect {
                    //Changes inside the horoscope
                    horoscopeAdapter.updateList(it)
                }
            }
        }
    }

    private fun initList() {
        horoscopeAdapter = HoroscopeAdapter(
            onItemSelected = {
                val type = when(it){
                    Aquarius -> HoroscopeModel.Aquarius
                    Aries -> HoroscopeModel.Aries
                    Cancer -> HoroscopeModel.Cancer
                    Capricorn -> HoroscopeModel.Cancer
                    Gemini -> HoroscopeModel.Gemini
                    Leo -> HoroscopeModel.Leo
                    Libra -> HoroscopeModel.Libra
                    Pisces -> HoroscopeModel.Pisces
                    Sagittarius -> HoroscopeModel.Sagittarius
                    Scorpio -> HoroscopeModel.Scorpio
                    Taurus -> HoroscopeModel.Taurus
                    Virgo -> HoroscopeModel.Virgo
                }

                findNavController().navigate(
                    HoroscopeFragmentDirections.actionHoroscopeFragmentToHoroscopeDetailActivity(type)
                )
            }
        )

        binding.rvHoroscope.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = horoscopeAdapter
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }
}