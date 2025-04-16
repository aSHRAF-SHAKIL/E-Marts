package com.example.emarts.views.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.emarts.R
import com.example.emarts.databinding.FragmentRegisterBinding
import com.example.emarts.isEmpty

class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        setListener()
        return binding.root
    }

    private fun setListener() {
        with(binding){
            btnRegister.setOnClickListener{
                userNameET.isEmpty()
                emailET.isEmpty()
                passwardET.isEmpty()

                if(!userNameET.isEmpty() && !emailET.isEmpty() && !passwardET.isEmpty() ){
                    Toast.makeText(context,"All Input done !",Toast.LENGTH_LONG).show()
                }


            }
        }
    }


}