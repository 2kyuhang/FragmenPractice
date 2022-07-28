package com.nepplus.fragmenpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.fragmenpractice.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_third.*

//프레그먼트!
class ThirdFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_third, container, false
        )
    }

    //프레그먼트의 동작 코드 작성
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn3.setOnClickListener {
            //프레그 먼트는 this가 아닌 requireContext() 를 해야한다!!
            Toast.makeText(requireContext(), "firstFrage입니다", Toast.LENGTH_SHORT)

        }

    }
}