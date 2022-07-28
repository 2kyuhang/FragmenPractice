package com.nepplus.fragmenpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.fragmenpractice.R

//프레그먼트!
class FirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_first, container, false
        )
    }

    //프레그먼트의 동작 코드 작성
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}