package com.nepplus.fragmenpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.fragmenpractice.R
import kotlinx.android.synthetic.main.fragment_first.*

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
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //무조건 여기서만 이벤트가 가능
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //버튼 클릭시 토스트 출력

        toastBtn.setOnClickListener {
                            //프레그 먼트는 this가 아닌 requireContext() 를 해야한다!!
            Toast.makeText(requireContext(), "firstFrage입니다", Toast.LENGTH_SHORT)

        }
    }
}